package org.shop.java;

import java.math.BigDecimal;

public class Headphones extends Product {

    private String color;
    private boolean isWireless;

    public Headphones(String color, boolean isWireless, String name, String brand, BigDecimal price, BigDecimal iva) {
        super(name, brand, price, iva);

        this.color = color;
        this.isWireless = isWireless;
    }

}
