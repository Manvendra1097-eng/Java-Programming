package com.m2code.singleton;

import java.io.Serializable;

/*
 * 1.Make constructor private
 * 2.Make a static variable of that class
 * 3.Make static method to get instance of object
 * 4.All property in this class should be static and instantiated
 * 5.But this will not work with multithreading environment as if two thread enter into null check at same time
 * 6.So we can use Eager initialization but, it causes loss of memory issue if we are not using object than also it's created
 */

public class LazySingleton implements Serializable {
    private LazySingleton() {
    }

    private static LazySingleton lazySingleton = null;

    public static LazySingleton getInstance() {
        if (lazySingleton == null) {
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }
}
