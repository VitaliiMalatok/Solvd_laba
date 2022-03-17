package model;

public class Samsung extends Phone{
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
    public String toString() {
        return super.toString()  +
                ", weight=" + weight;
    }
}
