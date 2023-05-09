package com.panion;

import java.time.LocalDate;
import java.time.Period;

/*
 * An Immutable class
 * More Accurately, its a class definition written in such a way that
 * instances of it (person objects) once created cant have their properties changed.
 *
 * In the code this simply means no public setters.
 */
class Person {
    private final String name;
    private final LocalDate birthday;

    public Person(String name, LocalDate birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }
    /*
     * Returns the person's age in whole years
     * HINT: See a class in package java.time that can help you get
     * the period of time between two dates
     */
    public int getAge() {
        return Period.between(getBirthday(),LocalDate.now()).getYears();
    }

    @Override
    public String toString() {
        return String.format("Person: name = %s, birthDate = %s", getName(),getBirthday());
    }
}