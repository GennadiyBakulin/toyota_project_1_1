package org.javaacademy.toyota.dealernetwork;

import org.javaacademy.toyota.car.Car;

public class Cashier {

    private double totalAmount = 0;

    public double getTotalAmount() {
        return totalAmount;
    }

    public void acceptsCarForSale(Car car) {
        if (car == null) {
            this.totalAmount += 0;
        } else {
            this.totalAmount += car.getPrice();
        }
    }
}
