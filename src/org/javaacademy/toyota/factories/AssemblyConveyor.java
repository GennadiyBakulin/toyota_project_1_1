package org.javaacademy.toyota.factories;

import org.javaacademy.toyota.car.component.Color;
import org.javaacademy.toyota.car.component.TransmissionType;
import org.javaacademy.toyota.car.component.WheelCarModel;
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

  public Camry createCamry(Color color, double price) {
    return new Camry(country, color, price, TransmissionType.AUTOMATIC,
        factory.createWheel(WheelCarModel.CAMRY), factory.createFuelTank(),
        factory.createEngine(), factory.createElectrics(),
        factory.createHeadlight(), 240);
  }

  public Solara createSolara(Color color, double price) {
    return new Solara(country, color, price, TransmissionType.ROBOT,
        factory.createWheel(WheelCarModel.SOLARA), factory.createFuelTank(),
        factory.createEngine(), factory.createElectrics(),
        factory.createHeadlight(), 210);
  }

  public Hiance createHiance(Color color, double price) {
    return new Hiance(country, color, price, TransmissionType.MECHANICS,
        factory.createWheel(WheelCarModel.HIANCE), factory.createFuelTank(),
        factory.createEngine(), factory.createElectrics(),
        factory.createHeadlight(), 190);
  }

  public Dyna createDyna(Color color, double price) {
    return new Dyna(country, color, price, TransmissionType.MECHANICS,
        factory.createWheel(WheelCarModel.DYNA), factory.createFuelTank(),
        factory.createEngine(), factory.createElectrics(),
        factory.createHeadlight(), 190);
  }
}
