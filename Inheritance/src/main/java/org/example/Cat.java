package org.example;

public class Cat implements Animal {

    @Override
    public void animalSound() {

        IO.println("Cat says: 'Meow Meow'!");
    }

    @Override
    public void sleep() {

        IO.println("Cat is sleeping!");
    }

}
