package org.javaacademy.toyota.factories;

public enum Country {
  RUSSIA("Россия"),
  CHINA("Китай"),
  JAPAN("Япония");

  private String name;

  Country(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }
}
