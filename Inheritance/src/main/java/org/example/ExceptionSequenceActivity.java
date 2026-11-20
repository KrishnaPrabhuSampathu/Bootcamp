package org.example;

// Needs to be completed
// 1 - Find out the error in this program and share your finding with the instructor
public class ExceptionSequenceActivity {
    public static void main(String[] args) {
        new ExceptionSequenceActivity().divide(10, 0);
    }

    void divide(int num1, int num2) {
        try {
            IO.println(num1 / num2);
        } catch (Exception e) {
            IO.println("Exception!!!");
        } catch (ArithmeticException a) {
            IO.println("Division by zero is not allowed");
        }
    }
}