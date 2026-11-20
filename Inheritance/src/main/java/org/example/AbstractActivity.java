package org.example;

public class AbstractActivity {

    public static void main(String args[]) {

        // Create Rectangle object
        Rectangle rectangle = new Rectangle();

        rectangle.setColor("Blue");

        IO.println("Rectangle Color: " + rectangle.getColor());

        // Rectangle Area and Perimeter
        IO.println("Rectangle Area: " +
                rectangle.calculateArea(2, 4, 0));

        IO.println("Rectangle Perimeter: " +
                rectangle.calculatePerimeter(2, 4, 0));


        // Create Circle object
        Circle circle = new Circle();

        circle.setColor("Pink");

        IO.println("-----------------------------");

        IO.println("Circle Color: " + circle.getColor());

        // Circle Area and Perimeter
        IO.println("Circle Area: " +
                circle.calculateArea(0, 0, 5));

        IO.println("Circle Perimeter: " +
                circle.calculatePerimeter(0, 0, 5));

    }
}
