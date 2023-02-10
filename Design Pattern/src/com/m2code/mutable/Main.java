package com.m2code.mutable;

public class Main {
    public static void main(String[] args) {
        Address address = new Address("Kasia", "Uttar Pradesh");

        MutableClass mutableClass = new MutableClass("Manvendra", "test@gmail.com", address);
        System.out.println("before ===>"+mutableClass);
        Address address1 = mutableClass.address();
        address1.setCity("Kasiya");
        MutableClass mutableClass_ = new MutableClass("Manvendra", "test@gmail.com", address);

        System.out.println(mutableClass);
        System.out.println(mutableClass_);

        System.out.println(mutableClass_.hashCode());
        System.out.println(mutableClass.hashCode());
    }
}
