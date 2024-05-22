package com.miguelvela;

public interface GameMediator {
    void attack(String playerId, int attackPoints);
    void cure(String playerId, int lifePointsCured);
    void sendMessage(String playerId, String message);
}
