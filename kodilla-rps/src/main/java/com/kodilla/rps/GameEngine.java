package com.kodilla.rps;

import java.util.Random;
import java.util.Scanner;

public class GameEngine {
    private int playerSymbol;
    private String playerSymbolString;
    private int cpuSymbol;
    private boolean end = false;
    String[] symbole = {"Kamień", "Papier", "Nożyce"};

    public void getStarted(GameParameters gameParameters) {
        gameParameters.setName();
        gameParameters.setWinsCount();
        System.out.println("Witam w grze Kamień, papier, nożyce!");
        System.out.println("Świetnie " + gameParameters.getName() + " zagramy do " + gameParameters.getWinsCount() + " zwycięstw!");
        game(gameParameters);
    }

    public void endGame(GameParameters gameParameters) {
        System.out.println("Dziękuję za grę " + gameParameters.getName() + "\nDo zobaczenia następnym razem!");
    }

    public void game(GameParameters gameParameters) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int playerWins = 0;
        int cpuWins = 0;
        System.out.println("1 kamień, 2 papier, 3 nożyce, x zakończ grę, n nowa gra");
        while (!end) {
            System.out.println("Twój ruch:");
            playerSymbol = getPlayerSymbol(sc);
            if (playerSymbol == 0) {
                confirmExit(sc, gameParameters);
                if (end) return;
                continue;
            }
            if (playerSymbol == -1) {
                confirmNewGame(sc, gameParameters);
                if (end) return;
                continue;
            }
            cpuSymbol = getCpuSymbol(random);
            System.out.println("Wybrałeś: " + symbole[playerSymbol - 1] + " CPU wybrał: " + symbole[cpuSymbol - 1]);
            int compareResult = symbolComparator(playerSymbol, cpuSymbol);
            if (compareResult == 0) {
                System.out.println("Remis!\n" + gameParameters.getName() + " " + playerWins + " : " + cpuWins + " CPU");
            } else if (compareResult == 1) {
                playerWins++;
                System.out.println("Wygrałeś!\n" + gameParameters.getName() + " " + playerWins + " : " + cpuWins + " CPU");
            } else {
                cpuWins++;
                System.out.println("Wygrałem!\n" + gameParameters.getName() + " " + playerWins + " : " + cpuWins + " CPU");
            }
            if ((playerWins == gameParameters.getWinsCount()) || (cpuWins == gameParameters.getWinsCount())) {
                System.out.println("Koniec gry!\n" + gameParameters.getName() + " " + playerWins + " : " + cpuWins + " CPU");
                end = true;
            }
        }
    }
    public void confirmExit(Scanner sc, GameParameters gameParameters) {
        System.out.println("Czy na pewno zakończyć grę? Wćiśnij t aby zakończyć.");
        String zakoncz = sc.nextLine();
        if (zakoncz.equalsIgnoreCase("t")) {
            endGame(gameParameters);
            end = true;
        } else System.out.println("Kontynuujemy grę");
    }
    public void confirmNewGame(Scanner sc, GameParameters gameParameters){
        System.out.println("Czy na pewno zakończyć aktualną grę? Wćiśnij t aby zakończyć.");
        String zakoncz = sc.nextLine();
        if (zakoncz.equalsIgnoreCase("t")) {
            getStarted(gameParameters);
        } else System.out.println("Kontynuujemy grę");
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
}