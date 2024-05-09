package com.miguelvela;

public abstract class CharacterBuilderFactory {
    public abstract Soldier createSoldier();
    public abstract Mage createMage();
    public abstract Builder createBuilder();
}
