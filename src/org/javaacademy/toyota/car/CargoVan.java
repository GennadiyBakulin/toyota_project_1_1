package org.javaacademy.toyota.car;

public abstract class CargoVan extends Car {

  private int cargoCapacity;

  public int getCargoCapacity() {
    return cargoCapacity;
  }

  public void setCargoCapacity(int cargoCapacity) {
    this.cargoCapacity = cargoCapacity;
  }
}
