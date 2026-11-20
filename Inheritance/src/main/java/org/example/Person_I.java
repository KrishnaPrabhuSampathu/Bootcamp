package org.example;

public class Person_I {

    // Attributes
    private String name;
    private int age;

    // Default Constructor
    public Person_I() {
        IO.println("I'm Person_I constructor");
    }

    // Parameterized Constructor
    public Person_I(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age
    public void setAge(int age) {
        this.age = age;
    }
}