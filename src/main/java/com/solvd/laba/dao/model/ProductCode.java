package com.solvd.laba.dao.model;

import java.util.Objects;

public class ProductCode {
    private int id;
    private String manufacturer;
    private String nameOfProduct;
    private int price;

    public ProductCode() {
    }

    public ProductCode(String manufacturer, String nameOfProduct, int price) {
        this.manufacturer = manufacturer;
        this.nameOfProduct = nameOfProduct;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getNameOfProduct() {
        return nameOfProduct;
    }

    public void setNameOfProduct(String nameOfProduct) {
        this.nameOfProduct = nameOfProduct;
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
        ProductCode that = (ProductCode) o;
        return id == that.id && price == that.price && Objects.equals(manufacturer, that.manufacturer) && Objects.equals(nameOfProduct, that.nameOfProduct);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, manufacturer, nameOfProduct, price);
    }

    @Override
    public String toString() {
        return "ProductCode{" +
                "id=" + id +
                ", manufacturer='" + manufacturer + '\'' +
                ", nameOfProduct='" + nameOfProduct + '\'' +
                ", price=" + price +
                '}';
    }
}
