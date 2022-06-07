package com.solvd.laba.dao.model;

import java.util.Objects;

public class InternationalDelivery {
    private int id;
    private int airDeliveryId;
    private int deliverymanId;
    private int shipDeliveryId;
    private int trainDeliveryId;

    public InternationalDelivery() {
    }

    public InternationalDelivery(int airDeliveryId, int deliverymanId, int shipDeliveryId, int trainDeliveryId) {
        this.airDeliveryId = airDeliveryId;
        this.deliverymanId = deliverymanId;
        this.shipDeliveryId = shipDeliveryId;
        this.trainDeliveryId = trainDeliveryId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAirDeliveryId() {
        return airDeliveryId;
    }

    public void setAirDeliveryId(int airDeliveryId) {
        this.airDeliveryId = airDeliveryId;
    }

    public int getDeliverymanId() {
        return deliverymanId;
    }

    public void setDeliverymanId(int deliverymanId) {
        this.deliverymanId = deliverymanId;
    }

    public int getShipDeliveryId() {
        return shipDeliveryId;
    }

    public void setShipDeliveryId(int shipDeliveryId) {
        this.shipDeliveryId = shipDeliveryId;
    }

    public int getTrainDeliveryId() {
        return trainDeliveryId;
    }

    public void setTrainDeliveryId(int trainDeliveryId) {
        this.trainDeliveryId = trainDeliveryId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InternationalDelivery that = (InternationalDelivery) o;
        return id == that.id && airDeliveryId == that.airDeliveryId && deliverymanId == that.deliverymanId && shipDeliveryId == that.shipDeliveryId && trainDeliveryId == that.trainDeliveryId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, airDeliveryId, deliverymanId, shipDeliveryId, trainDeliveryId);
    }

    @Override
    public String toString() {
        return "InternationalDelivery{" +
                "id=" + id +
                ", airDeliveryId=" + airDeliveryId +
                ", deliverymanId=" + deliverymanId +
                ", shipDeliveryId=" + shipDeliveryId +
                ", trainDeliveryId=" + trainDeliveryId +
                '}';
    }
}
