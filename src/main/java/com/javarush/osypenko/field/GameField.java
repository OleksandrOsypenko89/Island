package com.javarush.osypenko.field;

import com.javarush.osypenko.animalmakers.EntitiesType;
import com.javarush.osypenko.constants.CharacteristicsEntities;
import com.javarush.osypenko.constants.Constants;
import com.javarush.osypenko.entities.Organism;
import com.javarush.osypenko.animalmakers.FactoryOrganism;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class GameField {
    public static Cell[][] field = new Cell[Constants.CELL_X][Constants.CELL_Y];

    public synchronized Integer initialize(EntitiesType entitiesType) {
        int id = 0;
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {

                Cell cell = new Cell(i, j);
                int maxNumber = CharacteristicsEntities.getCharacteristicsEntities().get(entitiesType).getMaxNumberOfAnimalsOfThisSpeciesPerCage();
                int num = ThreadLocalRandom.current().nextInt(0, maxNumber);
                id += num;
                Set<Organism> typeSet = new HashSet<>();

                for (int k = 0; k < num; k++) {
                    Organism organism = FactoryOrganism.getOrganism(entitiesType);
                    typeSet.add(organism);
                    cell.sets.put(entitiesType, typeSet);
                    field[i][j] = cell;
                }
            }
        }
        return id;
    }

    public void makeStep() {
        for (Cell[] cells : field) {
            for (Cell cell : cells) {
                cell.makeStep();
            }
        }
    }
}
