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

  private final Country country;
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
      Camry camry = new Camry(country, color, price, TransmissionType.AUTOMATIC,
          factory.createWheel(WheelCarModel.CAMRY), factory.createFuelTank(),
          factory.createEngine(), factory.createElectrics(),
          factory.createHeadlight(), 240);
    } else {
      System.out.println("не задана фабрика по производству деталей");
    }
  }

  public void createSolara(Color color, double price) {
    if (factory != null) {

      Solara solara = new Solara(country, color, price, TransmissionType.ROBOT,
          factory.createWheel(WheelCarModel.SOLARA), factory.createFuelTank(),
          factory.createEngine(), factory.createElectrics(),
          factory.createHeadlight(), 210);
    } else {
      System.out.println("не задана фабрика по производству деталей");
    }
  }

  public void createHiance(Color color, double price) {
    if (factory != null) {
      Hiance hiance = new Hiance(country, color, price, TransmissionType.MECHANICS,
          factory.createWheel(WheelCarModel.HIANCE), factory.createFuelTank(),
          factory.createEngine(), factory.createElectrics(),
          factory.createHeadlight(), 190);
    } else {
      System.out.println("не задана фабрика по производству деталей");
    }
  }

  public void createDyna(Color color, double price) {
    if (factory != null) {
      Dyna dyna = new Dyna(country, color, price, TransmissionType.MECHANICS,
          factory.createWheel(WheelCarModel.DYNA), factory.createFuelTank(),
          factory.createEngine(), factory.createElectrics(),
          factory.createHeadlight(), 190);
    } else {
      System.out.println("не задана фабрика по производству деталей");
    }
  }
}
