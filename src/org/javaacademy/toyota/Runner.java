package org.javaacademy.toyota;

import org.javaacademy.toyota.car.component.Color;
import org.javaacademy.toyota.car.model.Camry;
import org.javaacademy.toyota.car.model.Dyna;
import org.javaacademy.toyota.car.model.Hiance;
import org.javaacademy.toyota.car.model.Solara;
import org.javaacademy.toyota.dealernetwork.Buyer;
import org.javaacademy.toyota.dealernetwork.Cashier;
import org.javaacademy.toyota.dealernetwork.Manager;
import org.javaacademy.toyota.exception.CountyFactoryNotEqualException;
import org.javaacademy.toyota.factories.Conveyor;
import org.javaacademy.toyota.factories.Country;
import org.javaacademy.toyota.factories.Factory;
import org.javaacademy.toyota.warehouse.Warehouse;

public class Runner {

    public static void main(String[] args) throws CountyFactoryNotEqualException {
//    Wheel wheelCamry = new Wheel(WheelCarModel.CAMRY, false);
//    Wheel wheelCamryPunctured = new Wheel(WheelCarModel.CAMRY, true);
//    Wheel wheelDyna = new Wheel(WheelCarModel.DYNA, false);
//    Wheel wheelHiance = new Wheel(WheelCarModel.HIANCE, false);
//    Wheel wheelSolara = new Wheel(WheelCarModel.SOLARA, false);
//
//    Camry camry = new Camry(Country.JAPAN, Color.BLACK, 10000, TransmissionType.AUTOMATIC,
//        new Wheel[]{wheelCamry, wheelCamryPunctured, wheelCamry}, new FuelTank(0),
//        new Engine(true), new Electrics(true), new Headlight(true),
//        240);
//
//    try {
//      camry.startMoving();
//    } catch (StartCarException e) {
//      System.out.println(e.getMessage());
//    }
//    System.out.println(camry.isStateOfMotion());
//    camry.turnOnHeadlight();
//    camry.turnOnCruiseControl();
//    System.out.println(camry.getConditionCruiseControl());
//

        Warehouse warehouse = new Warehouse();
        Factory factory = new Factory(Country.JAPAN);
        Conveyor conveyor = new Conveyor(Country.JAPAN);
        conveyor.setFactory(factory);
        Camry camry = conveyor.createCamry(Color.BLACK, 10000);
        Solara solara = conveyor.createSolara(Color.WHITE, 12000);
        Hiance hiance = conveyor.createHiance(Color.BLACK, 15000);
        Dyna dyna = conveyor.createDyna(Color.BLACK, 22000);
        warehouse.addCamry(camry);
        warehouse.addDyna(dyna);
        warehouse.addHiance(hiance);
        warehouse.addSolara(solara);

        Manager manager = new Manager("Ivan");
        manager.setConveyor(conveyor);
        Cashier cashier = new Cashier();

        Buyer buyer1 = new Buyer("Первый", 10000);
        cashier.acceptsCarForSale(manager.sellCar(buyer1, warehouse));
        Buyer buyer2 = new Buyer("Второй", 12000);
        cashier.acceptsCarForSale(manager.sellCar(buyer2, warehouse));
        Buyer buyer3 = new Buyer("Третий", 15000);
        cashier.acceptsCarForSale(manager.sellCar(buyer3, warehouse));
        Buyer buyer4 = new Buyer("Четвертый", 22000);
        cashier.acceptsCarForSale(manager.sellCar(buyer4, warehouse));
        Buyer buyer5 = new Buyer("Пятый", 11000);
        cashier.acceptsCarForSale(manager.sellCar(buyer5, warehouse));
        Buyer buyer6 = new Buyer("Шестой", 13000);
        cashier.acceptsCarForSale(manager.sellCar(buyer6, warehouse));
        Buyer buyer7 = new Buyer("Седьмой", 8000);
        cashier.acceptsCarForSale(manager.sellCar(buyer7, warehouse));
        Buyer buyer8 = new Buyer("Восьмой", 30000);
        cashier.acceptsCarForSale(manager.sellCar(buyer8, warehouse));
        System.out.println(cashier.getTotalAmount());


    }
}