package com.compareexample;

import java.util.Comparator;

/**
 * Created by bogdan on 12-Jun-16.
 */
public class PersonNameComparator implements Comparator<Person> {
    @Override
    public int compare(Person person1, Person person2) {
        return person1.getName().compareTo(person2.getName());
    }
}
