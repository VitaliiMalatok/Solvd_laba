package com.solvd.laba.parsers.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


@XmlRootElement(name = "specification")
@XmlType(propOrder = {"id", "processor", "display", "battery", "memory"})
@JsonPropertyOrder({"id", "processor", "display", "battery", "memory"})
public class Specification {
    @JsonProperty
    private int id;
    @JsonProperty
    private Processor processor;
    @JsonProperty
    private Display display;
    @JsonProperty
    private Battery battery;
    @JsonProperty
    private Memory memory;

    public Specification() {
    }

    public Specification(Processor processor, Display display, Battery battery, Memory memory) {
        this.processor = processor;
        this.display = display;
        this.battery = battery;
        this.memory = memory;
    }

    public int getId() {
        return id;
    }

    @XmlAttribute
    public void setId(int id) {
        this.id = id;
    }

    public Processor getProcessor() {
        return processor;
    }

    @XmlElement
    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public Display getDisplay() {
        return display;
    }

    @XmlElement
    public void setDisplay(Display display) {
        this.display = display;
    }

    public Battery getBattery() {
        return battery;
    }

    @XmlElement

    public void setBattery(Battery battery) {
        this.battery = battery;
    }

    public Memory getMemory() {
        return memory;
    }

    @XmlElement

    public void setMemory(Memory memory) {
        this.memory = memory;
    }

    @Override
    public String toString() {
        return "{" +
                "processor=" + processor +
                ", display=" + display +
                ", battery=" + battery +
                ", memory=" + memory +
                '}';
    }


}
