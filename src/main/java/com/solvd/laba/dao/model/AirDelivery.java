package com.solvd.laba.dao.model;

import java.util.Objects;

public class AirDelivery {
    private int id;
    private String country;
    private String name_of_airplane;

    public AirDelivery() {
    }

    public AirDelivery(String country, String name_of_airplane) {
        this.country = country;
        this.name_of_airplane = name_of_airplane;
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

    public String getName_of_airplane() {
        return name_of_airplane;
    }

    public void setName_of_airplane(String name_of_airplane) {
        this.name_of_airplane = name_of_airplane;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AirDelivery that = (AirDelivery) o;
        return id == that.id && Objects.equals(country, that.country) && Objects.equals(name_of_airplane, that.name_of_airplane);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, country, name_of_airplane);
    }

    @Override
    public String toString() {
        return "AirDelivery{" +
                "id=" + id +
                ", country='" + country + '\'' +
                ", name_of_airplane='" + name_of_airplane + '\'' +
                '}';
    }
}
