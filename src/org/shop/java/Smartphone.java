package org.shop.java;

import java.math.BigDecimal;

public class Smartphone extends Product {

    private String imei;
    private int memory;

    public Smartphone(String name, String brand, BigDecimal price, BigDecimal iva, String imei, int memory) {
        super(name, brand, price, iva);

        this.imei = imei;
        this.memory = memory;
    }
}
