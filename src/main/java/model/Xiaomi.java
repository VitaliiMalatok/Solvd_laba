package model;

import exception.XiaomiPriceException;
import service.IRam;
import service.IScreenSize;

import java.util.Objects;

public class Xiaomi extends Phone implements IRam, IScreenSize {
    private static final int DEFAULT_PRICE = 150;
    private int price;

    public Xiaomi(String processor, String battery, int price) {
        super(processor, battery);
        this.price = price;
    }

    public int getPrice() throws XiaomiPriceException {
        if (price > DEFAULT_PRICE) {
            throw new XiaomiPriceException("Please inter correct price. This price = " +
                    price + " is must be a very height");
        }
        return price;
    }

    @Override
    public void call(String person) {
        System.out.println("there is a call prom Xiaomi" + ">>>" + person);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Xiaomi xiaomi = (Xiaomi) o;
        return price == xiaomi.price;
    }

    @Override
    public int hashCode() {
        return Objects.hash(price);
    }

    @Override
    public String toString() {
        return super.toString() +
                ", price=" + price;
    }

    @Override
    public void getIRam() {
        System.out.println("RAM of phone is 1024Mb");
    }

    @Override
    public void getIScreenSize() {
        System.out.println("Size of screen is 5'");
    }
}
