package services;

import people.Person;

public class CustomComparator {
        public boolean compare(Person p1, Person p2) {
            return p1.getRole().getQueuePrecedence() > p2.getRole().getQueuePrecedence();
        }
    }
}
