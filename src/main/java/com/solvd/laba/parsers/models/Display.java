package com.solvd.laba.parsers.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;

@XmlRootElement(name = "battery")
@XmlType(propOrder = {"id", "manufacture", "type", "inch", "price"})
@JsonPropertyOrder({"manufacture", "type", "inch", "price"})
public class Display {
    @JsonProperty
    private int id;
    @JsonProperty
    private String manufacture;
    @JsonProperty
    private String type;
    @JsonProperty
    private double inch;
    @JsonProperty
    private int price;

    public Display() {
    }

    public Display(String manufacture, String type, double inch, int price) {
        this.manufacture = manufacture;
        this.type = type;
        this.inch = inch;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    @XmlElement
    public void setPrice(int price) {
        this.price = price;
    }

    public String getManufacture() {
        return manufacture;
    }

    @XmlElement
    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public String getType() {
        return type;
    }

    @XmlElement
    public void setType(String type) {
        this.type = type;
    }

    public double getInch() {
        return inch;
    }

    @XmlElement
    public void setInch(double inch) {
        this.inch = inch;
    }

    @Override
    public String toString() {
        return "{" +
                "manufacture='" + manufacture + '\'' +
                ", types='" + type + '\'' +
                ", inch=" + inch +
                ", price=" + price +
                '}';
    }
}
