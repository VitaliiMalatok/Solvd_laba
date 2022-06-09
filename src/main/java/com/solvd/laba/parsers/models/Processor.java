package com.solvd.laba.parsers.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;

@XmlRootElement(name = "processor")
@XmlType(propOrder = {"name", "frequency", "noc"})
@JsonPropertyOrder({"name", "frequency", "noc"})
public class Processor {
    @JsonProperty
    private int id;
    @JsonProperty
    private String name;
    @JsonProperty
    private String frequency;
    @JsonProperty
    private int noc;

    public Processor() {

    }

    public Processor(String name, String frequency, int noc) {
        this.name = name;
        this.frequency = frequency;
        this.noc = noc;
    }

    public String getName() {
        return name;
    }

    @XmlElement
    public void setName(String name) {
        this.name = name;
    }

    public String getFrequency() {
        return frequency;
    }

    @XmlElement
    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    public int getNoc() {
        return noc;
    }

    @XmlElement
    public void setNoc(int noc) {
        this.noc = noc;
    }

    @Override
    public String toString() {
        return "{" +
                ", name='" + name + '\'' +
                ", frequency='" + frequency + '\'' +
                ", noc=" + noc +
                '}';
    }
}
