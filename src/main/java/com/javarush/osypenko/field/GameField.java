package com.javarush.osypenko.field;

import com.javarush.osypenko.constants.CharacteristicsEntities;
import com.javarush.osypenko.constants.Constants;
import com.javarush.osypenko.entities.Organism;
import com.javarush.osypenko.pref.EntitiesType;
import com.javarush.osypenko.pref.FactoryOrganism;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class GameField {
    public static Cell[][] field = new Cell[Constants.CELL_X][Constants.CELL_Y];

    public void initialize() {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {

                EntitiesType[] entitiesTypes = EntitiesType.values();
                Cell cell = new Cell(i, j);
                for (EntitiesType entitiesType : entitiesTypes) {
                    int num = ThreadLocalRandom.current().nextInt(0, CharacteristicsEntities.getCharacteristicsEntities().get(entitiesType).getMaxNumberOfAnimalsOfThisSpeciesPerCage());
                    Set<Organism> typeSet = new HashSet<>();

                    for (int k = 0; k < num; k++) {
                        Organism organism = FactoryOrganism.getOrganism(entitiesType);
                        typeSet.add(organism);
                        cell.sets.put(entitiesType, typeSet);
                        field[i][j] = cell;
                    }
                }
            }
        }
    }

    public void makeStep() {
        for (Cell[] cells : field) {
            for (Cell cell : cells) {
                cell.makeStep();
            }
        }
    }
}
