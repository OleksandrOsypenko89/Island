package com.javarush.osypenko.entities.animal.herbivores;

import com.javarush.osypenko.constants.CharacteristicsEntities;

public class Caterpillar extends Herbivore { // Гусеница 🐛.
    private final double WEIGHT = CharacteristicsEntities.caterpillarWeight;
    private final int MAXIMUM_NUMBER_OF_ANIMALS_OF_THIS_SPECIES_PER_CAGE = CharacteristicsEntities.caterpillarMaximumNumberOfAnimalsOfThisSpeciesPerCage;
    private final int SPEED_OF_MOVING_CELLS_MOVE = CharacteristicsEntities.caterpillarSpeedOfMovingCellsMove;
    private final int KILOGRAMS_OF_FOOD_AN_ANIMAL_NEEDS_FOR_SATIETY = CharacteristicsEntities.caterpillarKilogramsOfFoodAnAnimalNeedForSatiety;
}
