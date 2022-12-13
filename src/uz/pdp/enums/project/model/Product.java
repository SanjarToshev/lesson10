package uz.pdp.enums.project.model;

import java.math.BigDecimal;

public class Product {

    private String name;
    private Measurement measurement;
    private BigDecimal price;

    public Product(String name, Measurement measurement, BigDecimal price) {
        this.name = name;
        this.measurement = measurement;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Measurement getMeasurement() {
        return measurement;
    }

    public void setMeasurement(Measurement measurement) {
        this.measurement = measurement;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
