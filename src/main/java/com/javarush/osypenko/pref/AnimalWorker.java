package com.javarush.osypenko.pref;

import com.javarush.osypenko.animalmakers.EntitiesType;
import com.javarush.osypenko.field.GameField;

import java.util.concurrent.Callable;

public class AnimalWorker implements Callable<Integer> {

    GameField gameField = new GameField();
    EntitiesType entitiesType;

    public AnimalWorker(EntitiesType entitiesType) {
        this.entitiesType = entitiesType;
    }

    @Override
    public Integer call() {
        return gameField.initialize(entitiesType);
    }
}
