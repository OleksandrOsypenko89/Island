package com.javarush.osypenko;
import com.javarush.osypenko.exception.AnimalException;
import com.javarush.osypenko.pref.Application;

import java.util.concurrent.ExecutionException;

public class Runner {
    public static void main(String[] args) {

        try {
            new Application().runner();
        } catch (InterruptedException | ExecutionException e) {
            throw new AnimalException(e);
        }

    }
}
