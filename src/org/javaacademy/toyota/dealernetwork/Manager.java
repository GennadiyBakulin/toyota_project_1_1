package org.javaacademy.toyota.dealernetwork;

import org.javaacademy.toyota.car.Car;
import org.javaacademy.toyota.car.component.Color;
import org.javaacademy.toyota.factories.Conveyor;
import org.javaacademy.toyota.report.Guide;
import org.javaacademy.toyota.report.Report;
import org.javaacademy.toyota.warehouse.Warehouse;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Manager {

    private final String name;
    private final Report report = new Report();

    public Manager(String name) {
        this.name = name;
    }

    Conveyor conveyor;

    public void setConveyor(Conveyor conveyor) {
        this.conveyor = conveyor;
    }

    public Car sellCar(Buyer buyer, Warehouse warehouse) {
        double amount = buyer.getAmount();

        if (Warehouse.totalCountCar == 0) {
            if (amount >= 22000) {
                return conveyor.createDyna(Color.BLACK, amount);
            }
            if (amount >= 15000) {
                return conveyor.createHiance(Color.BLACK, amount);
            }
            if (amount >= 12000) {
                return conveyor.createSolara(Color.WHITE, amount);
            }
            if (amount >= 10000) {
                return conveyor.createCamry(Color.BLACK, amount);
            }
            return null;
        }

        if (!warehouse.getDynas().isEmpty() && warehouse.getDynas().get(0).getPrice() <= amount) {
            return warehouse.takeDyna(warehouse.getDynas().get(0));
        }
        if (!warehouse.getHiances().isEmpty() && warehouse.getHiances().get(0).getPrice() <= amount) {
            return warehouse.takeHiance(warehouse.getHiances().get(0));
        }
        if (!warehouse.getSolaras().isEmpty() && warehouse.getSolaras().get(0).getPrice() <= amount) {
            return warehouse.takeSolara(warehouse.getSolaras().get(0));
        }
        if (!warehouse.getCamries().isEmpty() && warehouse.getCamries().get(0).getPrice() <= amount) {
            return warehouse.takeCamry(warehouse.getCamries().get(0));
        }
        report.addCarList(warehouse.takeCamry(warehouse.getCamries().get(0)));
        return null;
    }

    public void generateReport() {
        List<Car> carList = report.getCarList();

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("report.txt"))) {
            for (Car car : carList) {
                String str = "";
                switch (car.getClass().getName()) {
                    case "Camry" -> {
                        str = "Camry" + "стоимость продажи" + Guide.CAMRY.getCostPrice();
                    }
                    case "Solara" -> {
                        str = "Solara" + "стоимость продажи" + Guide.SOLARA.getCostPrice();
                    }
                    case "Hiance" -> {
                        str = "Hiance" + "стоимость продажи" + Guide.HIANCE.getCostPrice();
                    }
                    case "Dyna" -> {
                        str = "Dyna" + "стоимость продажи" + Guide.DYNA.getCostPrice();
                    }
                    default -> {
                    }
                }
                bw.write(str);
            }
            bw.write("Доходы" + "Расходы" + "Прибыль");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
