package Operators;

public class Calculation {
        public static void main(String[] args) {
            // Given values
            double x = 10;
            double y = 10;
            double z = 10;

            // Calculating the expression: cube root of (x^2 + y^2 - |z|)
            double result = Math.cbrt(Math.pow(x, 2) + Math.pow(y, 2) - Math.abs(z));

            // Output the result
            System.out.println("The result of the expression is: " + result);
        }
    }

