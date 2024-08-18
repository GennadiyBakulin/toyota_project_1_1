package org.javaacademy.toyota.dealernetwork;

import org.javaacademy.toyota.car.Car;
import org.javaacademy.toyota.car.component.Color;
import org.javaacademy.toyota.factories.AssemblyConveyor;
import org.javaacademy.toyota.warehouse.Warehouse;

public class Manager {

  AssemblyConveyor conveyor;

  public void setConveyor(AssemblyConveyor conveyor) {
    this.conveyor = conveyor;
  }

  public Car sellCar(Buyer buyer, Warehouse warehouse) {
    double amount = buyer.getAmount();
    System.out.println(Warehouse.totalCountCar + buyer.getName());
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

    if (warehouse.countDyna() > 0 && warehouse.getDynas().get(0).getPrice() <= amount) {
      return warehouse.takeDyna(warehouse.getDynas().get(0));
    }
    if (warehouse.countHiance() > 0 && warehouse.getHiances().get(0).getPrice() <= amount) {
      return warehouse.takeHiance(warehouse.getHiances().get(0));
    }
    if (warehouse.countSolara() > 0 && warehouse.getSolaras().get(0).getPrice() <= amount) {
      return warehouse.takeSolara(warehouse.getSolaras().get(0));
    }
    if (warehouse.countCamry() > 0 && warehouse.getCamries().get(0).getPrice() <= amount) {
      return warehouse.takeCamry(warehouse.getCamries().get(0));
    }
    return null;
  }
}
