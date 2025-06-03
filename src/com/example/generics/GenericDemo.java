package com.example.generics;

public class GenericDemo {
    public static void main(String[] args) {
        // Simple Box example
        Box<String> box = new Box<>();
        box.setValue("Generics are powerful");
        System.out.println("Box contains: " + box.getValue());

        // Pair with two type parameters
        Pair<String, Integer> pair = new Pair<>("Age", 42);
        System.out.println("Pair: " + pair.getFirst() + " -> " + pair.getSecond());

        // BoundedBox restricted to Numbers
        BoundedBox<Integer> bounded = new BoundedBox<>(10);
        System.out.println("BoundedBox double value: " + bounded.doubleValue());
    }
}
