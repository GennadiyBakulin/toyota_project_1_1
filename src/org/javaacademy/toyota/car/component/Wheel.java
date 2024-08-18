package org.javaacademy.toyota.car.component;

public class Wheel {

  private boolean isPunctured;
  private final WheelCarModel wheelCarModel;

  public Wheel(WheelCarModel wheelCarModel, boolean isPunctured) {
    this.wheelCarModel = wheelCarModel;
    this.isPunctured = isPunctured;
  }

  public boolean isPunctured() {
    return isPunctured;
  }

  public void setPunctured(boolean punctured) {
    isPunctured = punctured;
  }

  public WheelCarModel getWheelCarModel() {
    return wheelCarModel;
  }
}
