package service.impl;

import model.Iphone;
import model.Phone;
import model.Samsung;
import model.Xiaomi;
import service.ISolvdLaba;


public class SolvdLabaImpl implements ISolvdLaba {
    @Override
    public void runProject() {
        Phone iphone = new Iphone("SiliconLab", "Li-on", "Blue");
        Phone samsung = new Samsung("Maxim", "TracoPower", 125);
        Phone xiaomi = new Xiaomi("TexasInstr", "Li-pool", 230);
        System.out.println(iphone + "\n" +
                samsung + "\n" +
                xiaomi);
        iphone.call("Vitali");
        samsung.sendMessage("Alina");
        xiaomi.sendMessage("Polina");
    }
}