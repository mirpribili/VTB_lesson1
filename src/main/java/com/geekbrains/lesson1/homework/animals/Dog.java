package com.geekbrains.lesson1.homework.animals;

public class Dog extends Animal{
    public static int count;

    public Dog(String name, int maxRunDistance, int maxSwimDistance) {
        super("Собака", name, maxRunDistance, maxSwimDistance);
        count++;
    }
}
