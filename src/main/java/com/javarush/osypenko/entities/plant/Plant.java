package com.javarush.osypenko.entities.plant;

import com.javarush.osypenko.entities.Organism;
import com.javarush.osypenko.pref.ObjectPrefs;

public abstract class Plant extends Organism {
    public Plant(ObjectPrefs objectPrefs) {
        super(objectPrefs);
    }
}
