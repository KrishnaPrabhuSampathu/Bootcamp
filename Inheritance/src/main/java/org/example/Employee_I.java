package org.example;

public class Employee_I extends Person_I {

    // Attributes
    private double salary;
    private String title;

    // Default Constructor
    public Employee_I() {
        super();
        IO.println("I'm an Employee_I Constructor");
    }

    // Getter for salary
    public double getSalary() {
        return salary;
    }

    // Setter for salary
    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Getter for title
    public String getTitle() {
        return title;
    }

    // Setter for title
    public void setTitle(String title) {
        this.title = title;
    }
}