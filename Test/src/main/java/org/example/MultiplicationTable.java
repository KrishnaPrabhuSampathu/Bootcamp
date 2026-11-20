package org.example;

public class MultiplicationTable {
    static void main() {
        //Declaring the variable
        int i , j ;

        for ( i = 11; i <= 20; i++) {
            for ( j = 1; j <= 10; j++)
                IO.println(i + " x " + j + " = " + (i * j));
        }

    }
}
