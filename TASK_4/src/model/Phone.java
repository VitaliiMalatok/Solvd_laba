package model;

import java.util.Scanner;

public abstract class Phone {
    private String processor ;
    private String battery;

    public Phone(String processor, String battery) {
        this.processor = processor;
        this.battery = battery;
    }

    public abstract void call(String person);

    public void sendMessage(String person) {
        Scanner in = new Scanner(System.in);
        String massage = in.next();
        System.out.println(person + ">>>" + "send a message: " + massage);
    }

    @Override
    public String toString() {
        return "Phone" + " *** " +
                "processor='" + processor + '\'' +
                ", battery='" + battery + '\'';
    }
}
