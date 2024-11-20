package com.kodilla.rps;

import java.util.Scanner;

public class GameParameters {
    private String name;
    private int winsCount;

    public String getName() {
        return name;
    }
    public String setName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj imię:");
        name = scanner.nextLine();
        return name;
    }
    public int getWinsCount() {
        return winsCount;
    }
    public int setWinsCount() {
        System.out.println("Do ilu wygranych zagramy?");
        Scanner sc = new Scanner(System.in);
        winsCount = sc.nextInt();
        return winsCount;
    }
}