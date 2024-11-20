package com.kodilla.rps;

public class RpsRunner {
    public static void main(String[] args) {

        GameParameters gameParameters = new GameParameters();
        GameEngine gameEngine = new GameEngine();
        gameEngine.getStarted(gameParameters);
        }
    }