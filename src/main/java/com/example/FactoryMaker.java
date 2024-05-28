package com.example;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class FactoryMaker {
  private static Map<String, Supplier<UserInterfaceFactory>> userInterfaces = new HashMap<>();

  static {
    userInterfaces.put("RED", RedUserInterfaceFactory::new);
    userInterfaces.put("BLUE", BlueUserInterfaceFactory::new);
  }

  public static UserInterfaceFactory createFactory(String color) {
    if (userInterfaces.get(color) != null) {
      return userInterfaces.get(color).get();
    } else {
      throw new IllegalArgumentException("Color not supported");
    }
  }

}
