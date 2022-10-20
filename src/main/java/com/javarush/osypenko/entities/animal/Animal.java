package com.javarush.osypenko.entities.animal;

import com.javarush.osypenko.constants.Constants;
import com.javarush.osypenko.entities.Organism;
import com.javarush.osypenko.field.Cell;

import java.util.concurrent.ThreadLocalRandom;

public abstract class Animal implements Organism{
    private final String name; // Имя животного
    private final String icon; // Иконка животного
    private final double weight; // Вес
    private final int maxNumberOfAnimalsOfThisSpeciesPerCage; // Максимпльное количество животных данного вида в одной клетке
    private final int speedOfMovingCellsMove; // Скорость перемещения по клеткам
    private final double kilogramsOfFoodAnAnimalNeedsForSatiety; // Килограммы пищи необходимые для насыщения

    public Animal(String name, String icon, double weight, int maxNumberOfAnimalsOfThisSpeciesPerCage, int speedOfMovingCellsMove, double kilogramsOfFoodAnAnimalNeedsForSatiety) {
        this.name = name;
        this.icon = icon;
        this.weight = weight;
        this.maxNumberOfAnimalsOfThisSpeciesPerCage = maxNumberOfAnimalsOfThisSpeciesPerCage;
        this.speedOfMovingCellsMove = speedOfMovingCellsMove;
        this.kilogramsOfFoodAnAnimalNeedsForSatiety = kilogramsOfFoodAnAnimalNeedsForSatiety;
    }

    public abstract void eat();

    public void move(Cell cell) {
        int newRow = cell.getRow() + ThreadLocalRandom.current().nextInt(0, speedOfMovingCellsMove);
        int newCol = cell.getCol() + ThreadLocalRandom.current().nextInt(0, speedOfMovingCellsMove);

        if (newRow >= Constants.CELL_X || newCol >= Constants.CELL_Y || newRow < 0 || newCol < 0) {
            move(cell);
        }

        if (newRow == cell.getRow() && newCol == cell.getCol()) {
            move(cell);
        }

        // из старой ячейки удаляем в новую записываем
    }

    public void multiply() {

    }

    public String getName() {
        return name;
    }

    public String getIcon() {
        return icon;
    }

    public double getWeight() {
        return weight;
    }

    public int getMaxNumberOfAnimalsOfThisSpeciesPerCage() {
        return maxNumberOfAnimalsOfThisSpeciesPerCage;
    }

    public int getSpeedOfMovingCellsMove() {
        return speedOfMovingCellsMove;
    }

    public double getKilogramsOfFoodAnAnimalNeedsForSatiety() {
        return kilogramsOfFoodAnAnimalNeedsForSatiety;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", icon='" + icon + '\'' +
                ", weight=" + weight +
                ", maxNumberOfAnimalsOfThisSpeciesPerCage=" + maxNumberOfAnimalsOfThisSpeciesPerCage +
                ", speedOfMovingCellsMove=" + speedOfMovingCellsMove +
                ", kilogramsOfFoodAnAnimalNeedsForSatiety=" + kilogramsOfFoodAnAnimalNeedsForSatiety +
                '}';
    }
}
