package service.impl;

import exception.*;
import model.Iphone;
import model.Samsung;
import model.Xiaomi;
import service.IRunSolvdLaba;

public class RunSolvdLabaImpl implements IRunSolvdLaba {

    private static final int BALANCE = 250;
    private static final int TIME_OF_HOURS = 5;
    private static final int WEIGHT = -125;
    private static final int PRICE = 230;
    private static final String FIRST_NAME = "Vitalis";
    private static final String SECOND_NAME = "Molotok";
    private static final String PERSON = "Alina";
    private static final String PERSON_NAME = "Polina";

    @Override
    public void runProject() {
        Iphone iphone = new Iphone("SiliconLab", "Li-on", "Blue");
        Samsung samsung = new Samsung("Maxim", "TracoPower", WEIGHT);
        Xiaomi xiaomi = new Xiaomi("TexasInstr", "Li-pool", PRICE);
        System.out.println(iphone + "\n" +
                samsung + "\n" +
                xiaomi);
        samsung.sendMessage(PERSON);
        xiaomi.sendMessage(PERSON_NAME);
        iphone.getBalance(BALANCE);
        samsung.getChargingTime(TIME_OF_HOURS);
        iphone.getNetworkType();
        xiaomi.getIRam();
        xiaomi.getIScreenSize();
        Iphone.getUserName(FIRST_NAME, SECOND_NAME);
        try {
            iphone.call(FIRST_NAME);
        } catch (IphoneCallException e) {
            e.getMessage();
            e.printStackTrace();
        }
        try {
            xiaomi.getPrice();
        } catch (XiaomiPriceException e) {
            e.getMessage();
            e.printStackTrace();
        }
        try {
            samsung.getWeight();
        } catch (SamsungWightException e) {
            e.getMessage();
            e.printStackTrace();
        }
        try {
            samsung.call(FIRST_NAME);
        } catch (SamsungCallException e) {
            e.getMessage();
            e.printStackTrace();
        }
        try {
            Iphone.getColor();
        } catch (IphoneColorException e) {
            e.getMessage();
            e.printStackTrace();
        }

    }
}

