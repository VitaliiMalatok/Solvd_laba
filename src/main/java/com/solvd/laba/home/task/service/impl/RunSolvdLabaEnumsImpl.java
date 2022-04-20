package com.solvd.laba.home.task.service.impl;

import com.solvd.laba.enums.PhoneCharacteristic;
import com.solvd.laba.home.task.service.IRunSolvdLabaEnums;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class RunSolvdLabaEnumsImpl implements IRunSolvdLabaEnums {
    private static final Logger LOGGER = LogManager.getLogger(RunSolvdLabaEnumsImpl.class);

    @Override
    public void runSolvdLabaEnums() {
        PhoneCharacteristic[] values = PhoneCharacteristic.values();
        for (PhoneCharacteristic value : values) {
            LOGGER.info(value);
        }
    }
}
