package com.miguelvela;

public class Game {
    private int level;
    private int healhPoints;

    public Game() {
        this.level = 1;
        this.healhPoints = 30;
    }

    public void loadSavedGame(SavedGame savedGame) {
        this.level = savedGame.getLevel();
        this.healhPoints = savedGame.getHealthPoints();
        System.out.println("Game loaded: [" + savedGame.getName() + " Level: " + this.level + " Health points: " + this.healhPoints + "]");
    }

    public SavedGame saveGame(String savedGameName) {
        System.out.println("Saving game: [" + savedGameName + " Level: " + this.level + " Health points: " + this.healhPoints + "]");
        return new SavedGame(this, this.level, this.healhPoints, savedGameName);
    }

    public void increaseLevel() {
        this.level++;
        System.out.println("Congratulations, level completed!");
        System.out.println("Current level: " + this.level);
    }

    public void decreaseHealthPoints() {
        this.healhPoints = Math.max(0, this.healhPoints - 10);
        System.out.println("Health points: " + this.healhPoints);
        if (this.healhPoints == 0) {
            System.out.println("Game over");
        }
    }

    public void increaseHealthPoints() {
        this.healhPoints = Math.min(100, this.healhPoints + 10);
        System.out.println("Health points: " + this.healhPoints);
    }
}
