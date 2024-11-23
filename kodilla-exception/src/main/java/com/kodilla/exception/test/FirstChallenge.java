package com.kodilla.exception.test;

public class FirstChallenge {
    public double divide(double a, double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException();
        }
        return a / b;
    }
    public double power(int base, int exponent) {
        double result = 1.0;
        if (base != 0 && exponent == 0) {
            return result;
        } else if (base == 0 && exponent > 0) {
            return result = 0.0;
        } else {
            for (int i = 1; i <= exponent; i++) {
                result *= base;
            }
            return result;
        }
    }
    /**
     * This main can throw an ArithmeticException!!!
     * @param args
     */
    public static void main(String[] args) {
        FirstChallenge firstChallenge = new FirstChallenge();
        try {
            double result = firstChallenge.divide(3, 0);
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("You can't divide by 0");
        } finally {
            System.out.println("Remember not to divide by 0");
        }
    }
}