package org.javaacademy.toyota.car.attributes;

public enum CruiseControl {
  TURN_ON("круиз контроль включен"),
  TURN_OFF("круиз контроль выключен");

  private final String message;

  CruiseControl(String message) {
    this.message = message;
  }

  public String getMessage() {
    return message;
  }
}
