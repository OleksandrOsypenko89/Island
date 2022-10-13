package com.javarush.osypenko.entities.animal.carnivores;

import com.javarush.osypenko.constants.CharacteristicsEntities;

public class Eagle extends Carnivore { // Орел 🦅
    private final double WEIGHT = CharacteristicsEntities.eagleWeight;
    private final int MAXIMUM_NUMBER_OF_ANIMALS_OF_THIS_SPECIES_PER_CAGE = CharacteristicsEntities.eagleMaximumNumberOfAnimalsOfThisSpeciesPerCage;
    private final int SPEED_OF_MOVING_CELLS_MOVE = CharacteristicsEntities.eagleSpeedOfMovingCellsMove;
    private final int KILOGRAMS_OF_FOOD_AN_ANIMAL_NEEDS_FOR_SATIETY = CharacteristicsEntities.eagleKilogramsOfFoodAnAnimalNeedForSatiety;
}
