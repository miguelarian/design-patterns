package com.miguelvela;

public class SavedGame implements Memento {

    private String name;
    private int level;
    private int healthPoints;
    private Game game;

    public SavedGame(Game game, int level, int healhPoints, String name) {
        this.game = game;
        this.level = level;
        this.healthPoints = healhPoints;
        this.name = name;
    }

    @Override
    public int getLevel() {
        return this.level;
    }

    @Override
    public int getHealthPoints() {
        return this.healthPoints;
    }

    @Override
    public void restore() {
        this.game.loadSavedGame(this);
    }

    public String getName() {
        return this.name;
    }
}
