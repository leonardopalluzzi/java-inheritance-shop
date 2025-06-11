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

    public String getDimensions() {
        return String.format("%d x %d x %d", this.height,
                this.width, this.depth);
    }

    public boolean getSmart() {
        return this.smart;
    }

    @Override
    public String toString() {
        return super.toString() + "\nSmart: " + getSmart() + ", " + "\nDimensioni:" + getDimensions();
    }

}
