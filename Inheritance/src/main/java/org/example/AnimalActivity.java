package org.example;

public class AnimalActivity {

    public static void main(String arg[]) {

        // Create Cat using Animal interface
        Animal cat = new Cat();

        // Create Dog using Animal interface
        Animal dog = new Dog();

        Mammal mammal = new Mammal("Flexy");

        // Set animal to Cat
        mammal.setAnimal(cat);

        // Cat sleeping
        mammal.animalIsSleeping();

        // Cat speaking
        mammal.animalIsSpeaking();

        // Set animal to Dog
        mammal.setAnimal(dog);

        // Dog sleeping
        mammal.animalIsSleeping();

        // Dog speaking
        mammal.animalIsSpeaking();

    }

}
