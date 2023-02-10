package com.m2code.singleton;

import java.io.Serial;
import java.io.Serializable;

public class SerializableSingleton implements Serializable {
    private static SerializableSingleton instance = null;

    // prevent to break using reflection
    private SerializableSingleton() {
        if (instance != null) throw new IllegalStateException("Object can't be created with reflection");
    }

    public static SerializableSingleton getInstance() {
        if (instance == null) {
            synchronized (SerializableSingleton.class) {
                if (instance == null) instance = new SerializableSingleton();
                return instance;
            }
        }
        return instance;
    }

    // prevent to break with Serialization
    @Serial
    protected Object readResolve() {
        return instance;
    }
}
