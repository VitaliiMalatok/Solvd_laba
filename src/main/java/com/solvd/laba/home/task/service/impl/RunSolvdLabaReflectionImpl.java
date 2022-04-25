package com.solvd.laba.home.task.service.impl;

import com.solvd.laba.home.task.service.IRunSolvdLabaReflection;
import com.solvd.laba.model.Iphone;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;

public class RunSolvdLabaReflectionImpl implements IRunSolvdLabaReflection {
    private static final Logger LOGGER = LogManager.getLogger(RunSolvdLabaReflectionImpl.class);

    @Override
    public void runSolvdLabaReflection() {
        analyzeClass(new Iphone());
    }

    public static void analyzeClass(Object o) {
        Class<?> aClass = o.getClass();
        LOGGER.info("Name of class: " + aClass);
        LOGGER.info("Fields of class: " + Arrays.toString(aClass.getDeclaredFields()));
        LOGGER.info("Parent class: " + aClass.getSuperclass());
        LOGGER.info("Method of class: " + Arrays.toString(aClass.getDeclaredMethods()));
        LOGGER.info("Constructor of class: " + Arrays.toString(aClass.getConstructors()));
    }
}
