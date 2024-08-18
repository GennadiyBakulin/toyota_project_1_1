package org.javaacademy.toyota.dealernetwork;

public class Buyer {

  private String name;
  private double amount;

  public Buyer(String name, double amount) {
    this.name = name;
    this.amount = amount;
  }

  public String getName() {
    return name;
  }

  public double getAmount() {
    return amount;
  }
}
