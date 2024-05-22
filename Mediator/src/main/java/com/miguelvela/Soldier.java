package com.miguelvela;

public class Soldier extends Player {

    private static final int POWER_POINTS = 10;

    public Soldier(GameMediator mediator, String playerId) {
        super(mediator, playerId);
    }

    @Override
    protected void executeAction(String playerId) {
        this.mediator.attack(playerId, POWER_POINTS);
    }
}
