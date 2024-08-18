package org.javaacademy.toyota.car.component;

public class Headlight {

  private boolean isFunctional;

  public Headlight(boolean isFunctional) {
    this.isFunctional = isFunctional;
  }

  public boolean isFunctional() {
    return isFunctional;
  }

  public void setFunctional(boolean functional) {
    isFunctional = functional;
  }
}
