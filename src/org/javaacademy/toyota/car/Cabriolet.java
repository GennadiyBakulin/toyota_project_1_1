package org.javaacademy.toyota.car;

import org.javaacademy.toyota.car.attributes.RoofOfCabriolet;

public abstract class Cabriolet extends Car {

  private RoofOfCabriolet conditionRoof;

  public void lowerRoof() {
    this.conditionRoof = RoofOfCabriolet.LOWER;
  }

  public void raiseRoof() {
    this.conditionRoof = RoofOfCabriolet.UPPER;
  }

  public RoofOfCabriolet getConditionRoof() {
    return conditionRoof;
  }
}
