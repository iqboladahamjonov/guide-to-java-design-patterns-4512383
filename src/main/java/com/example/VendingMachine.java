package com.example;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class VendingMachine {

    private static final Map<String, Supplier<Snack>> drinkMap = new HashMap();

    static {
        drinkMap.put("ChocolateBar", () -> new ChocolateBar());
        drinkMap.put("Chips", () -> new Chips());
        drinkMap.put("Drink", () -> new Drink());
    }

    Snack getSnack(String snackType) {
        if (drinkMap.get(snackType) != null) {
            return drinkMap.get(snackType).get();
        } else {
            throw new IllegalArgumentException("Invalid snack type: " + snackType);
        }
    }

}
