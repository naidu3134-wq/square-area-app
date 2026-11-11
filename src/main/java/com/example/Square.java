package com.example;

public class Square {
    private double side;

    public Square(double side) {
        if (side < 0) {
            throw new IllegalArgumentException("Side length cannot be negative");
        }
        this.side = side;
    }

    public double calculateArea() {
        return side * side;
    }

    public static void main(String[] args) {
        double sideLength = 4.0;
        Square square = new Square(sideLength);
        System.out.println("Area of square with side " + sideLength + " is: " + square.calculateArea());
    }
}