package com.javarush.osypenko.entities.animal.herbivores;

public class Caterpillar extends Herbivore { // Гусеница 🐛

    public Caterpillar(String name, String icon, double weight, int maxNumberOfAnimalsOfThisSpeciesPerCage, int speedOfMovingCellsMove, double kilogramsOfFoodAnAnimalNeedsForSatiety) {
        super(name, icon, weight, maxNumberOfAnimalsOfThisSpeciesPerCage, speedOfMovingCellsMove, kilogramsOfFoodAnAnimalNeedsForSatiety);
    }
}
