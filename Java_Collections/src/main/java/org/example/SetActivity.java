package org.example;


import java.util.HashSet;
import java.util.Set;

public class SetActivity {

    public static void main(String[] args) {

        // TODO: 1 - Type code to create a set of names using HashSet.
        Set<String> names = new HashSet<>();

        // Add "John", "John", "Harry", and "Daniel" (and try adding a few more duplicate entries).
        names.add("John");
        names.add("John");
        names.add("Harry");
        names.add("Daniel");
        names.add("Krishna");
        names.add("Krishna");
        names.add("Krishna Prabhu");

        // TODO: 2 - Call print method to print the set passed as its parameter.
        print(names);

    }

    static void print(Set set) {

        // TODO: 3 - Type code to print this set
        System.out.println(set);

    }

}

