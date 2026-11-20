package org.example;

public abstract class Shape {

    public String color;

    public Shape() {

    }

    // Abstract method to calculate area
    public abstract double calculateArea(double length, double breadth, double radius);

    // Abstract method to calculate perimeter
    public abstract double calculatePerimeter(double length, double breadth, double radius);

    public void setColor(String c) {
        color = c;
    }

    public String getColor() {
        return color;
    }
}
