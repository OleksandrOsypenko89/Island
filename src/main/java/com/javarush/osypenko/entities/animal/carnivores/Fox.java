package com.javarush.osypenko.entities.animal.carnivores;

import com.javarush.osypenko.constants.CharacteristicsEntities;

public class Fox extends Carnivore { // Лиса 🦊
    private final double WEIGHT = CharacteristicsEntities.foxWeight;
    private final int MAXIMUM_NUMBER_OF_ANIMALS_OF_THIS_SPECIES_PER_CAGE = CharacteristicsEntities.foxMaximumNumberOfAnimalsOfThisSpeciesPerCage;
    private final int SPEED_OF_MOVING_CELLS_MOVE = CharacteristicsEntities.foxSpeedOfMovingCellsMove;
    private final int KILOGRAMS_OF_FOOD_AN_ANIMAL_NEEDS_FOR_SATIETY = CharacteristicsEntities.foxKilogramsOfFoodAnAnimalNeedForSatiety;
}
