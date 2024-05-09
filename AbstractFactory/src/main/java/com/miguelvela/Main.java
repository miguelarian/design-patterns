package com.miguelvela;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        CharactersFactory humansFactory = new HumansCharacterFactory();
        Mage humanMage = humansFactory.createMage();
        Soldier humanSoldier = humansFactory.createSoldier();

        CharactersFactory elvesFactory = new ElfCharactersFactory();
        Mage elfMage = elvesFactory.createMage();
        Soldier elfSoldier = elvesFactory.createSoldier();

        CharactersFactory dwarvesFactory = new DwarfCharactersFactory();
        Mage dwarfMage = dwarvesFactory.createMage();
        Soldier dwarfSoldier = dwarvesFactory.createSoldier();

        List<Soldier> soldiers = List.of(humanSoldier, elfSoldier, dwarfSoldier);
        soldiers.forEach(Soldier::attack);

        List<Mage> mages = List.of(humanMage, elfMage, dwarfMage);
        mages.forEach(Mage::enchant);
    }
}