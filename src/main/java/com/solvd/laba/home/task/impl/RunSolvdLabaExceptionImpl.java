package com.solvd.laba.home.task.impl;

import com.solvd.laba.exception.*;
import com.solvd.laba.model.Iphone;
import com.solvd.laba.model.Samsung;
import com.solvd.laba.model.Xiaomi;
import com.solvd.laba.home.task.IRunSolvdLabaException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class RunSolvdLabaExceptionImpl implements IRunSolvdLabaException {
    private static final int WEIGHT = -125;
    private static final int PRICE = 230;
    private static final String FIRST_NAME = "Vitalis";
    private static final Logger LOGGER = LogManager.getLogger(RunSolvdLabaExceptionImpl.class);

    @Override
    public void runSolvdLabaException() {
        Iphone iphone = new Iphone("SiliconLab", "Li-on", "Blue");
        Samsung samsung = new Samsung("Maxim", "TracoPower", WEIGHT);
        Xiaomi xiaomi = new Xiaomi("TexasInstr", "Li-pool", PRICE);
        try {
            iphone.call(FIRST_NAME);
        } catch (IphoneCallException e) {
            LOGGER.error(e.getMessage(), e);
        }
        try {
            xiaomi.getPrice();
        } catch (XiaomiPriceException e) {
            LOGGER.error(e.getMessage(), e);
        }
        try {
            samsung.getWeight();
        } catch (SamsungWightException e) {
            LOGGER.error(e.getMessage(), e);
        }
        try {
            samsung.call(FIRST_NAME);
        } catch (SamsungCallException e) {
            LOGGER.error(e.getMessage(), e);
        }
        try {
            iphone.getColor();
        } catch (IphoneColorException e) {
            LOGGER.error(e.getMessage(), e);
        }
    }
}
