package org.javaacademy.toyota.report;

public enum Guide {
    CAMRY(5000),
    SOLARA(8000),
    HIANCE(10000),
    DYNA(12000);

    private final int costPrice;

    Guide(int costPrice) {
        this.costPrice = costPrice;
    }

    public int getCostPrice() {
        return costPrice;
    }
}
