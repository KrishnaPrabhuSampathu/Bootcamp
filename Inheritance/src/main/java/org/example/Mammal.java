package org.example;

public class Mammal {

    private Animal myAnimal;
    private String name;

    // Constructor
    public Mammal(String name) {
        this.name = name;
    }

    public void setAnimal(Animal animal) {
        myAnimal = animal;
    }

    public void animalIsSleeping() {

        IO.println("Animal with name: " + name + " is ...");

        // Call sleep implementation
        myAnimal.sleep();
    }

    public void animalIsSpeaking() {

        IO.println("Animal with name: " + name + " is ...");

        // Call animalSound implementation
        myAnimal.animalSound();
    }
}
