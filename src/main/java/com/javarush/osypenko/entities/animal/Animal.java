package com.javarush.osypenko.entities.animal;

import com.javarush.osypenko.entities.Organism;
import com.javarush.osypenko.pref.ObjectPrefs;

public abstract class Animal extends Organism {

    public Animal(ObjectPrefs objectPrefs) {
        super(objectPrefs);
    }

}

