package model;

import java.util.Objects;

public class Xiaomi extends Phone {
    private int price;

    public Xiaomi(String processor, String battery, int price) {
        super(processor, battery);
        this.price = price;
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
}
