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

    @Override
    public String toString() {
        return String.format(
                "Inserito telefono: '%s', del brand: %s, con prezzo: %.2f, iva: %.2f, IMEI: %s, memoria: %d",
                super.getName(), super.getBrand(), super.getPrice(), super.getIva(), this.imei, this.memory);
    }
}
