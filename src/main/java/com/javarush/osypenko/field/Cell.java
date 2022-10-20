package com.javarush.osypenko.field;

import com.javarush.osypenko.entities.Organism;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Cell {
    private int row;
    private int col;

    public Cell(int row, int col) {
        this.row = row;
        this.col = col;
    }

    public Map<String, Set<Organism>> sets = new HashMap<>();

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

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }
}
