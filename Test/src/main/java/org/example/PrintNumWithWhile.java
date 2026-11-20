package org.example;

public class PrintNumWithWhile {
    static void main() {
        //Declaring the variable
        int i = 1;

        while (i < 100) {
            IO.println(i);
            i += 2;
        }
        IO.println( "end of the while loop");
    }
}
