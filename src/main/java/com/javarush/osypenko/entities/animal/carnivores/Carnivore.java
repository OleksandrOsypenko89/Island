package com.javarush.osypenko.entities.animal.carnivores;

import com.javarush.osypenko.entities.animal.Animal;

public abstract class Carnivore extends Animal {

    public Carnivore(String name, String icon, double weight, int maxNumberOfAnimalsOfThisSpeciesPerCage, int speedOfMovingCellsMove, double kilogramsOfFoodAnAnimalNeedsForSatiety) {
        super(name, icon, weight, maxNumberOfAnimalsOfThisSpeciesPerCage, speedOfMovingCellsMove, kilogramsOfFoodAnAnimalNeedsForSatiety);
    }

    @Override
    public void eat() {

    }
}
