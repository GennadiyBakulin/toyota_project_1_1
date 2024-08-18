package org.javaacademy.toyota.car;

import java.util.Arrays;
import java.util.Objects;
import org.javaacademy.toyota.car.attributes.Color;
import org.javaacademy.toyota.car.attributes.TransmissionType;
import org.javaacademy.toyota.car.component.Electrics;
import org.javaacademy.toyota.car.component.Engine;
import org.javaacademy.toyota.car.component.FuelTank;
import org.javaacademy.toyota.car.component.Headlight;
import org.javaacademy.toyota.car.component.Wheel;
import org.javaacademy.toyota.exception.StartCarException;
import org.javaacademy.toyota.factories.Country;

public abstract class Car {
  private Country country;

  private Color color;
  private int maxSpeed;
  private boolean stateOfMotion;
  private double price;

  private TransmissionType transmission;
  protected Wheel[] wheels = new Wheel[4];
  protected FuelTank fuelTank;
  protected Engine engine;
  protected Electrics electrics;
  protected Headlight headlight;

  public void startMoving() throws StartCarException {
    String[] errorMessages = new String[0];

    if (Arrays.stream(wheels).anyMatch(Objects::isNull)) {
      errorMessages = addErrorMessage(errorMessages, "часть колес отсутствует");
    }
    if (Arrays.stream(wheels).filter(Objects::nonNull).anyMatch(Wheel::isPunctured)) {
      errorMessages = addErrorMessage(errorMessages, "есть проколотые колеса");
    }
    if (fuelTank.isEmptyFuelTank()) {
      errorMessages = addErrorMessage(errorMessages, "бензобак пустой");
    }
    if (!electrics.isFunctional()) {
      errorMessages = addErrorMessage(errorMessages, "электрика не работоспособна");
    }
    if (!engine.isFunctional()) {
      errorMessages = addErrorMessage(errorMessages, "двигатель не работоспособен");
    }

    if (errorMessages.length != 0) {
      throw new StartCarException(
          "Движение не возможно по причине -> " + String.join(", ", errorMessages));
    }

    this.stateOfMotion = true;
    System.out.println("Автомобиль начал движение!");
  }

  public void stopMoving() {
    this.stateOfMotion = false;
  }

  public void turnOnHeadlight() {
    if (headlight.isFunctional()) {
      System.out.println("Фары включены!");
    } else {
      System.out.println("Не получилось включить фары!");
    }
  }

  private String[] addErrorMessage(String[] array, String message) {
    int length = array.length;
    array = Arrays.copyOf(array, length + 1);
    array[length] = message;
    return array;
  }

  public Color getColor() {
    return color;
  }

  public void setColor(Color color) {
    this.color = color;
  }

  public int getMaxSpeed() {
    return maxSpeed;
  }

  public void setMaxSpeed(int maxSpeed) {
    this.maxSpeed = maxSpeed;
  }

  public boolean isStateOfMotion() {
    return stateOfMotion;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public TransmissionType getTransmission() {
    return transmission;
  }

  public void setTransmission(TransmissionType transmission) {
    this.transmission = transmission;
  }

  public void setWheels(Wheel[] wheels) {
    if (wheels.length > this.wheels.length) {
      System.out.println("На машину нельзя установить больше " + this.wheels.length + "колес!");
    } else {
      System.arraycopy(wheels, 0, this.wheels, 0, wheels.length);
    }
  }

  public Wheel[] getWheels() {
    return wheels;
  }

  public FuelTank getFuelTank() {
    return fuelTank;
  }

  public void setFuelTank(FuelTank fuelTank) {
    this.fuelTank = fuelTank;
  }

  public Engine getEngine() {
    return engine;
  }

  public void setEngine(Engine engine) {
    this.engine = engine;
  }

  public Electrics getElectrics() {
    return electrics;
  }

  public void setElectrics(Electrics electrics) {
    this.electrics = electrics;
  }

  public Headlight getHeadlight() {
    return headlight;
  }

  public void setHeadlight(Headlight headlight) {
    this.headlight = headlight;
  }

  public Country getCountry() {
    return country;
  }

  public void setCountry(Country country) {
    this.country = country;
  }
}
