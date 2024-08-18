package org.javaacademy.toyota.warehouse;

import java.util.ArrayList;
import java.util.List;
import org.javaacademy.toyota.car.model.Camry;
import org.javaacademy.toyota.car.model.Dyna;
import org.javaacademy.toyota.car.model.Hiance;
import org.javaacademy.toyota.car.model.Solara;

public class Warehouse {

  private static final int MAX_TOTAL_COUNT_CAR = 1000;
  public static int totalCountCar = 0;
  private final List<Camry> camries = new ArrayList<>();
  private final List<Solara> solaras = new ArrayList<>();
  private final List<Hiance> hiances = new ArrayList<>();
  private final List<Dyna> dynas = new ArrayList<>();

  public void addCamry(Camry camry) {
    if (checkedFreeSpaceOnWarehouse()) {
      camries.add(camry);
      totalCountCar++;
    }
  }

  public void addSolara(Solara solara) {
    if (checkedFreeSpaceOnWarehouse()) {
      solaras.add(solara);
      totalCountCar++;
    }
  }

  public void addHiance(Hiance hiance) {
    if (checkedFreeSpaceOnWarehouse()) {
      hiances.add(hiance);
      totalCountCar++;
    }
  }

  public void addDyna(Dyna dyna) {
    if (checkedFreeSpaceOnWarehouse()) {
      dynas.add(dyna);
      totalCountCar++;
    }
  }

  public Camry takeCamry(Camry camry) {
    camries.removeIf(car -> car == camry);
    totalCountCar--;
    return camry;
  }

  public Solara takeSolara(Solara solara) {
    solaras.removeIf(car -> car == solara);
    totalCountCar--;
    return solara;
  }

  public Hiance takeHiance(Hiance hiance) {
    hiances.removeIf(car -> car == hiance);
    totalCountCar--;
    return hiance;
  }

  public Dyna takeDyna(Dyna dyna) {
    dynas.removeIf(car -> car == dyna);
    totalCountCar--;
    return dyna;
  }

  private boolean checkedFreeSpaceOnWarehouse() {
    if (totalCountCar < MAX_TOTAL_COUNT_CAR) {
      return true;
    }
    System.out.println("Не получилось добавить на склад машину! Склад заполнен!");
    return false;
  }

  public int countCamry() {
    return camries.size();
  }

  public int countSolara() {
    return solaras.size();
  }

  public int countHiance() {
    return hiances.size();
  }

  public int countDyna() {
    return dynas.size();
  }

  public List<Camry> getCamries() {
    return camries;
  }

  public List<Solara> getSolaras() {
    return solaras;
  }

  public List<Hiance> getHiances() {
    return hiances;
  }

  public List<Dyna> getDynas() {
    return dynas;
  }
}
