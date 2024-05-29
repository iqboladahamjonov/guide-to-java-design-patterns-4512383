package com.example;

import java.util.HashMap;
import java.util.Map;

public class FactoryMaker {
  private static Map<String, UserInterfaceFactory> userInterfaces = new HashMap<>();

  static {
    userInterfaces.put("RED", new RedUserInterfaceFactory());
    userInterfaces.put("BLUE", new BlueUserInterfaceFactory());
  }

  public static UserInterfaceFactory createFactory(String color) {
    if (userInterfaces.get(color) != null) {
      return userInterfaces.get(color);
    } else {
      throw new IllegalArgumentException("Color not supported");
    }
  }

}
