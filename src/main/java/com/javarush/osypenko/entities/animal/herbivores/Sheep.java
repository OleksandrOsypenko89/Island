package com.javarush.osypenko.entities.animal.herbivores;

import com.javarush.osypenko.constants.CharacteristicsEntities;

public class Sheep extends Herbivore { // Овца 🐑
    private final double WEIGHT = CharacteristicsEntities.sheepWeight;
    private final int MAXIMUM_NUMBER_OF_ANIMALS_OF_THIS_SPECIES_PER_CAGE = CharacteristicsEntities.sheepMaximumNumberOfAnimalsOfThisSpeciesPerCage;
    private final int SPEED_OF_MOVING_CELLS_MOVE = CharacteristicsEntities.sheepSpeedOfMovingCellsMove;
    private final int KILOGRAMS_OF_FOOD_AN_ANIMAL_NEEDS_FOR_SATIETY = CharacteristicsEntities.sheepKilogramsOfFoodAnAnimalNeedForSatiety;

}
