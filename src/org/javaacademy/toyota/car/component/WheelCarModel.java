package org.javaacademy.toyota.car.component;

public enum WheelCarModel {
    CAMRY(17),
    SOLARA(16),
    HIANCE(20),
    DYNA(20);

    private final int diameter;

    WheelCarModel(int diameter) {
        this.diameter = diameter;
    }

    public int getDiameter() {
        return diameter;
    }
}
