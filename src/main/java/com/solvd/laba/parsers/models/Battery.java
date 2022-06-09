package com.solvd.laba.parsers.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;

@XmlRootElement(name = "battery")
@XmlType(propOrder = {"id", "manufacturer", "capacity", "price"})
@JsonPropertyOrder({"manufacturer", "capacity", "price"})
public class Battery {
    @JsonProperty
    private int id;
    @JsonProperty
    private String manufacturer;
    @JsonProperty
    private int capacity;
    @JsonProperty
    private int price;


    public Battery(BatteryBuilder builder) {
        this.id = builder.getId();
        this.manufacturer = builder.getManufacturer();
        this.capacity = builder.getCapacity();
        this.price = builder.getPrice();
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

    public String getManufacturer() {
        return manufacturer;
    }

    @XmlElement
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getCapacity() {
        return capacity;
    }


    @XmlElement
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "{" + "id=" + id +
                ", manufacturer='" + manufacturer + '\'' +
                ", capacity=" + capacity +
                ", price=" + price +
                '}';
    }

//    public static class Builder {
//        private int id;
//        private String manufacturer;
//        private int capacity;
//        private int price;
//
//        public Builder() {
//        }
//
//        public Builder setId(int id) {
//            this.id = id;
//            return this;
//        }
//
//        public Builder setManufacturer(String manufacturer) {
//            this.manufacturer = manufacturer;
//            return this;
//        }
//
//        public Builder setCapacity(int capacity) {
//            this.capacity = capacity;
//            return this;
//        }
//
//        public Builder setPrice(int price) {
//            this.price = price;
//            return this;
//        }
//
//        public Battery build() {
//            return new Battery(this);
//        }
//
//        public int getId() {
//            return id;
//        }
//
//        public String getManufacturer() {
//            return manufacturer;
//        }
//
//        public int getCapacity() {
//            return capacity;
//        }
//
//        public int getPrice() {
//            return price;
//        }
//    }

}
