package org.shop.java;

import java.math.BigDecimal;
import java.util.Random;

public class Product {

    protected int code;
    protected String name;
    protected String brand;
    protected BigDecimal price;
    protected BigDecimal iva;
    protected BigDecimal taxedPrice;
    protected boolean hasCard;

    public Product(String name, String brand, BigDecimal price, BigDecimal iva, boolean hasCard) {
        Random r = new Random();
        this.code = r.nextInt(5000);
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.iva = iva;
        this.hasCard = hasCard;
        setTaxedPrice(price, iva, hasCard);
        this.taxedPrice = getTaxedPrice();

    }

    // getter e setter
    public int getCode() {
        return this.code;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public BigDecimal getPrice() {
        return this.price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getIva() {
        return this.iva;
    }

    public BigDecimal getTaxedPrice() {
        return taxedPrice;
    }

    public void setTaxedPrice(BigDecimal price, BigDecimal iva, Boolean hasCard) {
        if (!hasCard) {
            this.taxedPrice = price.add(this.price.multiply(iva).divide(new BigDecimal(100)));
        } else {
            BigDecimal discount = price.multiply(new BigDecimal(2)).divide(new BigDecimal(100));
            this.taxedPrice = price.add(this.price.multiply(iva).divide(new BigDecimal(100))).subtract(discount);
        }

    }

    public void setIva(BigDecimal iva) {
        this.iva = iva;
    }

    @Override
    public String toString() {
        return String.format("Info prodotto '%s' :", this.name) + "\nPrezzo: " + getTaxedPrice() + ", " + "\nIva:"
                + getIva() + ", " + "\nBrand: " + getBrand() + ", " + "\nCodice Prodotto: " + getCode();
    }
}
