package com.solvd.laba.service.impl;

import com.solvd.laba.model.*;
import com.solvd.laba.service.IRunSolvdLabaCollection;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.*;

public class RunSolvdLabaCollectionImpl implements IRunSolvdLabaCollection {
    private static final String ADULT = "Adult: ";
    private static final int AGE_MAX = 18;
    private static final int COUNT_OF_PERSON = 10;
    private static final String FIRST_NAME = "Vitali";
    private static final String SECOND_NAME = "Molotok";
    private static final int MAX_AGE = 30;
    private static final int MIN_AGE = 15;
    private static final int BOUND = 10;
    private static final int COUNT_OF_IPHONE = 10;
    private static final String INFANT = "Infant: ";
    private static final String PROCESSOR_NAME = "Intel";
    private static final String COLOR_ID = "Color ID: ";
    private static final String XIAOMI = "Xiaomi";
    private static final String SAMSUNG = "Samsung";
    private static final String IPHONE = "Iphone";
    private Random random = new Random();
    private static final Logger LOGGER = LogManager.getLogger(RunSolvdLabaCollectionImpl.class);


    @Override
    public void runSolvdLabaCollection() {
        List<Person> personList = createPersonList();
        List<Iphone> iphoneList = createIphoneList();
        Map<Phone, Integer> samsungMap = createSamsungMap();
        Set<Phone> xiaomiList = createXiaomiSet();
        printXiaomi(xiaomiList);
        printSamsung(samsungMap);
        printPerson(personList);
        printIphone(iphoneList);
    }

    private Set<Phone> createXiaomiSet() {
        Set<Phone> xiaomiList = new HashSet<>();
        for (int i = 0; i < COUNT_OF_IPHONE; i++) {
            Phone xiaomi = new Xiaomi(XIAOMI + random.nextInt(BOUND), PROCESSOR_NAME + random.nextInt(BOUND), random.nextInt(BOUND));
            xiaomiList.add(xiaomi);
            LOGGER.info(xiaomi + "*** all phone");
        }
        return xiaomiList;
    }

    private Map<Phone, Integer> createSamsungMap() {
        Map<Phone, Integer> samsungMap = new HashMap<>();
        for (int i = 0; i < COUNT_OF_IPHONE; i++) {
            Phone samsung = new Samsung(SAMSUNG + random.nextInt(BOUND), PROCESSOR_NAME + random.nextInt(BOUND), random.nextInt(BOUND));
            samsungMap.put(samsung, i);
        }
        return samsungMap;
    }

    public List<Iphone> createIphoneList() {
        List<Iphone> iphoneList = new LinkedList<>();
        for (int i = 0; i < COUNT_OF_IPHONE; i++) {
            Iphone iphone = new Iphone();
            iphone.setBattery(IPHONE + random.nextInt(BOUND));
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

    private void printXiaomi(Set<Phone> xiaomiSet) {
        for (Phone xiaomi : xiaomiSet) {
            LOGGER.info(xiaomi + "*** unique phone");
        }
    }

    private void printSamsung(Map<Phone, Integer> samsungMap) {
        samsungMap.entrySet().stream()
                .sorted(Map.Entry.<Phone, Integer>comparingByValue().reversed())
                .forEach(LOGGER :: info);

    }
}

