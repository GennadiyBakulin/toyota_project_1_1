package org.javaacademy.toyota.car.component;

public class FuelTank {

    private int quantity;

    public FuelTank(int quantity) {
        this.quantity = quantity;
    }

    public boolean isEmptyFuelTank() {
        return quantity == 0;
    }

    public void setQuantity(int quantity) {
        if (quantity >= 0) {
            this.quantity = quantity;
        } else {
            System.out.println("Количество топлива в баке не может быть меньше нуля");
        }
    }

    public int getQuantity() {
        return quantity;
    }
}
