package services;

import people.Person;

import java.util.Comparator;

public class CustomComparator implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {
        return p1.getRole().getQueuePrecedence() - p2.getRole().getQueuePrecedence();
    }
}
