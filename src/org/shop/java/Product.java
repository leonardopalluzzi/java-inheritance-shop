package org.shop.java;

import java.math.BigDecimal;
import java.util.Random;

public class Product {

    private int code;
    private String name;
    private String brand;
    private BigDecimal price;
    private BigDecimal iva;

    public Product(String name, String brand, BigDecimal price, BigDecimal iva) {
        Random r = new Random();
        this.code = r.nextInt(5000);
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.iva = iva;

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

    public void setIva(BigDecimal iva) {
        this.iva = iva;
    }
}
