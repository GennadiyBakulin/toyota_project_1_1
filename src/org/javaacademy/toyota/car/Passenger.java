package org.javaacademy.toyota.car;

import org.javaacademy.toyota.car.attributes.CruiseControl;
import org.javaacademy.toyota.car.component.Electrics;
import org.javaacademy.toyota.car.component.Engine;
import org.javaacademy.toyota.car.component.FuelTank;
import org.javaacademy.toyota.car.component.Headlight;
import org.javaacademy.toyota.car.component.Wheel;

public abstract class Passenger extends Car {

  private CruiseControl conditionCruiseControl= CruiseControl.TURN_OFF;

  public void turnOnCruiseControl() {
    this.conditionCruiseControl = CruiseControl.TURN_ON;
  }

  public void turnOffCruiseControl() {
    this.conditionCruiseControl = CruiseControl.TURN_OFF;
  }

  public String getConditionCruiseControl() {
    return conditionCruiseControl.getMessage();
  }
}
