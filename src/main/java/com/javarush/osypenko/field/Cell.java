package com.javarush.osypenko.field;

import com.javarush.osypenko.animalmakers.EntitiesType;
import com.javarush.osypenko.constants.CharacteristicsEntities;
import com.javarush.osypenko.entities.Organism;
import com.javarush.osypenko.entities.animal.herbivores.Caterpillar;
import com.javarush.osypenko.entities.plant.grass.Grass;
import com.javarush.osypenko.animalmakers.FactoryOrganism;
import lombok.Getter;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Cell {
    @Getter
    private final int row;
    @Getter
    private final int col;

    public Cell(int row, int col) {
        this.row = row;
        this.col = col;
    }

    public volatile Map<EntitiesType, Set<Organism>> sets = new HashMap<>();

    public synchronized void makeStep() {
        multiply();
        move();
        eat();
    }

    private synchronized void move() {
        for (Map.Entry<EntitiesType, Set<Organism>> pair : sets.entrySet()) {
            Set<Organism> organismSet = pair.getValue();
            for (Organism organism : organismSet) {
                if (organism instanceof Grass || organism instanceof Caterpillar) {
                    break;
                }
                organism.move(this);
            }
        }
    }

    private synchronized void multiply() {
        Iterator<Map.Entry<EntitiesType, Set<Organism>>> iterator = sets.entrySet().iterator();
        //noinspection WhileLoopReplaceableByForEach
        while (iterator.hasNext()) {
            Map.Entry<EntitiesType, Set<Organism>> pair = iterator.next();
            EntitiesType name = pair.getKey();
            Set<Organism> organisms = pair.getValue();
            if (organisms != null) {
                int numberOfChildren = organisms.size() / 2;
                for (int i = 0; i < numberOfChildren; i++) {
                    Organism organism = FactoryOrganism.getOrganism(name);
                    organisms.add(organism);
                }
            }
        }
    }

    private synchronized void eat() {
        for (Map.Entry<EntitiesType, Set<Organism>> pair : sets.entrySet()) {
            Set<Organism> organismSet = pair.getValue();

            EntitiesType[] food = switch (pair.getKey()) {
                case BEAR -> CharacteristicsEntities.getBearEat();
                case EAGLE -> CharacteristicsEntities.getEagleEat();
                case FOX -> CharacteristicsEntities.getFoxEat();
                case SNAKE -> CharacteristicsEntities.getSnakeEat();
                case WOLF -> CharacteristicsEntities.getWolfEat();
                case BOAR -> CharacteristicsEntities.getBoarEat();
                case BUFFALO -> CharacteristicsEntities.getBuffaloEat();
                case CATERPILLAR -> CharacteristicsEntities.getCaterpillarEat();
                case DEER -> CharacteristicsEntities.getDeerEat();
                case DUCK -> CharacteristicsEntities.getDuckEat();
                case GOAT -> CharacteristicsEntities.getGoatEat();
                case HORSE -> CharacteristicsEntities.getHorseEat();
                case MOUSE -> CharacteristicsEntities.getMouseEat();
                case RABBIT -> CharacteristicsEntities.getRabbitEat();
                case SHEEP -> CharacteristicsEntities.getSheepEat();
                case GRASS -> null;
            };

            if (food != null) {
                boolean isLife = true;
                Iterator<Organism> iterator = organismSet.iterator();
                while (iterator.hasNext()) {
                    Organism organism = iterator.next();
                    for (EntitiesType entitiesType : food) {
                        isLife = organism.eat(sets.get(entitiesType));
                    }
                    if (isLife) {
                        iterator.remove();
                    }
                }
            }
        }
    }
}
