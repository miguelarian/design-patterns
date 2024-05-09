package com.miguelvela;

public class HumansCharacterFactory implements CharactersFactory {
    @Override
    public Soldier createSoldier() {
        return new SoldierHuman();
    }

    @Override
    public Mage createMage() {
        return new MageHuman();
    }
}
