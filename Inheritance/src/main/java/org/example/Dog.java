package org.example;

public class Dog implements Animal {

    @Override
    public void animalSound() {

        IO.println("Dog says: 'Wuf Wuf'!");
    }

    @Override
    public void sleep() {

        IO.println("Dog is sleeping!");
    }

}
