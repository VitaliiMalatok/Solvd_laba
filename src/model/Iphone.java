package model;

import java.util.Objects;

public class Iphone extends Phone {
    private String color;

    public Iphone(String processor, String battery, String color) {
        super(processor, battery);
        this.color = color;
    }

    @Override
    public void call(String person) {
        System.out.println("there is a call from Iphone" + ">>>" + person);
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
