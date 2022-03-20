package service.impl;

import model.Iphone;
import model.Samsung;
import model.Xiaomi;
import service.IRunSolvdLaba;

public class RunSolvdLabaImpl implements IRunSolvdLaba {
    @Override
    public void runProject() {
        Iphone iphone = new Iphone("SiliconLab", "Li-on", "Blue");
        Samsung samsung = new Samsung("Maxim", "TracoPower", 125);
        Xiaomi xiaomi = new Xiaomi("TexasInstr", "Li-pool", 230);
        System.out.println(iphone + "\n" +
                samsung + "\n" +
                xiaomi);
        iphone.call("Vitali");
        samsung.sendMessage("Alina");
        xiaomi.sendMessage("Polina");
        iphone.getBalance(250);
        samsung.getChargingTime(5);
        iphone.getNetworkType();
        xiaomi.getIRam();
        xiaomi.getIScreenSize();
    }
}

