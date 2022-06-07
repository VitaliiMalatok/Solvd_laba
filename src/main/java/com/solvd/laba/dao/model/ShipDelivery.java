package com.solvd.laba.dao.model;

import java.util.Objects;

public class ShipDelivery {
    private int id;
    private String country;
    private String nameOfShip;

    public ShipDelivery() {
    }

    public ShipDelivery(String country, String nameOfShip) {
        this.country = country;
        this.nameOfShip = nameOfShip;
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

    public String getNameOfShip() {
        return nameOfShip;
    }

    public void setNameOfShip(String nameOfShip) {
        this.nameOfShip = nameOfShip;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ShipDelivery that = (ShipDelivery) o;
        return id == that.id && Objects.equals(country, that.country) && Objects.equals(nameOfShip, that.nameOfShip);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, country, nameOfShip);
    }

    @Override
    public String toString() {
        return "ShipDelivery{" +
                "id=" + id +
                ", country='" + country + '\'' +
                ", nameOfShip='" + nameOfShip + '\'' +
                '}';
    }
}
