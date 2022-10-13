package com.javarush.osypenko.entities.animal.herbivores;

import com.javarush.osypenko.constants.CharacteristicsEntities;

public class Buffalo extends Herbivore { // Буйвол 🐃
    private final double WEIGHT = CharacteristicsEntities.buffaloWeight;
    private final int MAXIMUM_NUMBER_OF_ANIMALS_OF_THIS_SPECIES_PER_CAGE = CharacteristicsEntities.buffaloMaximumNumberOfAnimalsOfThisSpeciesPerCage;
    private final int SPEED_OF_MOVING_CELLS_MOVE = CharacteristicsEntities.buffaloSpeedOfMovingCellsMove;
    private final int KILOGRAMS_OF_FOOD_AN_ANIMAL_NEEDS_FOR_SATIETY = CharacteristicsEntities.buffaloKilogramsOfFoodAnAnimalNeedForSatiety;
}
