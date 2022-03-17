package model;

public class Xiaomi extends Phone{
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
    public String toString() {
        return super.toString()  +
                ", price=" + price;
    }
}
