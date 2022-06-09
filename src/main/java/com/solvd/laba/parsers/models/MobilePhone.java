package com.solvd.laba.parsers.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;

import java.util.Objects;

@XmlRootElement(name = "mobile_phone")
@XmlType(propOrder = {"id", "name", "imei", "year", "price", "mobileStore", "specification"})
@JsonPropertyOrder({"id", "name", "imei", "year", "price", "mobileStore", "specification"})
public class MobilePhone {
    @JsonProperty
    private int id;
    @JsonProperty
    private MobileStore mobileStore;
    @JsonProperty
    private long imei;
    @JsonProperty
    private String name;
    @JsonProperty
    private int year;
    @JsonProperty
    private int price;
    @JsonProperty
    private Specification specification;

    public MobilePhone(String name, long imei, int year, int price, Specification specification, MobileStore mobileStore) {
        this.mobileStore = mobileStore;
        this.imei = imei;
        this.name = name;
        this.year = year;
        this.price = price;
        this.specification = specification;
    }

    public MobilePhone() {

    }

    public int getYear() {
        return year;
    }

    @XmlElement
    public void setYear(int year) {
        this.year = year;
    }

    public int getPrice() {
        return price;
    }

    @XmlElement
    public void setPrice(int price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    @XmlAttribute
    public void setId(int id) {
        this.id = id;
    }

    public MobileStore getMobileStore() {
        return mobileStore;
    }

    @XmlElement
    public void setMobileStore(MobileStore mobileStore) {
        this.mobileStore = mobileStore;
    }

    public long getImei() {
        return imei;
    }

    @XmlElement
    public void setImei(long imei) {
        this.imei = imei;
    }

    public String getName() {
        return name;
    }

    @XmlElement
    public void setName(String name) {
        this.name = name;
    }

    public Specification getSpecification() {
        return specification;
    }

    @XmlElement
    public void setSpecification(Specification specification) {
        this.specification = specification;
    }

    @Override
    public String toString() {
        return "\n" + "MobilePhone{" +
                "Name='" + name + '\'' +
                ", Year=" + year +
                ", Price=" + price +
                ", Imei=" + imei +
                ", MobileStores=" + mobileStore +
                ", Specifications=" + specification +
                '}' + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MobilePhone that = (MobilePhone) o;
        return imei == that.imei && year == that.year && price == that.price && Objects.equals(mobileStore, that.mobileStore) && Objects.equals(name, that.name) && Objects.equals(specification, that.specification);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mobileStore, imei, name, year, price, specification);
    }
}
