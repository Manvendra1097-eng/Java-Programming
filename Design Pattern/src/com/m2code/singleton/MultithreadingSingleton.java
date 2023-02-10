package com.m2code.singleton;

public class MultithreadingSingleton {
    private static MultithreadingSingleton instance = null;

    private MultithreadingSingleton() {
    }

    public MultithreadingSingleton getInstance() {
        if (instance == null) {
            synchronized (MultithreadingSingleton.class) {
                if (instance == null) {
                    instance = new MultithreadingSingleton();
                }
                return instance;
            }
        } else return instance;
    }
}
