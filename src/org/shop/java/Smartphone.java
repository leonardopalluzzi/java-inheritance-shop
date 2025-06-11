package org.shop.java;

import java.math.BigDecimal;

public class Smartphone extends Product {

    private String imei;
    private int memory;

    public Smartphone(String name, String brand, BigDecimal price, BigDecimal iva, String imei, int memory) {
        super(name, brand, price, iva);

        this.imei = imei.toUpperCase();
        this.memory = memory;
    }

    public String getImei() {
        return this.imei;
    }

    public int getMemory() {
        return this.memory;
    }

    @Override
    public String toString() {
        return super.toString() + "\nCodice IMEI: " + getImei() + "," + "\nMemoria:" + getMemory();
    }
}
