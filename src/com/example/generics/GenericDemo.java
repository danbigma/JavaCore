package com.example.generics;

public class GenericDemo {
    public static void main(String[] args) {
        Box<String> box = new Box<>();
        box.setValue("Generics are powerful");
        System.out.println("Box contains: " + box.getValue());
    }
}
