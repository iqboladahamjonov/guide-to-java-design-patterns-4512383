package com.example;

public class App {

    public static void main(String[] args) {
        var circle = new Circle(new Red()); // Red Circle
        circle.getType();
        circle.getColor().get();

        var square = new Square(new Blue()); // Blue Square
        square.getType();
        square.getColor().get();
    }

}
