package com.solvd.laba.home.task.service.impl;

import com.solvd.laba.home.task.service.IRunSolvdLabaFunctionalInterface;
import com.solvd.laba.model.Person;
import com.solvd.laba.model.functional.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class RunSolvdLabaFunctionalInterfaceImpl implements IRunSolvdLabaFunctionalInterface {
    private static final int AGE = 10;
    private static final Logger LOGGER = LogManager.getLogger(RunSolvdLabaFunctionalInterfaceImpl.class);
    private static final String NAME = "Peter";
    private static final String SURNAME = "Parker";
    private static final int FIRST_NUMBER = 5;
    private static final int SECOND_NUMBER = -15;
    private static final String TEST_VALUE = "6783333";
    private static final int DIVIDED = 2;

    @Override
    public void runSolvdLabaFunctionalInterface() {
        IPersonFactory<Person> personFactory = Person :: new;
        Person person = personFactory.create(NAME, SURNAME, AGE);
        LOGGER.info(person);

        ISplitString splitString = (firstWord, secondWord) -> (firstWord + "***" + secondWord);
        LOGGER.info(splitString.split(NAME, SURNAME));

        IGetAverage getAverage = (firstNumber, secondNumber) -> (firstNumber + secondNumber) / DIVIDED;
        LOGGER.info(getAverage.result(FIRST_NUMBER, SECOND_NUMBER));

        ICompare myCompare = x -> x > 0;
        LOGGER.info(myCompare.test(FIRST_NUMBER));
        LOGGER.info(myCompare.test(SECOND_NUMBER));

        IFunction<String, Integer> valueConverter = Integer :: valueOf;
        LOGGER.info(valueConverter.apply(TEST_VALUE));
    }
}
