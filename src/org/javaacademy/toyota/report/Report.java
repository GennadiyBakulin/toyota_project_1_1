package org.javaacademy.toyota.report;

import org.javaacademy.toyota.car.Car;

import java.util.ArrayList;
import java.util.List;

public class Report {

    private final List<Car> carList = new ArrayList<>();

    public void addCarList(Car car) {
        carList.add(car);
    }

    public List<Car> getCarList() {
        return carList;
    }
}
