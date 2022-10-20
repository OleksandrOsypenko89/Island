package com.javarush.osypenko.constants;

import com.javarush.osypenko.entities.AnimalsEnum;
import com.javarush.osypenko.entities.Organism;
import com.javarush.osypenko.entities.animal.carnivores.*;
import com.javarush.osypenko.entities.animal.herbivores.*;
import com.javarush.osypenko.entities.plant.Plant;

import java.util.HashMap;
import java.util.Map;

public class CharacteristicsEntities {
    private static Map<AnimalsEnum, ? super Organism> characteristicsEntities = new HashMap<>();
    private static int[][] howLikelyTheAnimalIsToEatTheFood = new int[AnimalsEnum.values().length][AnimalsEnum.values().length];

    static  {
        characteristicsEntities.put(AnimalsEnum.WOLF, new Wolf("Волк", "\uD83D\uDC3A", 50, 30, 3, 8));
        characteristicsEntities.put(AnimalsEnum.SNAKE, new Snake("Удав", "\uD83D\uDC0D", 15, 30, 1, 3));
        characteristicsEntities.put(AnimalsEnum.FOX, new Fox("Лиса", "\uD83E\uDD8A", 8, 30, 2, 2));
        characteristicsEntities.put(AnimalsEnum.BEAR, new Bear("Медведь", "\uD83D\uDC3B", 500, 5, 2, 80));
        characteristicsEntities.put(AnimalsEnum.EAGLE, new Eagle("Орел", "\uD83E\uDD85", 6, 20, 3, 1));
        characteristicsEntities.put(AnimalsEnum.HORSE, new Horse("Лошадь", "\uD83D\uDC0E", 400, 20, 4, 60));
        characteristicsEntities.put(AnimalsEnum.DEER, new Deer("Олень", "\uD83E\uDD8C", 300, 20, 4, 50));
        characteristicsEntities.put(AnimalsEnum.RABBIT, new Rabbit("Кролик", "\uD83D\uDC07", 2, 150, 2, 0.45));
        characteristicsEntities.put(AnimalsEnum.MOUSE, new Mouse("Мышь", "\uD83D\uDC01", 0.05, 500, 1, 0.01));
        characteristicsEntities.put(AnimalsEnum.GOAT, new Goat("Коза", "\uD83D\uDC10", 60, 140, 3, 10));
        characteristicsEntities.put(AnimalsEnum.SHEEP, new Sheep("Овца", "\uD83D\uDC11", 70, 140, 3, 15));
        characteristicsEntities.put(AnimalsEnum.BOAR, new Bear("Кабан", "\uD83D\uDC17", 400, 50,2,50));
        characteristicsEntities.put(AnimalsEnum.BUFFALO, new Buffalo("Буйвол", "\uD83D\uDC03", 700, 10, 3, 100));
        characteristicsEntities.put(AnimalsEnum.DUCK, new Duck("Утка", "\uD83E\uDD86", 1, 200, 4, 0.15));
        characteristicsEntities.put(AnimalsEnum.CATERPILLAR, new Caterpillar("Гусеница", "\uD83D\uDC1B", 0.01, 1000, 0,0));
        characteristicsEntities.put(AnimalsEnum.PLANT, new Plant("Растения", "\uD83C\uDF3F", 1, 200));

        howLikelyTheAnimalIsToEatTheFood[AnimalsEnum.WOLF.ordinal()][AnimalsEnum.HORSE.ordinal()] = 10;
        howLikelyTheAnimalIsToEatTheFood[AnimalsEnum.WOLF.ordinal()][AnimalsEnum.DEER.ordinal()] = 15;
        howLikelyTheAnimalIsToEatTheFood[AnimalsEnum.WOLF.ordinal()][AnimalsEnum.RABBIT.ordinal()] = 60;
        howLikelyTheAnimalIsToEatTheFood[AnimalsEnum.WOLF.ordinal()][AnimalsEnum.MOUSE.ordinal()] = 80;
        howLikelyTheAnimalIsToEatTheFood[AnimalsEnum.WOLF.ordinal()][AnimalsEnum.GOAT.ordinal()] = 60;
        howLikelyTheAnimalIsToEatTheFood[AnimalsEnum.WOLF.ordinal()][AnimalsEnum.SHEEP.ordinal()] = 70;
        howLikelyTheAnimalIsToEatTheFood[AnimalsEnum.WOLF.ordinal()][AnimalsEnum.BOAR.ordinal()] = 15;
        howLikelyTheAnimalIsToEatTheFood[AnimalsEnum.WOLF.ordinal()][AnimalsEnum.BUFFALO.ordinal()] = 10;
        howLikelyTheAnimalIsToEatTheFood[AnimalsEnum.WOLF.ordinal()][AnimalsEnum.DUCK.ordinal()] = 40;

        howLikelyTheAnimalIsToEatTheFood[AnimalsEnum.SNAKE.ordinal()][AnimalsEnum.FOX.ordinal()] = 15;
        howLikelyTheAnimalIsToEatTheFood[AnimalsEnum.SNAKE.ordinal()][AnimalsEnum.RABBIT.ordinal()] = 20;
        howLikelyTheAnimalIsToEatTheFood[AnimalsEnum.SNAKE.ordinal()][AnimalsEnum.MOUSE.ordinal()] = 40;
        howLikelyTheAnimalIsToEatTheFood[AnimalsEnum.SNAKE.ordinal()][AnimalsEnum.DUCK.ordinal()] = 10;

        howLikelyTheAnimalIsToEatTheFood[AnimalsEnum.FOX.ordinal()][AnimalsEnum.RABBIT.ordinal()] = 70;
        howLikelyTheAnimalIsToEatTheFood[AnimalsEnum.FOX.ordinal()][AnimalsEnum.MOUSE.ordinal()] = 90;
        howLikelyTheAnimalIsToEatTheFood[AnimalsEnum.FOX.ordinal()][AnimalsEnum.DUCK.ordinal()] = 60;
        howLikelyTheAnimalIsToEatTheFood[AnimalsEnum.FOX.ordinal()][AnimalsEnum.CATERPILLAR.ordinal()] = 40;

        howLikelyTheAnimalIsToEatTheFood[AnimalsEnum.BEAR.ordinal()][AnimalsEnum.SNAKE.ordinal()] = 80;
        howLikelyTheAnimalIsToEatTheFood[AnimalsEnum.BEAR.ordinal()][AnimalsEnum.HORSE.ordinal()] = 40;
        howLikelyTheAnimalIsToEatTheFood[AnimalsEnum.BEAR.ordinal()][AnimalsEnum.DEER.ordinal()] = 80;
        howLikelyTheAnimalIsToEatTheFood[AnimalsEnum.BEAR.ordinal()][AnimalsEnum.RABBIT.ordinal()] = 80;
        howLikelyTheAnimalIsToEatTheFood[AnimalsEnum.BEAR.ordinal()][AnimalsEnum.MOUSE.ordinal()] = 90;
        howLikelyTheAnimalIsToEatTheFood[AnimalsEnum.BEAR.ordinal()][AnimalsEnum.GOAT.ordinal()] = 70;
        howLikelyTheAnimalIsToEatTheFood[AnimalsEnum.BEAR.ordinal()][AnimalsEnum.SHEEP.ordinal()] = 70;
        howLikelyTheAnimalIsToEatTheFood[AnimalsEnum.BEAR.ordinal()][AnimalsEnum.BOAR.ordinal()] = 50;
        howLikelyTheAnimalIsToEatTheFood[AnimalsEnum.BEAR.ordinal()][AnimalsEnum.BUFFALO.ordinal()] = 20;
        howLikelyTheAnimalIsToEatTheFood[AnimalsEnum.BEAR.ordinal()][AnimalsEnum.DUCK.ordinal()] = 10;

        howLikelyTheAnimalIsToEatTheFood[AnimalsEnum.EAGLE.ordinal()][AnimalsEnum.FOX.ordinal()] = 10;
        howLikelyTheAnimalIsToEatTheFood[AnimalsEnum.EAGLE.ordinal()][AnimalsEnum.RABBIT.ordinal()] = 90;
        howLikelyTheAnimalIsToEatTheFood[AnimalsEnum.EAGLE.ordinal()][AnimalsEnum.MOUSE.ordinal()] = 90;
        howLikelyTheAnimalIsToEatTheFood[AnimalsEnum.EAGLE.ordinal()][AnimalsEnum.DUCK.ordinal()] = 80;

        howLikelyTheAnimalIsToEatTheFood[AnimalsEnum.HORSE.ordinal()][AnimalsEnum.PLANT.ordinal()] = 100;

        howLikelyTheAnimalIsToEatTheFood[AnimalsEnum.DEER.ordinal()][AnimalsEnum.PLANT.ordinal()] = 100;

        howLikelyTheAnimalIsToEatTheFood[AnimalsEnum.RABBIT.ordinal()][AnimalsEnum.PLANT.ordinal()] = 100;

        howLikelyTheAnimalIsToEatTheFood[AnimalsEnum.MOUSE.ordinal()][AnimalsEnum.CATERPILLAR.ordinal()] = 90;
        howLikelyTheAnimalIsToEatTheFood[AnimalsEnum.MOUSE.ordinal()][AnimalsEnum.PLANT.ordinal()] = 100;

        howLikelyTheAnimalIsToEatTheFood[AnimalsEnum.GOAT.ordinal()][AnimalsEnum.PLANT.ordinal()] = 100;

        howLikelyTheAnimalIsToEatTheFood[AnimalsEnum.SHEEP.ordinal()][AnimalsEnum.PLANT.ordinal()] = 100;

        howLikelyTheAnimalIsToEatTheFood[AnimalsEnum.BOAR.ordinal()][AnimalsEnum.MOUSE.ordinal()] = 50;
        howLikelyTheAnimalIsToEatTheFood[AnimalsEnum.BOAR.ordinal()][AnimalsEnum.CATERPILLAR.ordinal()] = 90;
        howLikelyTheAnimalIsToEatTheFood[AnimalsEnum.BOAR.ordinal()][AnimalsEnum.PLANT.ordinal()] = 100;

        howLikelyTheAnimalIsToEatTheFood[AnimalsEnum.BUFFALO.ordinal()][AnimalsEnum.PLANT.ordinal()] = 100;

        howLikelyTheAnimalIsToEatTheFood[AnimalsEnum.DUCK.ordinal()][AnimalsEnum.CATERPILLAR.ordinal()] = 90;
        howLikelyTheAnimalIsToEatTheFood[AnimalsEnum.DUCK.ordinal()][AnimalsEnum.PLANT.ordinal()] = 100;

        howLikelyTheAnimalIsToEatTheFood[AnimalsEnum.CATERPILLAR.ordinal()][AnimalsEnum.PLANT.ordinal()] = 100;
    }

    public static Map<AnimalsEnum, ? super Organism> getCharacteristicsEntities() {
        return characteristicsEntities;
    }

    public static int[][] getHowLikelyTheAnimalIsToEatTheFood() {
        return howLikelyTheAnimalIsToEatTheFood;
    }


}
