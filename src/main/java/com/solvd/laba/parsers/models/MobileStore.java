package com.solvd.laba.parsers.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;

@XmlRootElement(name = "mobile_store")
@XmlType(propOrder = {"id", "name", "address"})
@JsonPropertyOrder({"name", "address"})
public class MobileStore {
    @JsonProperty
    private int id;
    @JsonProperty
    private String name;
    @JsonProperty
    private String address;

    public MobileStore() {
    }

    public MobileStore(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public MobileStore(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    @XmlElement
    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    @XmlElement

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
