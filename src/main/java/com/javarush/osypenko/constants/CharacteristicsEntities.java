package com.javarush.osypenko.constants;

import com.javarush.osypenko.entities.AnimalsEnum;
import com.javarush.osypenko.entities.animal.Animal;
import com.javarush.osypenko.entities.animal.carnivores.*;
import com.javarush.osypenko.entities.animal.herbivores.*;
import com.javarush.osypenko.entities.plant.Plant;

import java.util.HashMap;
import java.util.Map;

public class CharacteristicsEntities {
    private static Map<AnimalsEnum, ? super Animal> preferences = new HashMap<>();
    private static int[][] probabilities = new int[AnimalsEnum.values().length][AnimalsEnum.values().length];

    static  {
        preferences.put(AnimalsEnum.WOLF, new Wolf("Волк", "\uD83D\uDC3A", 50, 30, 3, 8));
        preferences.put(AnimalsEnum.SNAKE, new Snake("Удав", "\uD83D\uDC0D", 15, 30, 1, 3));
        preferences.put(AnimalsEnum.FOX, new Fox("Лиса", "\uD83E\uDD8A", 8, 30, 2, 2));
        preferences.put(AnimalsEnum.BEAR, new Bear("Медведь", "\uD83D\uDC3B", 500, 5, 2, 80));
        preferences.put(AnimalsEnum.EAGLE, new Eagle("Орел", "\uD83E\uDD85", 6, 20, 3, 1));
        preferences.put(AnimalsEnum.HORSE, new Horse("Лошадь", "\uD83D\uDC0E", 400, 20, 4, 60));
        preferences.put(AnimalsEnum.DEER, new Deer("Олень", "\uD83E\uDD8C", 300, 20, 4, 50));
        preferences.put(AnimalsEnum.RABBIT, new Rabbit("Кролик", "\uD83D\uDC07", 2, 150, 2, 0.45));
        preferences.put(AnimalsEnum.MOUSE, new Mouse("Мышь", "\uD83D\uDC01", 0.05, 500, 1, 0.01));
        preferences.put(AnimalsEnum.GOAT, new Goat("Коза", "\uD83D\uDC10", 60, 140, 3, 10));
        preferences.put(AnimalsEnum.SHEEP, new Sheep("Овца", "\uD83D\uDC11", 70, 140, 3, 15));
        preferences.put(AnimalsEnum.BOAR, new Boar("Кабан", "\uD83D\uDC17", 400, 50,2,50));
        preferences.put(AnimalsEnum.BUFFALO, new Buffalo("Буйвол", "\uD83D\uDC03", 700, 10, 3, 100));
        preferences.put(AnimalsEnum.DUCK, new Duck("Утка", "\uD83E\uDD86", 1, 200, 4, 0.15));
        preferences.put(AnimalsEnum.CATERPILLAR, new Caterpillar("Гусеница", "\uD83D\uDC1B", 0.01, 1000, 0,0));
//        preferences.put(AnimalsEnum.PLANT, new Plant()); // растения не являются насследником Animal

        probabilities[AnimalsEnum.WOLF.ordinal()][AnimalsEnum.HORSE.ordinal()] = 10;
        probabilities[AnimalsEnum.WOLF.ordinal()][AnimalsEnum.DEER.ordinal()] = 15;
        probabilities[AnimalsEnum.WOLF.ordinal()][AnimalsEnum.RABBIT.ordinal()] = 60;
        probabilities[AnimalsEnum.WOLF.ordinal()][AnimalsEnum.MOUSE.ordinal()] = 80;
        probabilities[AnimalsEnum.WOLF.ordinal()][AnimalsEnum.GOAT.ordinal()] = 60;
        probabilities[AnimalsEnum.WOLF.ordinal()][AnimalsEnum.SHEEP.ordinal()] = 70;
        probabilities[AnimalsEnum.WOLF.ordinal()][AnimalsEnum.BOAR.ordinal()] = 15;
        probabilities[AnimalsEnum.WOLF.ordinal()][AnimalsEnum.BUFFALO.ordinal()] = 10;
        probabilities[AnimalsEnum.WOLF.ordinal()][AnimalsEnum.DUCK.ordinal()] = 40;

        probabilities[AnimalsEnum.SNAKE.ordinal()][AnimalsEnum.FOX.ordinal()] = 15;
        probabilities[AnimalsEnum.SNAKE.ordinal()][AnimalsEnum.RABBIT.ordinal()] = 20;
        probabilities[AnimalsEnum.SNAKE.ordinal()][AnimalsEnum.MOUSE.ordinal()] = 40;
        probabilities[AnimalsEnum.SNAKE.ordinal()][AnimalsEnum.DUCK.ordinal()] = 10;

        probabilities[AnimalsEnum.FOX.ordinal()][AnimalsEnum.RABBIT.ordinal()] = 70;
        probabilities[AnimalsEnum.FOX.ordinal()][AnimalsEnum.MOUSE.ordinal()] = 90;
        probabilities[AnimalsEnum.FOX.ordinal()][AnimalsEnum.DUCK.ordinal()] = 60;
        probabilities[AnimalsEnum.FOX.ordinal()][AnimalsEnum.CATERPILLAR.ordinal()] = 40;

        probabilities[AnimalsEnum.BEAR.ordinal()][AnimalsEnum.SNAKE.ordinal()] = 80;
        probabilities[AnimalsEnum.BEAR.ordinal()][AnimalsEnum.HORSE.ordinal()] = 40;
        probabilities[AnimalsEnum.BEAR.ordinal()][AnimalsEnum.DEER.ordinal()] = 80;
        probabilities[AnimalsEnum.BEAR.ordinal()][AnimalsEnum.RABBIT.ordinal()] = 80;
        probabilities[AnimalsEnum.BEAR.ordinal()][AnimalsEnum.MOUSE.ordinal()] = 90;
        probabilities[AnimalsEnum.BEAR.ordinal()][AnimalsEnum.GOAT.ordinal()] = 70;
        probabilities[AnimalsEnum.BEAR.ordinal()][AnimalsEnum.SHEEP.ordinal()] = 70;
        probabilities[AnimalsEnum.BEAR.ordinal()][AnimalsEnum.BOAR.ordinal()] = 50;
        probabilities[AnimalsEnum.BEAR.ordinal()][AnimalsEnum.BUFFALO.ordinal()] = 20;
        probabilities[AnimalsEnum.BEAR.ordinal()][AnimalsEnum.DUCK.ordinal()] = 10;

        probabilities[AnimalsEnum.EAGLE.ordinal()][AnimalsEnum.FOX.ordinal()] = 10;
        probabilities[AnimalsEnum.EAGLE.ordinal()][AnimalsEnum.RABBIT.ordinal()] = 90;
        probabilities[AnimalsEnum.EAGLE.ordinal()][AnimalsEnum.MOUSE.ordinal()] = 90;
        probabilities[AnimalsEnum.EAGLE.ordinal()][AnimalsEnum.DUCK.ordinal()] = 80;

        probabilities[AnimalsEnum.HORSE.ordinal()][AnimalsEnum.PLANT.ordinal()] = 100;

        probabilities[AnimalsEnum.DEER.ordinal()][AnimalsEnum.PLANT.ordinal()] = 100;

        probabilities[AnimalsEnum.RABBIT.ordinal()][AnimalsEnum.PLANT.ordinal()] = 100;

        probabilities[AnimalsEnum.MOUSE.ordinal()][AnimalsEnum.CATERPILLAR.ordinal()] = 90;
        probabilities[AnimalsEnum.MOUSE.ordinal()][AnimalsEnum.PLANT.ordinal()] = 100;

        probabilities[AnimalsEnum.GOAT.ordinal()][AnimalsEnum.PLANT.ordinal()] = 100;

        probabilities[AnimalsEnum.SHEEP.ordinal()][AnimalsEnum.PLANT.ordinal()] = 100;

        probabilities[AnimalsEnum.BOAR.ordinal()][AnimalsEnum.MOUSE.ordinal()] = 50;
        probabilities[AnimalsEnum.BOAR.ordinal()][AnimalsEnum.CATERPILLAR.ordinal()] = 90;
        probabilities[AnimalsEnum.BOAR.ordinal()][AnimalsEnum.PLANT.ordinal()] = 100;

        probabilities[AnimalsEnum.BUFFALO.ordinal()][AnimalsEnum.PLANT.ordinal()] = 100;

        probabilities[AnimalsEnum.DUCK.ordinal()][AnimalsEnum.CATERPILLAR.ordinal()] = 90;
        probabilities[AnimalsEnum.DUCK.ordinal()][AnimalsEnum.PLANT.ordinal()] = 100;

        probabilities[AnimalsEnum.CATERPILLAR.ordinal()][AnimalsEnum.PLANT.ordinal()] = 100;
    }

    public static Map<AnimalsEnum, ? super Animal> getPreferences() {
        return preferences;
    }

    public static int[][] getProbabilities() {
        return probabilities;
    }
}
