
package org.example;

public class CalculatorClient {

    public static void main(String[] args) {

        // Create Calculator object
        Calculator normalCalc = new Calculator(Calculator.CALC_TYPE_BASIC);

        // Addition
        int result = normalCalc.add(4, 5);
        IO.println("Addition " + result);

        // Subtraction
        int subtractResult = normalCalc.subtract(10, 2);
        IO.println("Subtraction " + subtractResult);

        // Multiplication
        int[] mul = {2, 3, 4};
        int multiplyResult = normalCalc.multiply(mul);
        IO.println("Multiplication " + multiplyResult);

        // Division
        int divideResult = normalCalc.divide(10, 2);
        IO.println("Division " + divideResult);

        }
}
