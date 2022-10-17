package com.javarush.osypenko.entities.animal.carnivores;

public class Eagle extends Carnivore { // Орел 🦅

    public Eagle(String name, String icon, double weight, int maxNumberOfAnimalsOfThisSpeciesPerCage, int speedOfMovingCellsMove, double kilogramsOfFoodAnAnimalNeedsForSatiety) {
        super(name, icon, weight, maxNumberOfAnimalsOfThisSpeciesPerCage, speedOfMovingCellsMove, kilogramsOfFoodAnAnimalNeedsForSatiety);
    }
}
