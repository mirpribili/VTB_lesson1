package com.geekbrains.lesson1.homework.animals;

public class Tiger extends Cat{
    public static int count;

    public Tiger(String name, int maxRunDistance, int maxSwimDistance) {
        super("Тигр", name, maxRunDistance, maxSwimDistance);
        count++;
    }
}
