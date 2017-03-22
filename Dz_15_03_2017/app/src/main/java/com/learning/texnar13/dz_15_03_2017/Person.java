package com.learning.texnar13.dz_15_03_2017;

import java.util.Comparator;

public class Person {
    private String name;
    private String surname;
    private int age;
    public static final Comparator<Person> NAME_COMPARATOR = new Comparator<Person>() {
        @Override
        public int compare(Person o1, Person o2) {
            return o1.getName().compareTo(o2.getName());
        }
    };
    public static final Comparator<Person> AGE_COMPARATOR = new Comparator<Person>() {
        @Override
        public int compare(Person o1, Person o2) {
            return o1.getAge() - o2.getAge();
        }
    };

    public Person(int age, String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String toString() {
        return "Person (age = " + this.age + ", name=" + this.name + ", surname=" + this.surname + ")";
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public int getAge() {
        return this.age;
    }
}


