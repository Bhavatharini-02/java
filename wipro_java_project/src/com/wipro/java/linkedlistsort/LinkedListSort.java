package com.wipro.java.linkedlistsort;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.Collections;

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}

// Comparator to sort by name
class NameComparator implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {
        return p1.name.compareTo(p2.name);
    }
}

// Comparator to sort by age
class AgeComparator implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {
        return Integer.compare(p1.age, p2.age);
    }
}

public class LinkedListSort {
    public static void main(String[] args) {
        LinkedList<Person> people = new LinkedList<>();
        people.add(new Person("Alice", 30));
        people.add(new Person("Bob", 25));
        people.add(new Person("Charlie", 35));
        people.add(new Person("David", 28));

        // Sorting by name
        Collections.sort(people, new NameComparator());
        System.out.println("Sorted by Name:");
        for (Person person : people) {
            System.out.println(person);
        }

        // Sorting by age
        Collections.sort(people, new AgeComparator());
        System.out.println("\nSorted by Age:");
        for (Person person : people) {
            System.out.println(person);
        }
    }
}
