package com.javarush.osypenko.pref;

public class ObjectPrefs {
    private final String name;
    private final String icon;
    private final double weight;
    private final int maxNumberOfAnimalsOfThisSpeciesPerCage;
    private final int speedOfMovingCellsMove;
    private final double kilogramsOfFoodAnAnimalNeedsForSatiety;
    private final double deathByStarvationAtWeight;

    public ObjectPrefs(String name, String icon, double weight, int maxNumberOfAnimalsOfThisSpeciesPerCage, int speedOfMovingCellsMove, double kilogramsOfFoodAnAnimalNeedsForSatiety, double deathByStarvationAtWeight) {
        this.name = name;
        this.icon = icon;
        this.weight = weight;
        this.maxNumberOfAnimalsOfThisSpeciesPerCage = maxNumberOfAnimalsOfThisSpeciesPerCage;
        this.speedOfMovingCellsMove = speedOfMovingCellsMove;
        this.kilogramsOfFoodAnAnimalNeedsForSatiety = kilogramsOfFoodAnAnimalNeedsForSatiety;
        this.deathByStarvationAtWeight = deathByStarvationAtWeight;
    }

    public String getName() {
        return name;
    }

    public String getIcon() {
        return icon;
    }

    public double getWeight() {
        return weight;
    }

    public int getMaxNumberOfAnimalsOfThisSpeciesPerCage() {
        return maxNumberOfAnimalsOfThisSpeciesPerCage;
    }

    public int getSpeedOfMovingCellsMove() {
        return speedOfMovingCellsMove;
    }

    public double getKilogramsOfFoodAnAnimalNeedsForSatiety() {
        return kilogramsOfFoodAnAnimalNeedsForSatiety;
    }

    public double getDeathByStarvationAtWeight() {
        return deathByStarvationAtWeight;
    }

    @Override
    public String toString() {
        return "Fields{" +
                "name='" + name + '\'' +
                ", icon='" + icon + '\'' +
                ", weight=" + weight +
                ", maxNumberOfAnimalsOfThisSpeciesPerCage=" + maxNumberOfAnimalsOfThisSpeciesPerCage +
                ", speedOfMovingCellsMove=" + speedOfMovingCellsMove +
                ", kilogramsOfFoodAnAnimalNeedsForSatiety=" + kilogramsOfFoodAnAnimalNeedsForSatiety +
                '}';
    }
}
