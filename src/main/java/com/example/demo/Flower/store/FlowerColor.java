package com.example.demo.Flower.store;

public enum FlowerColor {
    /**
     * Flower colors.
     */
    RED("#FF0000"), BLUE("#0000FF"), WHITE("#FFFFFF"), GREEN("#00FF00");
    private final String stringRepresentation;

    FlowerColor(final String color) {
        this.stringRepresentation = color;
    }

    @Override
    public String toString() {
        return this.stringRepresentation;
    }
}
