package org.shop.java;

import java.math.BigDecimal;

public class Televisions extends Product {

    private int height;
    private int width;
    private int depth;
    private boolean smart;

    public Televisions(String name, String brand, BigDecimal price, BigDecimal iva, boolean smart, int height,
            int width, int depth) {
        super(name, brand, price, iva);
        this.smart = smart;
        this.height = height;
        this.width = width;
        this.depth = depth;
    }

}
