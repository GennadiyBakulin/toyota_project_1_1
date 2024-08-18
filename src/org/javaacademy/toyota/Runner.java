package org.javaacademy.toyota;

import org.javaacademy.toyota.car.attributes.Color;
import org.javaacademy.toyota.car.attributes.TransmissionType;
import org.javaacademy.toyota.car.attributes.WheelCarModel;
import org.javaacademy.toyota.car.component.Electrics;
import org.javaacademy.toyota.car.component.Engine;
import org.javaacademy.toyota.car.component.FuelTank;
import org.javaacademy.toyota.car.component.Headlight;
import org.javaacademy.toyota.car.component.Wheel;
import org.javaacademy.toyota.car.model.Camry;
import org.javaacademy.toyota.exception.StartCarException;

public class Runner {

  public static void main(String[] args) {
    Wheel wheelCamry = new Wheel(WheelCarModel.CAMRY, false);
    Wheel wheelCamryPunctured = new Wheel(WheelCarModel.CAMRY, true);
    Wheel wheelDyna = new Wheel(WheelCarModel.DYNA, false);
    Wheel wheelHiance = new Wheel(WheelCarModel.HIANCE, false);
    Wheel wheelSolara = new Wheel(WheelCarModel.SOLARA, false);

    Camry camry = new Camry(new FuelTank(1), new Engine(true),
        new Electrics(true), new Headlight(true),
        new Wheel[]{wheelCamry, wheelCamry, wheelCamry, wheelCamry});
    camry.setColor(Color.RED);
    camry.setMaxSpeed(210);
    camry.setTransmission(TransmissionType.AUTOMATIC);
    try {
      camry.startMoving();
    } catch (StartCarException e) {
      System.out.println(e.getMessage());
    }
    System.out.println(camry.isStateOfMotion());
    camry.turnOnHeadlight();
    camry.turnOnCruiseControl();
    System.out.println(camry.getConditionCruiseControl());

  }
}