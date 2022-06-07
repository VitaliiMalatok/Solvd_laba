package com.solvd.laba.dao.model;

import java.util.Objects;

public class TrainDelivery {
    private int id;
    private String country;
    private String nameOfTrain;

    public TrainDelivery() {
    }

    public TrainDelivery(String country, String nameOfTrain) {
        this.country = country;
        this.nameOfTrain = nameOfTrain;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getNameOfTrain() {
        return nameOfTrain;
    }

    public void setNameOfTrain(String nameOfTrain) {
        this.nameOfTrain = nameOfTrain;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TrainDelivery that = (TrainDelivery) o;
        return id == that.id && Objects.equals(country, that.country) && Objects.equals(nameOfTrain, that.nameOfTrain);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, country, nameOfTrain);
    }

    @Override
    public String toString() {
        return "TrainDelivery{" +
                "id=" + id +
                ", country='" + country + '\'' +
                ", nameOfTrain='" + nameOfTrain + '\'' +
                '}';
    }
}
