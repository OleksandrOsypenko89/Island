package com.javarush.osypenko.entities.animal.herbivores;

public class Sheep extends Herbivore { // Овца 🐑

    public Sheep(String name, String icon, double weight, int maxNumberOfAnimalsOfThisSpeciesPerCage, int speedOfMovingCellsMove, double kilogramsOfFoodAnAnimalNeedsForSatiety) {
        super(name, icon, weight, maxNumberOfAnimalsOfThisSpeciesPerCage, speedOfMovingCellsMove, kilogramsOfFoodAnAnimalNeedsForSatiety);
    }
}
