package com.solvd.laba.service.impl;

import com.solvd.laba.model.*;
import com.solvd.laba.service.IRunSolvdLabaCollection;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.*;

public class RunSolvdLabaCollectionImpl implements IRunSolvdLabaCollection {
    private static final String ADULT = "Adult: ";
    private static final int AGE_MAX = 18;
    private static final int COUNT_OF_PERSON = 20;
    private static final String FIRST_NAME = "Vitali";
    private static final String SECOND_NAME = "Molotok";
    private static final int MAX_AGE = 30;
    private static final int MIN_AGE = 15;
    private static final int BOUND = 9999;
    private static final int COUNT_OF_IPHONE = 5;
    private static final String INFANT = "Infant: ";
    private static final String BATTERY_NAME = "TracoPower";
    private static final String PROCESSOR_NAME = "Intel";
    private static final String COLOR_ID = "Color ID: ";
    private Random random = new Random();
    private static final Logger LOGGER = LogManager.getLogger(RunSolvdLabaCollectionImpl.class);


    @Override
    public void runSolvdLabaCollection() {
        List<Person> personList = createPersonList();
        List<Iphone> iphoneList = createIphoneList();
        Map<Phone, Integer> samsungIntegerMap = createSamsungMap();
        printSamsung(samsungIntegerMap);
        printPerson(personList);
        printIphone(iphoneList);
    }

    private Map<Phone, Integer> createSamsungMap() {
        Map<Phone, Integer> samsungMap = new HashMap<>();
        for (int i = 0; i < COUNT_OF_IPHONE; i++) {
            Phone samsung = new Samsung("Maxim" + random.nextInt(BOUND), "TracoPower" + random.nextInt(BOUND), random.nextInt(BOUND));
            samsungMap.put(samsung, i);
        }
        return samsungMap;
    }

    public List<Iphone> createIphoneList() {
        List<Iphone> iphoneList = new LinkedList<>();
        for (int i = 0; i < COUNT_OF_IPHONE; i++) {
            Iphone iphone = new Iphone();
            iphone.setBattery(BATTERY_NAME + random.nextInt(BOUND));
            iphone.setProcessor(PROCESSOR_NAME + random.nextInt(BOUND));
            iphone.setColor(COLOR_ID + random.nextInt(BOUND));
            iphoneList.add(iphone);
        }
        return iphoneList;
    }

    private List<Person> createPersonList() {
        List<Person> personList = new ArrayList<>();
        for (int i = 0; i < COUNT_OF_PERSON; i++) {
            Person person = new Person();
            person.setName(FIRST_NAME + random.nextInt(BOUND));
            person.setAge(randomGenerator(MAX_AGE, MIN_AGE));
            person.setSurname(SECOND_NAME + random.nextInt(BOUND));
            personList.add(person);
        }
        return personList;
    }

    public int randomGenerator(int max, int min) {
        return random.nextInt(max - min) + min;
    }

    private void printPerson(List<Person> personList) {
        for (Person person : personList) {
            if (person.getAge() >= RunSolvdLabaCollectionImpl.AGE_MAX) {
                LOGGER.info(ADULT + person);
            } else {
                LOGGER.info(INFANT + person);
            }
        }
    }

    private void printIphone(List<Iphone> iphoneList) {
        for (Iphone iphone : iphoneList) {
            LOGGER.info(iphone);
        }
    }

    private void printSamsung(Map<Phone, Integer> samsungMap) {
        for (Map.Entry<Phone, Integer> entry : samsungMap.entrySet()) {
            LOGGER.info(entry.getKey() + " " + entry.getValue());
        }
    }
}

