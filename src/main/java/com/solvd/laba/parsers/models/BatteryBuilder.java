package com.solvd.laba.parsers.models;

public class BatteryBuilder {
    private int id;
    private String manufacturer;
    private int capacity;
    private int price;

    public BatteryBuilder() {
    }

    public BatteryBuilder setId(int id) {
        this.id = id;
        return this;
    }

    public BatteryBuilder setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
        return this;
    }

    public BatteryBuilder setCapacity(int capacity) {
        this.capacity = capacity;
        return this;
    }

    public BatteryBuilder setPrice(int price) {
        this.price = price;
        return this;
    }

    public Battery build() {
        return new Battery(this);
    }

    public int getId() {
        return id;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getPrice() {
        return price;
    }
}