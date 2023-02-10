package com.m2code.singleton;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        exampleSerialization();
    }

    //    this will break the Singleton pattern
    private static void exampleSerialization() throws IOException, ClassNotFoundException {
        LazySingleton lazySingleton = LazySingleton.getInstance();
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("object.obj"));
        oos.writeObject(lazySingleton);
        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("object.obj"));
        LazySingleton readObject = (LazySingleton) ois.readObject();
        ois.close();

        System.out.println("Hash code of lazySingleton : " + lazySingleton.hashCode());
        System.out.println("Hash code of returnObject : " + readObject.hashCode());


        SerializableSingleton serializableSingleton = SerializableSingleton.getInstance();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream
                (new FileOutputStream("serial.obj"));
        objectOutputStream.writeObject(serializableSingleton);
        objectOutputStream.close();

        ObjectInputStream objectInputStream = new ObjectInputStream
                (new FileInputStream("serial.obj"));
        SerializableSingleton serializedObject = (SerializableSingleton)
                objectInputStream.readObject();
        objectInputStream.close();

        System.out.println("Hash code of serializableSingleton : " + serializableSingleton.hashCode());
        System.out.println("Hash code of serializedObject : " + serializedObject.hashCode());
    }
}
