package com.kodilla.rps;

public class RpsRunner {
    public static void main(String[] args) {

        Console console = new Console();
        console.getStarted(new User(), new GameEngine());
        }
    }