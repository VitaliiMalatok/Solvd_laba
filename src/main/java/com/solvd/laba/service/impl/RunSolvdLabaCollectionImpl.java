package com.solvd.laba.service.impl;

import com.solvd.laba.model.Iphone;
import com.solvd.laba.model.Person;
import com.solvd.laba.service.IRunSolvdLabaCollection;

import java.util.*;

public class RunSolvdLabaCollectionImpl implements IRunSolvdLabaCollection {
    private static final int AGE_MAX = 18;
    private static final int COUNT_OF_PERSON = 20;
    private static final String FIRST_NAME = "Vitali";
    private static final String SECOND_NAME = "Molotok";
    public static final int MAX_AGE = 30;
    public static final int MIN_AGE = 15;
    public static final int BOUND = 9999;
    public static final int COUNT_OF_IPHONE = 10;
    private Random random = new Random();

    @Override
    public void runSolvdLabaCollection() {
        List<Person> personList = getPeople();
        List<Iphone> iphoneList = getIphone();
        printPerson(personList);
        printIphone(iphoneList);
    }

    public List<Iphone> getIphone() {
        List<Iphone> iphoneList = new LinkedList<>();
        for (int i = 0; i < COUNT_OF_IPHONE; i++) {
            Iphone iphone = new Iphone();
            iphone.setBattery("TracoPower" + random.nextInt(BOUND));
            iphone.setProcessor("Intel" + random.nextInt(BOUND));
            iphone.setColor("Color ID: " + random.nextInt(BOUND));
            iphoneList.add(iphone);
        }
        return iphoneList;
    }

    private List<Person> getPeople() {
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
                System.out.println("Adult: " + person);
            } else {
                System.out.println("Infant: " + person);
            }
        }
    }

    private void printIphone(List<Iphone> iphoneList) {
        for (Iphone iphone : iphoneList) {
            System.out.println(iphone);
        }
    }
}

