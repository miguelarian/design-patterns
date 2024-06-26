package com.miguelvela;

public class Paramedic extends Player {
    private static final int POWER_POINTS = 10;

    public Paramedic(GameMediator mediator, String playerId) {
        super(mediator, playerId);
    }

    @Override
    protected final void executeAction(String playerId) {
        this.gameServer.cure(playerId, POWER_POINTS);
    }
}
