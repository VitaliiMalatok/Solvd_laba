package com.solvd.laba.dao.model;

import java.util.Objects;

public class ClientOrder {
    private int id;
    private int customerId;
    private String deliveryDate;
    private int deliveryId;
    private String formOfPayment;
    private int internationalDeliveryId;
    private String orderDate;
    private int productCodeId;

    public ClientOrder() {
    }

    public ClientOrder(int customerId, String deliveryDate, int deliveryId, String formOfPayment, int internationalDeliveryId, String orderDate, int productCodeId) {
        this.customerId = customerId;
        this.deliveryDate = deliveryDate;
        this.deliveryId = deliveryId;
        this.formOfPayment = formOfPayment;
        this.internationalDeliveryId = internationalDeliveryId;
        this.orderDate = orderDate;
        this.productCodeId = productCodeId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(String deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public int getDeliveryId() {
        return deliveryId;
    }

    public void setDeliveryId(int deliveryId) {
        this.deliveryId = deliveryId;
    }

    public String getFormOfPayment() {
        return formOfPayment;
    }

    public void setFormOfPayment(String formOfPayment) {
        this.formOfPayment = formOfPayment;
    }

    public int getInternationalDeliveryId() {
        return internationalDeliveryId;
    }

    public void setInternationalDeliveryId(int internationalDeliveryId) {
        this.internationalDeliveryId = internationalDeliveryId;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public int getProductCodeId() {
        return productCodeId;
    }

    public void setProductCodeId(int productCodeId) {
        this.productCodeId = productCodeId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClientOrder that = (ClientOrder) o;
        return id == that.id && customerId == that.customerId && deliveryId == that.deliveryId && internationalDeliveryId == that.internationalDeliveryId && productCodeId == that.productCodeId && Objects.equals(deliveryDate, that.deliveryDate) && Objects.equals(formOfPayment, that.formOfPayment) && Objects.equals(orderDate, that.orderDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, customerId, deliveryDate, deliveryId, formOfPayment, internationalDeliveryId, orderDate, productCodeId);
    }

    @Override
    public String toString() {
        return "ClientOrder{" +
                "id=" + id +
                ", customerId=" + customerId +
                ", deliveryDate='" + deliveryDate + '\'' +
                ", deliveryId=" + deliveryId +
                ", formOfPayment='" + formOfPayment + '\'' +
                ", internationalDeliveryId=" + internationalDeliveryId +
                ", orderDate='" + orderDate + '\'' +
                ", productCodeId=" + productCodeId +
                '}';
    }
}
