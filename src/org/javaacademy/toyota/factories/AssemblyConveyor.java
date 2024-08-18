package org.javaacademy.toyota.factories;

import org.javaacademy.toyota.car.attributes.Color;
import org.javaacademy.toyota.car.attributes.TransmissionType;
import org.javaacademy.toyota.car.attributes.WheelCarModel;
import org.javaacademy.toyota.car.model.Camry;
import org.javaacademy.toyota.car.model.Dyna;
import org.javaacademy.toyota.car.model.Hiance;
import org.javaacademy.toyota.car.model.Solara;
import org.javaacademy.toyota.exception.CountyFactoryNotEqualException;

public class AssemblyConveyor {

  private Country country;
  private FactoryForProductionOfParts factory;

  public AssemblyConveyor(Country country) {
    this.country = country;
  }

  public void setFactory(FactoryForProductionOfParts factory)
      throws CountyFactoryNotEqualException {
    if (country != factory.getCountry()) {
      throw new CountyFactoryNotEqualException("Конвейер не может быть запущен,\n"
          + " не совпали страны расположения конвейера и фабрики по производству деталей.\n"
          + "Ковейер расположен в " + country.getName()
          + "Фабрика по производтсву деталей расположена в " + factory.getCountry().getName());
    }
    this.factory = factory;
  }

  public void createCamry(Color color, double price) {
    if (factory != null) {
      Camry camry = new Camry(factory.createFuelTank(), factory.createEngine(),
          factory.createElectrics(), factory.createHeadlight(),
          factory.createWheel(WheelCarModel.CAMRY));
      camry.setTransmission(TransmissionType.AUTOMATIC);
      camry.setMaxSpeed(240);
      camry.setColor(color);
      camry.setPrice(price);
    } else {
      System.out.println("не задана фабрика по производству деталей");
    }
  }

  public void createSolara(Color color, double price) {
    if (factory != null) {
      Solara solara = new Solara(factory.createFuelTank(), factory.createEngine(),
          factory.createElectrics(), factory.createHeadlight(),
          factory.createWheel(WheelCarModel.SOLARA));
      solara.setTransmission(TransmissionType.ROBOT);
      solara.setMaxSpeed(210);
      solara.setColor(color);
      solara.setPrice(price);
    } else {
      System.out.println("не задана фабрика по производству деталей");
    }
  }

  public void createHiance(Color color, double price) {
    if (factory != null) {
      Hiance hiance = new Hiance(factory.createFuelTank(), factory.createEngine(),
          factory.createElectrics(), factory.createHeadlight(),
          factory.createWheel(WheelCarModel.HIANCE));
      hiance.setTransmission(TransmissionType.MECHANICS);
      hiance.setMaxSpeed(190);
      hiance.setColor(color);
      hiance.setPrice(price);
    } else {
      System.out.println("не задана фабрика по производству деталей");
    }
  }

  public void createDyna(Color color, double price) {
    if (factory != null) {
      Dyna dyna = new Dyna(factory.createFuelTank(), factory.createEngine(),
          factory.createElectrics(), factory.createHeadlight(),
          factory.createWheel(WheelCarModel.DYNA));
      dyna.setTransmission(TransmissionType.MECHANICS);
      dyna.setMaxSpeed(190);
      dyna.setColor(color);
      dyna.setPrice(price);
    } else {
      System.out.println("не задана фабрика по производству деталей");
    }
  }
}
