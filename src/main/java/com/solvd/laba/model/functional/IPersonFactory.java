package com.solvd.laba.model.functional;

import com.solvd.laba.model.Person;

@FunctionalInterface
public interface IPersonFactory<P extends Person> {
    P create(String name, String surname, int age);
}
