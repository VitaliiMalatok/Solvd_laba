package com.solvd.laba.service.impl;

import com.solvd.laba.model.Iphone;
import com.solvd.laba.model.Samsung;
import com.solvd.laba.model.Xiaomi;
import com.solvd.laba.service.IRunSolvdLabaBaseClasses;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class RunSolvdLabaBaseClassesImpl implements IRunSolvdLabaBaseClasses {

    private static final int BALANCE = 250;
    private static final int TIME_OF_HOURS = 5;
    private static final int WEIGHT = -125;
    private static final int PRICE = 230;
    private static final String FIRST_NAME = "Vitalis";
    private static final String SECOND_NAME = "Molotok";
    private static final String PERSON = "Alina";
    private static final String PERSON_NAME = "Polina";
    private static final Logger LOGGER = LogManager.getLogger(RunSolvdLabaBaseClassesImpl.class);

    @Override
    public void runProjectBaseClasses() {
        Iphone iphone = new Iphone("SiliconLab", "Li-on", "Blue");
        Samsung samsung = new Samsung("Maxim", "TracoPower", WEIGHT);
        Xiaomi xiaomi = new Xiaomi("TexasInstr", "Li-pool", PRICE);
        System.out.println(iphone + "\n" + samsung + "\n" + xiaomi);
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

