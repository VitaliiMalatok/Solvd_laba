package com.solvd.laba.dao.model;

import java.util.Objects;

public class Phones {
    private int id;
    private int iphoneId;
    private int samsungId;
    private int xiaomiId;

    public Phones() {
    }

    public Phones(int iphoneId, int samsungId, int xiaomiId) {
        this.iphoneId = iphoneId;
        this.samsungId = samsungId;
        this.xiaomiId = xiaomiId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIphoneId() {
        return iphoneId;
    }

    public void setIphoneId(int iphoneId) {
        this.iphoneId = iphoneId;
    }

    public int getSamsungId() {
        return samsungId;
    }

    public void setSamsungId(int samsungId) {
        this.samsungId = samsungId;
    }

    public int getXiaomiId() {
        return xiaomiId;
    }

    public void setXiaomiId(int xiaomiId) {
        this.xiaomiId = xiaomiId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Phones phone = (Phones) o;
        return id == phone.id && iphoneId == phone.iphoneId && samsungId == phone.samsungId && xiaomiId == phone.xiaomiId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, iphoneId, samsungId, xiaomiId);
    }

    @Override
    public String toString() {
        return "Phone{" +
                "id=" + id +
                ", iphoneId=" + iphoneId +
                ", samsungId=" + samsungId +
                ", xiaomiId=" + xiaomiId +
                '}';
    }
}
