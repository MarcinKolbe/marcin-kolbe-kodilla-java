package com.kodilla.exception.test;

public class ExceptionHandling {

    public static void main(String[] args) {
        SecondChallenge secondChallenge = new SecondChallenge();

        try {
            String result = secondChallenge.probablyIWillThrowException(1.5,1.5);
            System.out.println(result);
        } catch (Exception e) {
            System.out.println("Podano błędne wartości: x powinien przyjąć wartośc między 1 a 2, y musi być różny od 1.5");
        } finally {
            System.out.println("Task completed");
        }
    }
}