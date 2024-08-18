package org.javaacademy.toyota.car.model;

import org.javaacademy.toyota.car.CargoVan;
import org.javaacademy.toyota.car.component.Electrics;
import org.javaacademy.toyota.car.component.Engine;
import org.javaacademy.toyota.car.component.FuelTank;
import org.javaacademy.toyota.car.component.Headlight;
import org.javaacademy.toyota.car.component.Wheel;

public class Dyna extends CargoVan {

  public Dyna(FuelTank fuelTank, Engine engine, Electrics electrics, Headlight headlight,
      Wheel[] wheels) {
    this.fuelTank = fuelTank;
    this.engine = engine;
    this.electrics = electrics;
    this.headlight = headlight;
    this.wheels = wheels;
  }

  public void chargePhone() {
    System.out.println("Телефон заряжается");
  }
}
