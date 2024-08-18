package org.javaacademy.toyota.car.attributes;

public enum RoofOfCabriolet {
  LOWER("крыша опущена"),
  UPPER("крыша поднята");

  private final String message;

  RoofOfCabriolet(String message) {
    this.message = message;
  }

  public String getMessage() {
    return message;
  }
}
