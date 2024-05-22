package com.miguelvela;

public interface Mediator {
    void attack(String playerId, int attackPoints);
    void cure(String playerId, int lifePointsCured);
    void sendMessage(String playerId, String message);
}
