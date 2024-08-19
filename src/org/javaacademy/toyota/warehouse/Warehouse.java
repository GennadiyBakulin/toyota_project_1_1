package org.javaacademy.toyota.warehouse;

import org.javaacademy.toyota.car.model.Camry;
import org.javaacademy.toyota.car.model.Dyna;
import org.javaacademy.toyota.car.model.Hiance;
import org.javaacademy.toyota.car.model.Solara;

import java.util.ArrayList;
import java.util.List;

public class Warehouse {

    private static final int MAX_TOTAL_COUNT_CAR = 1000;
    public static int totalCountCar = 0;
    private final List<Camry> camries = new ArrayList<>();
    private final List<Solara> solaras = new ArrayList<>();
    private final List<Hiance> hiances = new ArrayList<>();
    private final List<Dyna> dynas = new ArrayList<>();

    public void addCamry(Camry camry) {
        if (isFreeSpaceOnWarehouse()) {
            camries.add(camry);
            totalCountCar++;
        }
    }

    public void addSolara(Solara solara) {
        if (isFreeSpaceOnWarehouse()) {
            solaras.add(solara);
            totalCountCar++;
        }
    }

    public void addHiance(Hiance hiance) {
        if (isFreeSpaceOnWarehouse()) {
            hiances.add(hiance);
            totalCountCar++;
        }
    }

    public void addDyna(Dyna dyna) {
        if (isFreeSpaceOnWarehouse()) {
            dynas.add(dyna);
            totalCountCar++;
        }
    }

    public Camry takeCamry(Camry camry) {
        camries.removeIf(car -> car == camry);
        totalCountCar--;
        return camry;
    }

    public Solara takeSolara(Solara solara) {
        solaras.removeIf(car -> car == solara);
        totalCountCar--;
        return solara;
    }

    public Hiance takeHiance(Hiance hiance) {
        hiances.removeIf(car -> car == hiance);
        totalCountCar--;
        return hiance;
    }

    public Dyna takeDyna(Dyna dyna) {
        dynas.removeIf(car -> car == dyna);
        totalCountCar--;
        return dyna;
    }

    private boolean isFreeSpaceOnWarehouse() {
        if (totalCountCar < MAX_TOTAL_COUNT_CAR) {
            return true;
        }
        System.out.println("Не получилось добавить на склад машину! Склад заполнен!");
        return false;
    }

    public void printCountCamries() {
        System.out.println("На складе в наличии Camry - " + camries.size());
    }

    public void printCountSolaras() {
        System.out.println("На складе в наличии Solara - " + solaras.size());
    }

    public void printCountHiances() {
        System.out.println("На складе в наличии Hiance - " + hiances.size());
    }

    public void printCountDynas() {
        System.out.println("На складе в наличии Dyna - " + dynas.size());
    }

    public List<Camry> getCamries() {
        return camries;
    }

    public List<Solara> getSolaras() {
        return solaras;
    }

    public List<Hiance> getHiances() {
        return hiances;
    }

    public List<Dyna> getDynas() {
        return dynas;
    }
}
