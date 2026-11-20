
package org.example;

public class Calculator {

    private String calculatorType;

    public static final String CALC_TYPE_BASIC = "Basic";

    // Default constructor
    public Calculator() {
        calculatorType = CALC_TYPE_BASIC;
    }

    // Parameterized constructor accepting calculatorType
    public Calculator(String calculatorType) {
        this.calculatorType = calculatorType;
    }

    // Getter for CalculatorType
    public String getCalculatorType() {
        return calculatorType;
    }

    // Setter for CalculatorType
    public void setCalculatorType(String calculatorType) {
        this.calculatorType = calculatorType;
    }
    // Addition
    public int add(int x, int y) {
        return x + y;
    }
    //Subtraction
    public int subtract(int x, int y) {
        if (x > y) {
            return x - y;
        } else {
            return y - x;
        }
    }
    //Multiplication
    public int multiply(int[] numbers) {
        int temp = 1;

        for (int i = 0; i < numbers.length; i++) {
            temp = temp * numbers[i];
        }

        return temp;
    }
    //Division
    public int divide(int x, int y) {
        if (y == 0) {
            System.out.println("Error: Cannot divide by zero");
            return 0;
        }

        return x / y;
    }
}
