package com.solvd.laba.dao.model;

import java.util.Objects;

public class Product {
    private int id;
    private int phoneId;
    private int productCodesId;

    public Product() {
    }

    public Product(int phoneId, int productCodesId) {
        this.phoneId = phoneId;
        this.productCodesId = productCodesId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPhoneId() {
        return phoneId;
    }

    public void setPhoneId(int phoneId) {
        this.phoneId = phoneId;
    }

    public int getProductCodesId() {
        return productCodesId;
    }

    public void setProductCodesId(int productCodesId) {
        this.productCodesId = productCodesId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return id == product.id && phoneId == product.phoneId && productCodesId == product.productCodesId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, phoneId, productCodesId);
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", phoneId=" + phoneId +
                ", productCodesId=" + productCodesId +
                '}';
    }
}
