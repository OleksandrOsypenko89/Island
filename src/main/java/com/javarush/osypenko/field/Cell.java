package com.javarush.osypenko.field;

import com.javarush.osypenko.entities.animal.Animal;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Cell {
    int row;
    int col;

    public Cell(int row, int col) {
        this.row = row;
        this.col = col;
    }

    public Map<String, Set<Animal>> sets = new HashMap<>();

    public void makeStep() {
        eat();
        move();
        multiply();
    }

    public void eat() {

    }

    public void move() {

    }

    private void multiply() {
    }
}
