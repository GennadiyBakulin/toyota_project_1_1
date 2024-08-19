package org.javaacademy.toyota.car.model;

import org.javaacademy.toyota.car.CargoVan;
import org.javaacademy.toyota.car.component.Color;
import org.javaacademy.toyota.car.component.Electrics;
import org.javaacademy.toyota.car.component.Engine;
import org.javaacademy.toyota.car.component.FuelTank;
import org.javaacademy.toyota.car.component.Headlight;
import org.javaacademy.toyota.car.component.TransmissionType;
import org.javaacademy.toyota.car.component.Wheel;
import org.javaacademy.toyota.factories.Country;

public class Hiance extends CargoVan {

    private final int spareWheel = 1;

    public Hiance(Country country,
                  Color color, double price,
                  TransmissionType transmission, Wheel[] wheels,
                  FuelTank fuelTank, Engine engine, Electrics electrics, Headlight headlight, int maxSpeed) {
        super(country, color, price, transmission, wheels, fuelTank, engine, electrics, headlight,
                maxSpeed);
    }

    public int getSpareWheel() {
        return spareWheel;
    }
}
