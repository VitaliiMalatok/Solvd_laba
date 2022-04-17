package com.solvd.laba.model;

import com.solvd.laba.exception.IphoneCallException;
import com.solvd.laba.exception.SamsungCallException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Objects;
import java.util.Scanner;

public abstract class Phone {
    private static final Logger LOGGER = LogManager.getLogger(Phone.class);
    private String processor;
    private String battery;

    public Phone(String processor, String battery) {
        this.processor = processor;
        this.battery = battery;
    }

    public Phone() {
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public void setBattery(String battery) {
        this.battery = battery;
    }

    public abstract void call(String person) throws SamsungCallException, IphoneCallException;

    public final void sendMessage(String person) {
        Scanner in = new Scanner(System.in);
        String massage = in.next();
        LOGGER.info(person + ">>>" + "send a message: " + massage);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Phone phone = (Phone) o;
        return processor.equals(phone.processor) && battery.equals(phone.battery);
    }

    @Override
    public int hashCode() {
        return Objects.hash(processor, battery);
    }

    @Override
    public String toString() {
        return "Phone" + " *** " +
                "processor='" + processor + '\'' +
                ", battery='" + battery + '\'';
    }
}
