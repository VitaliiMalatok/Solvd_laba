package com.solvd.laba.dao.model;

import java.util.Objects;

public class Iphones {
    private int id;
    private String color;
    private String model;
    private int price;

    public Iphones() {
    }

    public Iphones(String color, String model, int price) {
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
        Iphones iphone = (Iphones) o;
        return id == iphone.id && price == iphone.price && Objects.equals(color, iphone.color) && Objects.equals(model, iphone.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, color, model, price);
    }

    @Override
    public String toString() {
        return "Iphone{" +
                "id=" + id +
                ", color='" + color + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                '}';
    }
}
