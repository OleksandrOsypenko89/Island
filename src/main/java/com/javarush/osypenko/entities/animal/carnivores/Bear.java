package com.javarush.osypenko.entities.animal.carnivores;

import com.javarush.osypenko.constants.CharacteristicsEntities;

public class Bear extends Carnivore { // Медведь 🐻
    private final double WEIGHT = CharacteristicsEntities.beerWeight;
    private final int MAXIMUM_NUMBER_OF_ANIMALS_OF_THIS_SPECIES_PER_CAGE = CharacteristicsEntities.beerMaximumNumberOfAnimalsOfThisSpeciesPerCage;
    private final int SPEED_OF_MOVING_CELLS_MOVE = CharacteristicsEntities.beerSpeedOfMovingCellsMove;
    private final int KILOGRAMS_OF_FOOD_AN_ANIMAL_NEEDS_FOR_SATIETY = CharacteristicsEntities.beerKilogramsOfFoodAnAnimalNeedForSatiety;
}
