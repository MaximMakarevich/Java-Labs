package org.example;

public class InvalidGameDataException extends Exception {
    public InvalidGameDataException(String message) {
        super(message);
    }
}