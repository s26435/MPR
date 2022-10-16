package org.example;

public class PizzaNotFoundExeption extends Exception {
    public PizzaNotFoundExeption(String errorMessage) {
        super(errorMessage);
    }
}