package com.solvd.laba.model;

import com.solvd.laba.exception.IphoneCallException;
import com.solvd.laba.exception.IphoneColorException;
import com.solvd.laba.model.service.IBalance;
import com.solvd.laba.model.service.INetworkType;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Objects;

public class Iphone extends Phone implements IBalance, INetworkType {
    private static final Logger LOGGER = LogManager.getLogger(Iphone.class);
    private static final String DEFAULT_USER_NAME = "Vitali";
    private static final String COLOR_OF_PHONE = "red";
    private final String IPHONE = "Iphone";
    private String color;

    public Iphone(String processor, String battery, String color) {
        super(processor, battery);
        this.color = color;
    }

    public Iphone() {
        super();
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() throws IphoneColorException {
        if (!color.equals(COLOR_OF_PHONE)) {
            throw new IphoneColorException("This color is not true: " +
                    COLOR_OF_PHONE +
                    " Please chose default color");
        }
        return color;
    }

    public static void getUserName(String firstName, String secondName) {
        LOGGER.info(firstName + secondName);
    }

    @Override
    public void call(String person) throws IphoneCallException {
        if (!person.equals(DEFAULT_USER_NAME)) {
            throw new IphoneCallException("Dear user this name: " +
                    person + " cannot be used when calling. Default name user: " +
                    DEFAULT_USER_NAME);
        }
        LOGGER.info("there is a call from Iphone" + ">>>" + person);
    }

    @Override
    public void getBalance(int balance) {
        LOGGER.info("Iphone balance is: " + balance + "$");
    }

    @Override
    public void getNetworkType() {
        LOGGER.info("It's 5G network use in " + IPHONE);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Iphone iphone = (Iphone) o;
        return color.equals(iphone.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color);
    }

    @Override
    public String toString() {
        return super.toString() +
                ", color='" + color + '\'';
    }
}
