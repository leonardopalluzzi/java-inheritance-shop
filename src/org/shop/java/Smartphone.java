package org.shop.java;

import java.math.BigDecimal;

public class Smartphone extends Product {

    private String imei;
    private int memory;

    public Smartphone(String name, String brand, BigDecimal price, BigDecimal iva, String imei, int memory,
            boolean hasCard) {
        super(name, brand, price, iva, hasCard);

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

    @Override
    public void setTaxedPrice(BigDecimal price, BigDecimal iva, Boolean hasCard) {
        if (!hasCard) {
            super.taxedPrice = price.add(super.price.multiply(iva).divide(new BigDecimal(100)));
        } else {
            if (this.memory < 32) {
                BigDecimal discount = price.multiply(new BigDecimal(5)).divide(new BigDecimal(100));
                super.taxedPrice = price.add(super.price.multiply(iva).divide(new BigDecimal(100))).subtract(discount);
            } else {
                BigDecimal discount = price.multiply(new BigDecimal(2)).divide(new BigDecimal(100));
                super.taxedPrice = price.add(super.price.multiply(iva).divide(new BigDecimal(100))).subtract(discount);
            }
        }

    }
}
