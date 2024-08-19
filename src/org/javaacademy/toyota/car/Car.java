package org.javaacademy.toyota.car;

import org.javaacademy.toyota.car.component.Color;
import org.javaacademy.toyota.car.component.Electrics;
import org.javaacademy.toyota.car.component.Engine;
import org.javaacademy.toyota.car.component.FuelTank;
import org.javaacademy.toyota.car.component.Headlight;
import org.javaacademy.toyota.car.component.TransmissionType;
import org.javaacademy.toyota.car.component.Wheel;
import org.javaacademy.toyota.exception.StartCarException;
import org.javaacademy.toyota.factories.Country;

import java.util.Arrays;
import java.util.Objects;

public abstract class Car {

    private Country country;

    private Color color;
    private int maxSpeed;
    private boolean stateOfMotion;
    private double price;
    private static final int COUNT_WHEEL = 4;

    private TransmissionType transmission;
    private Wheel[] wheels = new Wheel[COUNT_WHEEL];
    private FuelTank fuelTank;
    private Engine engine;
    private Electrics electrics;
    private Headlight headlight;

    protected Car(Country country, Color color, double price, TransmissionType transmission,
                  Wheel[] wheels, FuelTank fuelTank, Engine engine, Electrics electrics, Headlight headlight,
                  int maxSpeed) {
        this.country = country;
        this.color = color;
        this.price = price;
        this.transmission = transmission;
        this.fuelTank = fuelTank;
        this.engine = engine;
        this.electrics = electrics;
        this.headlight = headlight;
        this.maxSpeed = maxSpeed;
        this.wheels = Arrays.copyOf(wheels, COUNT_WHEEL);
    }

    public void startMoving() throws StartCarException {
        String[] errorMessages = new String[0];

        if (Arrays.stream(wheels).anyMatch(Objects::isNull)) {
            errorMessages = addErrorMessage(errorMessages, "часть колес отсутствует");
        }
        if (Arrays.stream(wheels).filter(Objects::nonNull).anyMatch(Wheel::isPunctured)) {
            errorMessages = addErrorMessage(errorMessages, "есть проколотые колеса");
        }
        if (fuelTank.isEmptyFuelTank()) {
            errorMessages = addErrorMessage(errorMessages, "бензобак пустой");
        }
        if (!electrics.isFunctional()) {
            errorMessages = addErrorMessage(errorMessages, "электрика не работоспособна");
        }
        if (!engine.isFunctional()) {
            errorMessages = addErrorMessage(errorMessages, "двигатель не работоспособен");
        }

        if (errorMessages.length != 0) {
            throw new StartCarException(
                    "Движение не возможно по причине -> " + String.join(", ", errorMessages));
        }

        this.stateOfMotion = true;
        System.out.println("Автомобиль начал движение!");
    }

    public void stopMoving() {
        this.stateOfMotion = false;
    }

    public void turnOnHeadlight() {
        if (headlight.isFunctional()) {
            System.out.println("Фары включены!");
        } else {
            System.out.println("Не получилось включить фары!");
        }
    }

    private String[] addErrorMessage(String[] array, String message) {
        int length = array.length;
        array = Arrays.copyOf(array, length + 1);
        array[length] = message;
        return array;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public boolean isStateOfMotion() {
        return stateOfMotion;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public TransmissionType getTransmission() {
        return transmission;
    }

    public void setTransmission(TransmissionType transmission) {
        this.transmission = transmission;
    }

    public void setWheels(Wheel[] wheels) {
        if (wheels.length > this.wheels.length) {
            System.out.println("На машину нельзя установить больше " + this.wheels.length + "колес!");
        } else {
            System.arraycopy(wheels, 0, this.wheels, 0, wheels.length);
        }
    }

    public Wheel[] getWheels() {
        return wheels;
    }

    public FuelTank getFuelTank() {
        return fuelTank;
    }

    public void setFuelTank(FuelTank fuelTank) {
        this.fuelTank = fuelTank;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Electrics getElectrics() {
        return electrics;
    }

    public void setElectrics(Electrics electrics) {
        this.electrics = electrics;
    }

    public Headlight getHeadlight() {
        return headlight;
    }

    public void setHeadlight(Headlight headlight) {
        this.headlight = headlight;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }
}
