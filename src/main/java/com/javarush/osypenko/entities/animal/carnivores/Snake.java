package com.javarush.osypenko.entities.animal.carnivores;

import com.javarush.osypenko.constants.CharacteristicsEntities;

public class Snake extends Carnivore { // Змея 🐍,
    private final double WEIGHT = CharacteristicsEntities.snakeWeight;
    private final int MAXIMUM_NUMBER_OF_ANIMALS_OF_THIS_SPECIES_PER_CAGE = CharacteristicsEntities.snakeMaximumNumberOfAnimalsOfThisSpeciesPerCage;
    private final int SPEED_OF_MOVING_CELLS_MOVE = CharacteristicsEntities.snakeSpeedOfMovingCellsMove;
    private final int KILOGRAMS_OF_FOOD_AN_ANIMAL_NEEDS_FOR_SATIETY = CharacteristicsEntities.snakeKilogramsOfFoodAnAnimalNeedForSatiety;
}
