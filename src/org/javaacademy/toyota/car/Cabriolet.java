package org.javaacademy.toyota.car;

import org.javaacademy.toyota.car.component.Color;
import org.javaacademy.toyota.car.component.Electrics;
import org.javaacademy.toyota.car.component.Engine;
import org.javaacademy.toyota.car.component.FuelTank;
import org.javaacademy.toyota.car.component.Headlight;
import org.javaacademy.toyota.car.component.RoofOfCabriolet;
import org.javaacademy.toyota.car.component.TransmissionType;
import org.javaacademy.toyota.car.component.Wheel;
import org.javaacademy.toyota.factories.Country;

public abstract class Cabriolet extends Car {

    private RoofOfCabriolet conditionRoof;

    protected Cabriolet(Country country,
                        Color color, double price,
                        TransmissionType transmission,
                        Wheel[] wheels,
                        FuelTank fuelTank,
                        Engine engine,
                        Electrics electrics,
                        Headlight headlight, int maxSpeed) {
        super(country, color, price, transmission, wheels, fuelTank, engine, electrics, headlight,
                maxSpeed);
    }

    public void lowerRoof() {
        this.conditionRoof = RoofOfCabriolet.LOWER;
    }

    public void raiseRoof() {
        this.conditionRoof = RoofOfCabriolet.UPPER;
    }

    public RoofOfCabriolet getConditionRoof() {
        return conditionRoof;
    }
}
