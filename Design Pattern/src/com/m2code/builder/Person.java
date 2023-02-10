package com.m2code.builder;

// It's comes under creation design pattern
//
public class Person {
    private String firstname;
    private String lastname;
    private int age;
    private String email;

    private Person(PersonBuilder builder) {
        this.firstname = builder.firstname;
        this.age = builder.age;
        this.email = builder.email;
        this.lastname = builder.lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public static class PersonBuilder {
        private String firstname;
        private String lastname;
        private int age;
        private String email;


        public PersonBuilder firstname(String firstname) {
            this.firstname = firstname;
            return this;
        }

        public PersonBuilder lastname(String lastname) {
            this.lastname = lastname;
            return this;
        }

        public PersonBuilder email(String email) {
            this.email = email;
            return this;
        }

        public PersonBuilder age(int age) {
            this.age = age;
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }
}
