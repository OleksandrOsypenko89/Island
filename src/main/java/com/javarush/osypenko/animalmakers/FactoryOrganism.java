package com.javarush.osypenko.animalmakers;

import com.javarush.osypenko.constants.CharacteristicsEntities;
import com.javarush.osypenko.entities.Organism;
import com.javarush.osypenko.entities.animal.carnivores.*;
import com.javarush.osypenko.entities.animal.herbivores.*;
import com.javarush.osypenko.entities.plant.grass.Grass;
import com.javarush.osypenko.pref.ObjectPrefs;

public class FactoryOrganism {
    public static Organism getOrganism(EntitiesType entitiesType) {

        ObjectPrefs objectPrefs = CharacteristicsEntities.getCharacteristicsEntities().get(entitiesType);

        return switch (entitiesType) {
            case BEAR -> new Bear(objectPrefs);
            case EAGLE -> new Eagle(objectPrefs);
            case FOX -> new Fox(objectPrefs);
            case SNAKE -> new Snake(objectPrefs);
            case WOLF -> new Wolf(objectPrefs);
            case BOAR -> new Boar(objectPrefs);
            case BUFFALO -> new Buffalo(objectPrefs);
            case CATERPILLAR -> new Caterpillar(objectPrefs);
            case DEER -> new Deer(objectPrefs);
            case DUCK -> new Duck(objectPrefs);
            case GOAT -> new Goat(objectPrefs);
            case HORSE -> new Horse(objectPrefs);
            case MOUSE -> new Mouse(objectPrefs);
            case RABBIT -> new Rabbit(objectPrefs);
            case SHEEP -> new Sheep(objectPrefs);
            case GRASS -> new Grass(objectPrefs);
        };
    }
}
