package com.kodilla.rps;

import java.util.Scanner;

public class User {
    private String name;

    public String getName() {
        return name;
    }
    public String setName() {
        System.out.println("Podaj imię:");
        name = new Scanner(System.in).nextLine();
        return name;
    }
}