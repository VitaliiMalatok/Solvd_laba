package com.solvd.laba.dao.model;

import java.util.Objects;

public class Xiaomis {
    private int id;
    private String color;
    private String model;
    private int price;

    public Xiaomis() {
    }

    public Xiaomis(String color, String model, int price) {
        this.color = color;
        this.model = model;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Xiaomis xiaomi = (Xiaomis) o;
        return id == xiaomi.id && price == xiaomi.price && Objects.equals(color, xiaomi.color) && Objects.equals(model, xiaomi.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, color, model, price);
    }

    @Override
    public String toString() {
        return "Xiaomi{" +
                "id=" + id +
                ", color='" + color + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                '}';
    }
}
