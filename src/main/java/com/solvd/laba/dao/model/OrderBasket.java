package com.solvd.laba.dao.model;

import java.util.Objects;

public class OrderBasket {
    private int id;
    private int productCodeId;
    private int quantityOfGood;

    public OrderBasket() {
    }

    public OrderBasket(int id, int productCodeId, int quantityOfGood) {
        this.id = id;
        this.productCodeId = productCodeId;
        this.quantityOfGood = quantityOfGood;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProductCodeId() {
        return productCodeId;
    }

    public void setProductCodeId(int productCodeId) {
        this.productCodeId = productCodeId;
    }

    public int getQuantityOfGood() {
        return quantityOfGood;
    }

    public void setQuantityOfGood(int quantityOfGood) {
        this.quantityOfGood = quantityOfGood;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderBasket that = (OrderBasket) o;
        return id == that.id && productCodeId == that.productCodeId && quantityOfGood == that.quantityOfGood;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, productCodeId, quantityOfGood);
    }

    @Override
    public String toString() {
        return "OrderBasket{" +
                "id=" + id +
                ", productCodeId=" + productCodeId +
                ", quantityOfGood=" + quantityOfGood +
                '}';
    }
}
