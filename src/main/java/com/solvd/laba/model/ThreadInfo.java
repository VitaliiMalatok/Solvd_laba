package com.solvd.laba.model;

import com.solvd.laba.home.task.service.impl.RunSolvdLabaCollectionImpl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;


public class ThreadInfo implements Runnable {
    private static final Logger LOGGER = LogManager.getLogger(ThreadInfo.class);

    Date date = new Date();
    LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
    int year = localDate.getYear();
    int month = localDate.getMonthValue();
    int day = localDate.getDayOfMonth();


    @Override
    public void run() {
        RunSolvdLabaCollectionImpl runSolvdLabaCollection = new RunSolvdLabaCollectionImpl();
        LOGGER.info(day + "/" + month + "/" + year + "-" + Thread.currentThread().getName() +
                runSolvdLabaCollection.createIphoneList());
    }
}
