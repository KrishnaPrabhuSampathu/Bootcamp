package org.example;

public class Rectangle extends Shape {

    // Calculate Rectangle Area
    @Override
    public double calculateArea(double length, double breadth, double radius) {

        return length * breadth;
    }

    // Calculate Rectangle Perimeter
    @Override
    public double calculatePerimeter(double length, double breadth, double radius) {

        return 2 * (length + breadth);
    }
}
