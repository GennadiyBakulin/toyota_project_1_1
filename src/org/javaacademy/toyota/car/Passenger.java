package org.javaacademy.toyota.car;

import org.javaacademy.toyota.car.attributes.CruiseControl;

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
