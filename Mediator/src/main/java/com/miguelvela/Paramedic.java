package com.miguelvela;

public class Paramedic extends Player {
    private static final int POWER_POINTS = 10;

    public Paramedic(Mediator mediator, String playerId) {
        super(mediator, playerId);
    }

    @Override
    protected void executeAction(String playerId) {
        this.mediator.cure(playerId, POWER_POINTS);
    }
}
