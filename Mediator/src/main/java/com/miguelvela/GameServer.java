package com.miguelvela;

import java.util.ArrayList;
import java.util.List;

public class GameServer implements Mediator {

    private List<Player> players;

    public GameServer() {
        this.players = new ArrayList<>();
    }

    public void registerPlayer(Player player) {
        players.add(player);
    }

    @Override
    public void attack(String playerId, int attackPoints) {
        Player player = findPlayer(playerId);
        if (player == null) {
            System.out.println("Player not found " + playerId + " in attach");
        }

        player.reduceLifePoints(attackPoints);

        System.out.println("Player " + playerId + " attached with " + attackPoints);
        if (player.isDead()) {
            System.out.println("Attach result: Player " + playerId + " is dead");
        } else {
            System.out.println("Player " + playerId + " has " + player.getLifePoints() + " life points remaining");
        }
    }

    @Override
    public void cure(String playerId, int lifePointsCured) {
        Player player = findPlayer(playerId);
        if (player == null) {
            System.out.println("Player not found ("+playerId+")" + " in attach");
        }

        boolean playerWasDead = player.isDead();

        player.addLifePoints(lifePointsCured);

        System.out.println("Player " + playerId + " is cured with " + lifePointsCured + " - now " + player.getLifePoints() + " life points");
        if (playerWasDead) {
            System.out.println("Player " + playerId + " is back to life with " + player.getLifePoints() + " life points");
        }
    }

    @Override
    public void sendMessage(String playerId, String message) {
        System.out.println("Message to " + playerId + ": " + message);
    }

    private Player findPlayer(String playerId) {
        return players.stream()
                .filter(player -> player.getId().equals(playerId))
                .findFirst()
                .orElse(null);
    }
}
