package com.miguelvela;

import java.util.ArrayList;
import java.util.List;

public class GameRunner {
    private final List<SavedGame> savedGames;

    public GameRunner() {
        this.savedGames = new ArrayList<>();
    }

    public void loadSavedGame(String savedGameName) {
        SavedGame savedGame = this.savedGames.stream()
                .filter(sg -> sg.getName().equals(savedGameName))
                .findFirst()
                .orElse(null);

        if (savedGame == null) {
            System.out.println("Saved [" + savedGame + "] game not found");
            return;
        }

        savedGame.restore();
    }

    public void showSavedGames() {
        this.savedGames.forEach(sg -> System.out.println(sg.getName()));
    }

    public void saveGame(SavedGame savedGame) {
        this.savedGames.add(savedGame);
    }
}