package org.example;

public class AddWholeNum {
    static void main() {
        //Declaring the value
        int wholenumber = 0;

        for (int i = 50; i <= 100; i++) {
            wholenumber = wholenumber + i;
        }
        //Print the value of wholenumber from 50 to 100
        IO.println("wholenumber from 50 to 100 = " + wholenumber);
    }
}
