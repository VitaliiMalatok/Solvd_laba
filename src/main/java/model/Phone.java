package model;

import exception.IphoneCallException;
import exception.SamsungCallException;

import java.util.Objects;
import java.util.Scanner;

public abstract class Phone {
    private String processor;
    private String battery;

    public Phone(String processor, String battery) {
        this.processor = processor;
        this.battery = battery;
    }

    public abstract void call(String person) throws SamsungCallException, IphoneCallException;

    public final void sendMessage(String person) {
        Scanner in = new Scanner(System.in);
        String massage = in.next();
        System.out.println(person + ">>>" + "send a message: " + massage);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Phone phone = (Phone) o;
        return processor.equals(phone.processor) && battery.equals(phone.battery);
    }

    @Override
    public int hashCode() {
        return Objects.hash(processor, battery);
    }

    @Override
    public String toString() {
        return "Phone" + " *** " +
                "processor='" + processor + '\'' +
                ", battery='" + battery + '\'';
    }
}
