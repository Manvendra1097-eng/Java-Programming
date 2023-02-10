package com.m2code.mutable;

/*
    private,final field for each piece of data
    getter for each field
    public constructor with a corresponding argument for each field
    equals method that returns true for objects of the same class when all fields match
    hashCode method that returns the same value when all fields match
    toString method that includes the name of the class and the name of each field and its corresponding value
*/


/* *
import java.util.Objects;

final class MutableClass {
        private final String name;
        private final String email;
        private final Address address;

        MutableClass(String name, String email, Address address) {
            this.name = name;
            this.email = email;
            this.address = address;
        }

        public String getName() {
            return name;
        }

        public String getEmail() {
            return email;
        }

        public Address getAddress() {
            return new Address(address.getCity(), address.getState());
        }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MutableClass that = (MutableClass) o;
        return Objects.equals(name, that.name) && Objects.equals(email, that.email) && Objects.equals(address, that.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, email, address);
    }
}
*/

record MutableClass(String name, String email, Address address) {
    @Override
    public Address address() {
        return new Address(address.getCity(), address.getState());
    }
}


