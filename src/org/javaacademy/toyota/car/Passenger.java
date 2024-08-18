package org.javaacademy.toyota.car;

import org.javaacademy.toyota.car.attributes.Color;
import org.javaacademy.toyota.car.attributes.CruiseControl;
import org.javaacademy.toyota.car.attributes.TransmissionType;
import org.javaacademy.toyota.car.component.Electrics;
import org.javaacademy.toyota.car.component.Engine;
import org.javaacademy.toyota.car.component.FuelTank;
import org.javaacademy.toyota.car.component.Headlight;
import org.javaacademy.toyota.car.component.Wheel;
import org.javaacademy.toyota.factories.Country;

public abstract class Passenger extends Car {

  private CruiseControl conditionCruiseControl= CruiseControl.TURN_OFF;

  protected Passenger(Country country,
      Color color, double price,
      TransmissionType transmission, Wheel[] wheels,
      FuelTank fuelTank, Engine engine, Electrics electrics, Headlight headlight, int maxSpeed) {
    super(country, color, price, transmission, wheels, fuelTank, engine, electrics, headlight,
        maxSpeed);
  }

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
