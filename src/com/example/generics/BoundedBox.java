package com.example.generics;

public class BoundedBox<T extends Number> {
    private T number;

    public BoundedBox(T number) {
        this.number = number;
    }

    public double doubleValue() {
        return number.doubleValue();
    }
}
