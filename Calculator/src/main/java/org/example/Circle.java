package org.example;

public class Circle extends Shape {

    // Calculate Circle Area
    @Override
    public double calculateArea(double length, double breadth, double radius) {

        return Math.PI * radius * radius;
    }

    // Calculate Circle Perimeter (Circumference)
    @Override
    public double calculatePerimeter(double length, double breadth, double radius) {

        return 2 * Math.PI * radius;
    }
}
