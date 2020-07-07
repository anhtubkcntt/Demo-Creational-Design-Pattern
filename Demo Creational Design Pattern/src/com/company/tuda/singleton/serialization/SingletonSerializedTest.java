package com.company.tuda.singleton.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class SingletonSerializedTest {

  public static void main(String[] args) throws IOException, ClassNotFoundException {

    SerializedSingleton serializedSingleton1 = SerializedSingleton.getInstance();
    SerializedSingleton serializedSingleton2 = (SerializedSingleton) SerializedSingleton.readResolve();
    EnumSingleton enumSingleton1 = EnumSingleton.INSTANCE;

    ObjectOutput out = new ObjectOutputStream(new FileOutputStream("SingletonSerializedTest.txt"));
    out.writeObject(serializedSingleton1);
    out.writeObject(serializedSingleton2);
    out.writeObject(enumSingleton1);
    out.close();

    // De-serialize from file to object
    ObjectInput in = new ObjectInputStream(new FileInputStream("SingletonSerializedTest.txt"));
    SerializedSingleton serializedSingleton11 = (SerializedSingleton) in.readObject();
    SerializedSingleton serializedSingleton22 = (SerializedSingleton) in.readObject();
    EnumSingleton enumSingleton2 = (EnumSingleton) in.readObject();
    in.close();

    System.out.println("serializedSingleton1 hashCode=" + serializedSingleton1.hashCode());
    System.out.println("serializedSingleton11 hashCode=" + serializedSingleton11.hashCode());
    System.out.println("serializedSingleton2 hashCode=" + serializedSingleton2.hashCode());
    System.out.println("serializedSingleton22 hashCode=" + serializedSingleton22.hashCode());
    System.out.println("enumSingleton1 hashCode=" + enumSingleton1.hashCode());
    System.out.println("enumSingleton2 hashCode=" + enumSingleton2.hashCode());
  }
}
