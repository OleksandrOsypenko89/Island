package com.javarush.osypenko.exception;

public class AnimalException extends RuntimeException{
    public AnimalException() {
        super();
    }

    public AnimalException(String message) {
        super(message);
    }

    public AnimalException(String message, Throwable cause) {
        super(message, cause);
    }

    public AnimalException(Throwable cause) {
        super(cause);
    }
}
