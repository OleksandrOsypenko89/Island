package com.javarush.osypenko.entities.animal.herbivores;

import com.javarush.osypenko.entities.animal.Animal;

public abstract class Herbivore extends Animal {

    public Herbivore(String name, String icon, double weight, int maxNumberOfAnimalsOfThisSpeciesPerCage, int speedOfMovingCellsMove, double kilogramsOfFoodAnAnimalNeedsForSatiety) {
        super(name, icon, weight, maxNumberOfAnimalsOfThisSpeciesPerCage, speedOfMovingCellsMove, kilogramsOfFoodAnAnimalNeedsForSatiety);
    }

    @Override
    public void eat() {

    }
}
