package com.example;

public class App {

    public static void main(String[] args) {
        UserInterface redUserInterface = createUserInterface("RED");
        UserInterface blueUserInterface = createUserInterface("BLUE");

        System.out.println(redUserInterface);
        System.out.println(blueUserInterface);

    }

    private static UserInterface createUserInterface(String color) {
        var userInterfaceFactory = FactoryMaker.createFactory(color);
        var button = userInterfaceFactory.createButton();
        var scrollBar = userInterfaceFactory.createScrollBar();
        return new UserInterface(
                button,
                scrollBar);

    }

}
