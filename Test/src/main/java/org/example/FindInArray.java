package org.example;

public class FindInArray {
    static void main() {
        int[] num = {100, 1, 4, 15};

        int largest = num[0];

        for (int i = 1; i < num.length; i++) {
            if (num[i] > largest) {
                largest = num[i];
            }
        }

        IO.println("Largest number in the given array = " + largest);
        }
    }
