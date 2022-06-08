package com.solvd.laba.dao.model;

import java.util.Objects;

public class AirDelivery {
    private int id;
    private String country;
    private String nameOfAirplane;

    public AirDelivery() {
    }

    public AirDelivery(String country, String nameOfAirplane) {
        this.country = country;
        this.nameOfAirplane = nameOfAirplane;
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

    public String getNameOfAirplane() {
        return nameOfAirplane;
    }

    public void setNameOfAirplane(String nameOfAirplane) {
        this.nameOfAirplane = nameOfAirplane;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AirDelivery that = (AirDelivery) o;
        return id == that.id && Objects.equals(country, that.country) && Objects.equals(nameOfAirplane, that.nameOfAirplane);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, country, nameOfAirplane);
    }

    @Override
    public String toString() {
        return "AirDelivery{" +
                "id=" + id +
                ", country='" + country + '\'' +
                ", name_of_airplane='" + nameOfAirplane + '\'' +
                '}';
    }
}
