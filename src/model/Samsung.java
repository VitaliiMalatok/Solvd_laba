package model;

import java.util.Objects;

public class Samsung extends Phone {
    private int weight;

    public Samsung(String processor, String battery, int weight) {
        super(processor, battery);
        this.weight = weight;
    }

    @Override
    public void call(String person) {
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
}
