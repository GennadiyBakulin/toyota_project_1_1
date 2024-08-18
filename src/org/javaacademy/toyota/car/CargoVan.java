package org.javaacademy.toyota.car;

import org.javaacademy.toyota.car.attributes.Color;
import org.javaacademy.toyota.car.attributes.TransmissionType;
import org.javaacademy.toyota.car.component.Electrics;
import org.javaacademy.toyota.car.component.Engine;
import org.javaacademy.toyota.car.component.FuelTank;
import org.javaacademy.toyota.car.component.Headlight;
import org.javaacademy.toyota.car.component.Wheel;
import org.javaacademy.toyota.factories.Country;

public abstract class CargoVan extends Car {

  private int cargoCapacity;

  protected CargoVan(Country country,
      Color color, double price,
      TransmissionType transmission,
      Wheel[] wheels,
      FuelTank fuelTank,
      Engine engine,
      Electrics electrics,
      Headlight headlight, int maxSpeed) {
    super(country, color, price, transmission, wheels, fuelTank, engine, electrics, headlight,
        maxSpeed);
  }

  public void setCargoCapacity(int cargoCapacity) {
    this.cargoCapacity = cargoCapacity;
  }

  public int getCargoCapacity() {
    return cargoCapacity;
  }
}
