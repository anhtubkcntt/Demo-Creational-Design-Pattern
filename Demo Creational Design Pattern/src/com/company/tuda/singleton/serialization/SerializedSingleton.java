package com.company.tuda.singleton.serialization;

import java.io.ObjectStreamException;
import java.io.Serializable;

public class SerializedSingleton implements Serializable {

  private static final long serialVersionUID = -7604766932017737115L;

  private SerializedSingleton(){}

  private static class SingletonHelper{
    private static final SerializedSingleton instance = new SerializedSingleton();
  }

  public static SerializedSingleton getInstance(){
    return SingletonHelper.instance;
  }

  static Object readResolve() throws ObjectStreamException {
    return SingletonHelper.instance;
  }
}
