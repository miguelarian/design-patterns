package com.miguelvela;

public class Main {
    public static void main(String[] args) {

        GameServer gameServer = new GameServer();

        Player soliderA1 = new Soldier(gameServer, "soliderA1");
        Player soliderA2 = new Soldier(gameServer, "soliderA2");
        Player paramedicA = new Paramedic(gameServer, "paramedicA");

        Player soliderB1 = new Soldier(gameServer, "soliderB1");
        Player soliderB2 = new Soldier(gameServer, "soliderB2");

        gameServer.registerPlayer(soliderA1);
        gameServer.registerPlayer(soliderA2);
        gameServer.registerPlayer(soliderB1);
        gameServer.registerPlayer(soliderB2);
        gameServer.registerPlayer(paramedicA);

        soliderA1.executeAction(soliderB1.getId());
        soliderB2.executeAction(soliderA2.getId());
        paramedicA.executeAction(soliderA1.getId());

        soliderB2.executeAction(soliderA2.getId());
        soliderB1.executeAction(soliderA2.getId());
        soliderB2.executeAction(soliderA2.getId());
        soliderB1.executeAction(soliderA2.getId());
        soliderB1.sendMessage(soliderA2.getId(), "I killed you!");
        paramedicA.executeAction(soliderA2.getId());
    }
}