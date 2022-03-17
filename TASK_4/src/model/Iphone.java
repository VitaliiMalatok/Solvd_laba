package model;

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
    public String toString() {
        return super.toString() +
                ", color='" + color + '\'';
    }
}
