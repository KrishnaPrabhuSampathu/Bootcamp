package org.example;

public class ArithmeticExceptionActivity {

    // TODO: 1 - Type main method

    public static void main(String[] args) {

        // TODO: 2 - Create an instance of ArithmeticExceptionActivity

        ArithmeticExceptionActivity obj = new ArithmeticExceptionActivity();

        // call catchMe with 10 and 0

        obj.catchMe(10, 0);

        // TODO: 5 - Try to call catchMe with 10 and 2 now and see which messages get printed
        obj.catchMe(10, 2);
    }

    void catchMe(int num1, int num2) {

        try {

            // TODO: 3 - Identify the exception and write code to handle this exception.
            int result = num1 / num2;

            IO.println("The result is :" + result);

        } catch (ArithmeticException e) {

            IO.println("Error: Cannot divide a number by zero!");

            // TODO: 4 - After handling the exception, write a finally block which
        } finally {

            // prints a message "Thank you for using this program."
            IO.println("Thank you for using this program.");

        }
    }
}

