package com.miguelvela;

public class Main {
    public static void main(String[] args) {
        Game game = new Game();
        GameRunner gameRunner = new GameRunner();
        game.decreaseHealthPoints();
        game.decreaseHealthPoints();
        game.increaseLevel();
        gameRunner.saveGame(game.saveGame("Level 1 completed"));
        game.increaseLevel();
        gameRunner.saveGame(game.saveGame("Level 2 completed"));
        game.decreaseHealthPoints();
        gameRunner.showSavedGames();
        gameRunner.loadSavedGame("Level 2 completed");
    }
}