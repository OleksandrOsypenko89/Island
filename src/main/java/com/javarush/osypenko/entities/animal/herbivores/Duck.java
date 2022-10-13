package com.javarush.osypenko.entities.animal.herbivores;

import com.javarush.osypenko.constants.CharacteristicsEntities;

public class Duck extends Herbivore { // Утка 🦆
    private final double WEIGHT = CharacteristicsEntities.duckWeight;
    private final int MAXIMUM_NUMBER_OF_ANIMALS_OF_THIS_SPECIES_PER_CAGE = CharacteristicsEntities.duckMaximumNumberOfAnimalsOfThisSpeciesPerCage;
    private final int SPEED_OF_MOVING_CELLS_MOVE = CharacteristicsEntities.duckSpeedOfMovingCellsMove;
    private final double KILOGRAMS_OF_FOOD_AN_ANIMAL_NEEDS_FOR_SATIETY = CharacteristicsEntities.duckKilogramsOfFoodAnAnimalNeedForSatiety;
}
