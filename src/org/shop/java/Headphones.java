package org.shop.java;

import java.math.BigDecimal;

public class Headphones extends Product {

    private String color;
    private boolean isWireless;

    public Headphones(String color, boolean isWireless, String name, String brand, BigDecimal price, BigDecimal iva,
            boolean hasCard) {
        super(name, brand, price, iva, hasCard);

        this.color = color;
        this.isWireless = isWireless;
    }

    public void setIsWireless(boolean isWireless) {
        this.isWireless = isWireless;
    }

    public boolean getIsWireless() {
        return this.isWireless;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    @Override
    public String toString() {
        return super.toString() + "\nColore : " + getColor() + "\nWireless : " + getIsWireless();
    }

    @Override
    public void setTaxedPrice(BigDecimal price, BigDecimal iva, Boolean hasCard) {
        if (!hasCard) {
            this.taxedPrice = price.add(this.price.multiply(iva).divide(new BigDecimal(100)));
        } else {
            if (this.isWireless) {
                BigDecimal discount = price.multiply(new BigDecimal(2)).divide(new BigDecimal(100));
                this.taxedPrice = price.add(this.price.multiply(iva).divide(new BigDecimal(100))).subtract(discount);
            } else {
                BigDecimal discount = price.multiply(new BigDecimal(7)).divide(new BigDecimal(100));
                this.taxedPrice = price.add(this.price.multiply(iva).divide(new BigDecimal(100))).subtract(discount);
            }

        }

    }

}
