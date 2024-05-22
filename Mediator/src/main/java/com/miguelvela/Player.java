package com.miguelvela;

public abstract class Player {
    protected Mediator mediator;
    protected String id;
    protected int lifePoints;
    private static final int INITIAL_LIFEPOINTS = 50;

    public Player(Mediator mediator, String playerId) {
        this.mediator = mediator;
        this.id = playerId;
        this.lifePoints = INITIAL_LIFEPOINTS;
    }

    public String getId() {
        return this.id;
    }

    public int getLifePoints() {
        return this.lifePoints;
    }

    protected void reduceLifePoints(int value) {
        this.lifePoints = Math.max(this.lifePoints - value, 0);
    }

    protected void addLifePoints(int value) {
        this.lifePoints = this.lifePoints + value;
    }

    public boolean isDead() {
        return this.lifePoints <= 0;
    }

    protected void sendMessage(String playerId, String message) {
        this.mediator.sendMessage(playerId, message);
    }

    protected abstract void executeAction(String playerId);
}

