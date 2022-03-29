package com.solvd.laba.model;

import com.solvd.laba.exception.SamsungCallException;
import com.solvd.laba.exception.SamsungWightException;
import com.solvd.laba.service.IChargingTime;

import java.util.Objects;

public class Samsung extends Phone implements IChargingTime {
    private static final String DEFAULT_USER_NAME = "Vitali";
    private static final int DEFAULT_WEIGHT = 5;
    private int weight;

    public Samsung(String processor, String battery, int weight) {
        super(processor, battery);
        this.weight = weight;
    }

    public int getWeight() throws SamsungWightException {
        if (weight <= DEFAULT_WEIGHT) {
            throw new SamsungWightException("Please inter correct weight. This weight = " +
                    weight + " is must be a positive number");
        }
        return weight;
    }

    @Override
    public void call(String person) throws SamsungCallException {
        if (person != DEFAULT_USER_NAME) {
            throw new SamsungCallException("Dear user this name: " +
                    person + " cannot be used when calling. Default name user: " +
                    DEFAULT_USER_NAME);
        }
        System.out.println("there is a call from Samsung" + ">>>" + person);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Samsung)) return false;
        Samsung samsung = (Samsung) o;
        return weight == samsung.weight;
    }

    @Override
    public int hashCode() {
        return Objects.hash(weight);
    }

    @Override
    public String toString() {
        return super.toString() +
                ", weight=" + weight;
    }

    @Override
    public void getChargingTime(int timeOfHours) {
        System.out.println("Charging time is: " + timeOfHours + "hours");
    }
}
