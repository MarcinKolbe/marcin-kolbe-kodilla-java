package com.kodilla.rps;

import java.util.Random;
import java.util.Scanner;

public class GameEngine {
    private int winsCount;
    private int playerSymbol;
    private String playerSymbolString;
    private int cpuSymbol;
    private boolean end = false;
    Scanner sc = new Scanner(System.in);
    Random random = new Random();
    String[] symbole = {"Kamień", "Papier", "Nożyce"};

    public void game(User user) {
        Console console = new Console();
        int playerWins = 0;
        int cpuWins = 0;
        console.availableKeys();
        while (!end) {
            console.yourTurn();
            playerSymbol = getPlayerSymbol(sc);
            if (playerSymbol == 0) {
                if (console.confirmExit()) {
                    console.byebye(user);
                    return;
                } else continue;
            } else if (playerSymbol == -1) {
                if (console.confirmNewGame()) return;
                continue;
            }
            cpuSymbol = getCpuSymbol(random);
            System.out.println("Wybrałeś: " + symbole[playerSymbol - 1] + " CPU wybrał: " + symbole[cpuSymbol - 1]);
            int compareResult = symbolComparator(playerSymbol, cpuSymbol);
            if (compareResult == 0) {
                console.draw(user, playerWins, cpuWins);
            } else if (compareResult == 1) {
                playerWins++;
                console.playerWin(user, playerWins, cpuWins);
            } else {
                cpuWins++;
                console.cpuWin(user, playerWins, cpuWins);
            }
            if ((playerWins == winsCount) || (cpuWins == winsCount)) {
                console.endGame(user, playerWins, cpuWins);
                console.byebye(user);
                end = true;
            }
        }
    }
    public int symbolComparator(int playerSymbol, int cpuSymbol) {
        if (playerSymbol == cpuSymbol) {
            return 0;
        } else if ((playerSymbol == 1 && cpuSymbol == 3) || (playerSymbol == 2 && cpuSymbol == 1) || (playerSymbol == 3 && cpuSymbol == 2)) {
            return 1;
        } else {
            return -1;
        }
    }
    public int getPlayerSymbol(Scanner sc) {
        playerSymbolString = sc.nextLine();
        if (playerSymbolString.equalsIgnoreCase("x")) {
            return 0;
        } else if (playerSymbolString.equalsIgnoreCase("n")) {
            return -1;
        } else {
            return Integer.parseInt(playerSymbolString);
        }
    }
    public int getCpuSymbol(Random random) {
        return 1 + random.nextInt(3);
    }
    public void setWinsCount() {
        System.out.println("Do ilu wygranych zagramy?");
        Scanner sc = new Scanner(System.in);
        winsCount = sc.nextInt();
    }
    public int getWinsCount() {
        return winsCount;
    }
}