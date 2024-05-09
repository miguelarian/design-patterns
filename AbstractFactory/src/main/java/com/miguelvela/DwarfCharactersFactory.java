package com.miguelvela;

public class DwarfCharactersFactory implements CharactersFactory {
    @Override
    public Soldier createSoldier() {
        return new SoldierDwarf();
    }

    @Override
    public Mage createMage() {
        return new MageDwarf();
    }
}
