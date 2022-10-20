package com.javarush.osypenko.field;

import com.javarush.osypenko.constants.CharacteristicsEntities;
import com.javarush.osypenko.constants.Constants;
import com.javarush.osypenko.entities.AnimalsEnum;
import com.javarush.osypenko.entities.Organism;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class GameField {
    public static Cell[][] field = new Cell[Constants.CELL_X][Constants.CELL_Y];

    public void cellPrint() {
        for (int i = 0; i <= Constants.CELL_X; i++) {
            for (int j = 0; j <= Constants.CELL_Y; j++) {
                if (i == 0) {
                    if (j == 0) {
                        System.out.print("╔══");
                    } else if (j == Constants.CELL_Y) {
                        System.out.println("══╗");
                        initialize(i);
                    } else {
                        System.out.print("══╦══");
                    }
                } else if (i == Constants.CELL_X) {
                    if (j == 0) {
                        System.out.print("╚══");
                    } else if (j == Constants.CELL_Y) {
                        System.out.println("══╝");
                    } else {
                        System.out.print("══╩══");
                    }
                } else {
                    if (j == 0) {
                        System.out.print("╠══");
                    } else if (j == Constants.CELL_Y) {
                        System.out.println("══╣");
                        initialize(i);
                    } else {
                        System.out.print("══╬══");
                    }
                }
            }
            System.out.println();
        }
    }

    private static void initialize(int i) {
        for (int k = 0; k < Constants.CELL_Y; k++) {
            System.out.print("║    ");

            AnimalsEnum[] animalsEnums = AnimalsEnum.values();
            for (AnimalsEnum animalsEnum : animalsEnums) {
                int x;
                int num = 0;
                Class<?> aClass = CharacteristicsEntities.getCharacteristicsEntities().get(animalsEnum).getClass();

//                ========================= Ошибка =============================
//                try {
//                    Field maxNumberOfAnimalsOfThisSpeciesPerCage = aClass.getDeclaredField("maxNumberOfAnimalsOfThisSpeciesPerCage");
//                    maxNumberOfAnimalsOfThisSpeciesPerCage.setAccessible(true);
//                    x = (int) maxNumberOfAnimalsOfThisSpeciesPerCage.get(aClass);
//                    maxNumberOfAnimalsOfThisSpeciesPerCage.setAccessible(false);
//                } catch (IllegalAccessException | NoSuchFieldException e) {
//                    throw new AnimalException(e);
//                }
//
//                num = ThreadLocalRandom.current().nextInt(0, x);
//                ===============================================================

                Set<Organism> typeSet = new HashSet<>();

                for (int j = 0; j < num; j++) {
                    Organism organism = null;
//                  organism = Factory.getUnit(animalsEnum);
                    typeSet.add(organism);
                }

                Cell cell = new Cell(i, k);
                cell.sets.put(Arrays.toString(animalsEnums), typeSet);

                field[i][k] = cell;
            }

            if (k == Constants.CELL_Y - 1) {
                System.out.print("║");
            }
        }
    }

    // делаем шаг
    public void makeStep() {
    }

    // вывести на екран статистику
    public void printState() {

    }
}
