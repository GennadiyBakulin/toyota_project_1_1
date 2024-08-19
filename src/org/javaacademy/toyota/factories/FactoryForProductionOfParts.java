package org.javaacademy.toyota.factories;

import org.javaacademy.toyota.car.component.Electrics;
import org.javaacademy.toyota.car.component.Engine;
import org.javaacademy.toyota.car.component.FuelTank;
import org.javaacademy.toyota.car.component.Headlight;
import org.javaacademy.toyota.car.component.Wheel;
import org.javaacademy.toyota.car.component.WheelCarModel;

public class FactoryForProductionOfParts {

    private final Country country;

    public FactoryForProductionOfParts(Country country) {
        this.country = country;
    }

    public Wheel[] createWheel(WheelCarModel wheelCarModel) {
        return new Wheel[]{
            new Wheel(wheelCarModel, false),
            new Wheel(wheelCarModel, false),
            new Wheel(wheelCarModel, false),
            new Wheel(wheelCarModel, false)
        };
    }

    public FuelTank createFuelTank() {
        return new FuelTank(0);
    }

    public Engine createEngine() {
        return new Engine(true);
    }

    public Electrics createElectrics() {
        return new Electrics(true);
    }

    public Headlight createHeadlight() {
        return new Headlight(true);
    }

    public Country getCountry() {
        return country;
    }
}
