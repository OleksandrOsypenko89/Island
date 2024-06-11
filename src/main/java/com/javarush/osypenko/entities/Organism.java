package com.javarush.osypenko.entities;

import com.javarush.osypenko.animalmakers.EntitiesType;
import com.javarush.osypenko.animalmakers.FactoryOrganism;
import com.javarush.osypenko.constants.CharacteristicsEntities;
import com.javarush.osypenko.constants.Constants;
import com.javarush.osypenko.field.Cell;
import com.javarush.osypenko.field.GameField;
import com.javarush.osypenko.pref.ObjectPrefs;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;

public abstract class Organism {
    private final String name;
    private final String icon;
    private double weight;
    private final int maxNumberOfAnimalsOfThisSpeciesPerCage;
    private final int speedOfMovingCellsMove;
    private final double kilogramsOfFoodAnAnimalNeedsForSatiety;
    private final double deathByStarvationAtWeight;

    public Organism(ObjectPrefs objectPrefs) {
        this.name = objectPrefs.getName();
        this.icon = objectPrefs.getIcon();
        this.weight = objectPrefs.getWeight();
        this.maxNumberOfAnimalsOfThisSpeciesPerCage = objectPrefs.getMaxNumberOfAnimalsOfThisSpeciesPerCage();
        this.speedOfMovingCellsMove = objectPrefs.getSpeedOfMovingCellsMove();
        this.kilogramsOfFoodAnAnimalNeedsForSatiety = objectPrefs.getKilogramsOfFoodAnAnimalNeedsForSatiety();
        this.deathByStarvationAtWeight = objectPrefs.getDeathByStarvationAtWeight();
    }

    public void move(Cell cell) {
        int newRow = cell.getRow() + ThreadLocalRandom.current().nextInt(0, speedOfMovingCellsMove);
        int newCol = cell.getCol() + ThreadLocalRandom.current().nextInt(0, speedOfMovingCellsMove);

        boolean isMove = newRow < Constants.CELL_X && newCol < Constants.CELL_Y && newRow >= 0 && newCol >= 0;


        if (newRow == cell.getRow() && newCol == cell.getCol()) {
            isMove = false;
        }
        if (isMove) {
            Map<EntitiesType, Set<Organism>> setsOld = GameField.field[cell.getRow()][cell.getCol()].sets;
            Map<EntitiesType, Set<Organism>> setsNew = GameField.field[newRow][newCol].sets;
            setsOld.forEach(setsNew::putIfAbsent);
        }
    }

    public boolean eat(Set<Organism> organisms) {
        int randomInt;
        boolean isLife = true;
        double kgFood = 0;
        double death;
        if (organisms != null) {
            Iterator<Organism> iterator = organisms.iterator();
            while (iterator.hasNext()) {
                Organism organism = iterator.next();
                randomInt = ThreadLocalRandom.current().nextInt(100);
                int ordinal1 = EntitiesType.valueOf(this.getClass().getSimpleName().toUpperCase()).ordinal();
                int ordinal2 = EntitiesType.valueOf(organism.getClass().getSimpleName().toUpperCase()).ordinal();
                int currentProbability = CharacteristicsEntities.getHowLikelyTheAnimalIsToEatTheFood()[ordinal1][ordinal2];
                if (randomInt < currentProbability) {
                    iterator.remove();
                    kgFood += organism.weight;
                    if (kgFood > this.kilogramsOfFoodAnAnimalNeedsForSatiety) {
                        break;
                    }
                } else {
                    death = this.weight - this.weight * 5 / 100;
                    if (death > this.deathByStarvationAtWeight) {
                        isLife = false;
                        break;
                    }
                }
            }
        }
        return isLife;
    }
    @SuppressWarnings("unused")
    public String getName() {
        return name;
    }
    @SuppressWarnings("unused")
    public String getIcon() {
        return icon;
    }
    @SuppressWarnings("unused")
    public double getWeight() {
        return weight;
    }
    @SuppressWarnings("unused")
    public void setWeight(double weight) {
        this.weight = weight;
    }
    @SuppressWarnings("unused")
    public int getMaxNumberOfAnimalsOfThisSpeciesPerCage() {
        return maxNumberOfAnimalsOfThisSpeciesPerCage;
    }
    @SuppressWarnings("unused")
    public int getSpeedOfMovingCellsMove() {
        return speedOfMovingCellsMove;
    }
    @SuppressWarnings("unused")
    public double getKilogramsOfFoodAnAnimalNeedsForSatiety() {
        return kilogramsOfFoodAnAnimalNeedsForSatiety;
    }
    @SuppressWarnings("unused")
    public double getDeathByStarvationAtWeight() {
        return deathByStarvationAtWeight;
    }
}
