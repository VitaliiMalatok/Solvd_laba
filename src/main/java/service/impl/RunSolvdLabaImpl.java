package service.impl;

import model.Iphone;
import model.Samsung;
import model.Xiaomi;
import service.IRunSolvdLaba;

public class RunSolvdLabaImpl implements IRunSolvdLaba {

    public static final int BALANCE = 250;
    public static final int TIME_OF_HOURS = 5;
    public static final int WEIGHT = 125;
    public static final int PRICE = 230;
    public static final String FIRST_NAME = "Vitali";
    public static final String SECOND_NAME = "Molotok";
    public static final String PERSON = "Alina";
    public static final String PERSON_NAME = "Polina";

    @Override
    public void runProject() {
        Iphone iphone = new Iphone("SiliconLab", "Li-on", "Blue");
        Samsung samsung = new Samsung("Maxim", "TracoPower", WEIGHT);
        Xiaomi xiaomi = new Xiaomi("TexasInstr", "Li-pool", PRICE);
        System.out.println(iphone + "\n" +
                samsung + "\n" +
                xiaomi);
        iphone.call(FIRST_NAME);
        samsung.sendMessage(PERSON);
        xiaomi.sendMessage(PERSON_NAME);
        iphone.getBalance(BALANCE);
        samsung.getChargingTime(TIME_OF_HOURS);
        iphone.getNetworkType();
        xiaomi.getIRam();
        xiaomi.getIScreenSize();
        Iphone.getUserName(FIRST_NAME, SECOND_NAME);
    }
}

