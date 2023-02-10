package com.m2code.builder;

public class Main {
    public static void main(String[] args) {
        Person person = new Person.PersonBuilder().firstname("Manvendra")
                .lastname("Singh")
                .build();
        System.out.println(person.getFirstname());
    }
}
