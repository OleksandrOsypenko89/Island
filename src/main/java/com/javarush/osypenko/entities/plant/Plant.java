package com.javarush.osypenko.entities.plant;

import com.javarush.osypenko.entities.Organism;

public class Plant implements Organism { // Растения 🌿
    private final String name; // Имя животного
    private final String icon; // Иконка животного
    private final double weight; // Вес
    private final int maxNumberOfAnimalsOfThisSpeciesPerCage; // Максимпльное количество животных данного вида в одной клетке

    public Plant(String name, String icon, double weight, int maxNumberOfAnimalsOfThisSpeciesPerCage) {
        this.name = name;
        this.icon = icon;
        this.weight = weight;
        this.maxNumberOfAnimalsOfThisSpeciesPerCage = maxNumberOfAnimalsOfThisSpeciesPerCage;
    }
}
