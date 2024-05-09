package com.miguelvela;

public class ElfCharactersFactory implements CharactersFactory {
    @Override
    public Soldier createSoldier() {
        return new SoldierElf();
    }

    @Override
    public Mage createMage() {
        return new MageElf();
    }
}
