package com.kodilla.rps;

import java.util.Scanner;

public class Console {

    public void getStarted(User user, GameEngine gameEngine) {
        System.out.println("Witam w grze Kamień, papier, nożyce!");
        user.setName();
        gameEngine.setWinsCount();
        System.out.println("Świetnie " + user.getName() + " zagramy do " + gameEngine.getWinsCount() + " zwycięstw!");
        gameEngine.game(user);
    }
    public void availableKeys() {
        System.out.println("1 kamień, 2 papier, 3 nożyce, x zakończ grę, n nowa gra");
    }
    public void yourTurn() {
        System.out.println("Twój ruch:");
    }
    public void draw(User user, int playerWins, int cpuWins) {
        System.out.println("Remis!\n" + user.getName() + " " + playerWins + " : " + cpuWins + " CPU");
    }
    public void playerWin(User user, int playerWins, int cpuWins) {
        System.out.println("Wygrałeś!\n" + user.getName() + " " + playerWins + " : " + cpuWins + " CPU");
    }
    public void cpuWin(User user, int playerWins, int cpuWins) {
        System.out.println("Wygrałem!\n" + user.getName() + " " + playerWins + " : " + cpuWins + " CPU");
    }
    public void endGame(User user, int playerWins, int cpuWins) {
        System.out.println("Koniec gry!\n" + user.getName() + " " + playerWins + " : " + cpuWins + " CPU");
    }
    public void byebye(User user) {
        System.out.println("Dziękuję za grę " + user.getName() + "\nDo zobaczenia następnym razem!");
    }
    public boolean confirmExit() {
        System.out.println("Czy na pewno zakończyć grę? Wćiśnij t aby zakończyć.");
        String zakoncz = new Scanner(System.in).nextLine();
        if (zakoncz.equalsIgnoreCase("t")) {
            return true;
        } else {
            System.out.println("Kontynuujemy grę");
            return false;
        }
    }
    public boolean confirmNewGame() {
        System.out.println("Czy na pewno zakończyć aktualną grę? Wćiśnij t aby zakończyć.");
        String zakoncz = new Scanner(System.in).nextLine();
        if (zakoncz.equalsIgnoreCase("t")) {
            getStarted(new User(), new GameEngine());
            return true;
        } else {
            System.out.println("Kontynuujemy grę");
            return false;
        }
    }
}