package com.javarush.osypenko.field;

import com.javarush.osypenko.constants.ConsoleColors;
import com.javarush.osypenko.constants.Constants;

import java.text.DecimalFormat;
import java.util.Arrays;

public class GameField {
    public static Cell[][] field = new Cell[Constants.CELL_X][Constants.CELL_Y];
    private String black = ConsoleColors.BLACK_BOLD;

    public void cellPrint() {
        for (int i = 0; i <= Constants.CELL_X; i++) {
            for (int j = 0; j <= Constants.CELL_Y; j++) {
                if (i == 0) {
                    if (j == 0) {
                        System.out.print(ConsoleColors.BLACK + "╔══");
                    } else if (j == Constants.CELL_Y) {
                        System.out.println(ConsoleColors.BLACK + "══╗");
                        extracted(i);
                    } else {
                        System.out.print(ConsoleColors.BLACK + "══╦══");
                    }
                } else if (i == Constants.CELL_X) {
                    if (j == 0) {
                        System.out.print(ConsoleColors.BLACK + "╚══");
                    } else if (j == Constants.CELL_Y) {
                        System.out.println(ConsoleColors.BLACK + "══╝");
                    } else {
                        System.out.print(ConsoleColors.BLACK + "══╩══");
                    }
                } else {
                    if (j == 0) {
                        System.out.print(ConsoleColors.BLACK + "╠══");
                    } else if (j == Constants.CELL_Y) {
                        System.out.println(ConsoleColors.BLACK + "══╣");
                        extracted(i);
                    } else {
                        System.out.print(ConsoleColors.BLACK + "══╬══");
                    }
                }
            }
            System.out.println();
        }
    }

    private static void extracted(int i) {
        for (int k = 0; k < Constants.CELL_Y; k++) {
            System.out.print(ConsoleColors.BLACK + "║    ");
            field[i][k] = new Cell(i, k);
            if (k == Constants.CELL_Y -1) {
                System.out.print(ConsoleColors.BLACK + "║");
            }
        }
    }

    // записываем неше поле живатными и растениями
    public void initialize() {

    }

    // делаем шаг
    public void makeStep() {

    }

    // вывести на екран статистику
    public void printState() {

    }
}
