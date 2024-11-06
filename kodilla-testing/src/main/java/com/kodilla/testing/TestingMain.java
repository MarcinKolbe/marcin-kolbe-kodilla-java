package com.kodilla.testing;

import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();
        if (result.equals("theForumUser")) {
            System.out.println("Username test OK");
        } else {
            System.out.println("Username Error!");
        }

        Calculator calculator = new Calculator(7,2);

        int addResult = calculator.add();
        int subtractResult = calculator.subtract();
        if (addResult == 9) {
            System.out.println("Add test OK");
        } else {
            System.out.println("Add Error!");
        }
        if (subtractResult == 5) {
            System.out.println("Subtract test OK");
        } else {
            System.out.println("Subtract Error!");
        }
    }
}
