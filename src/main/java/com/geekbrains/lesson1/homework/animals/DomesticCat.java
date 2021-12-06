package com.geekbrains.lesson1.homework.animals;

public class DomesticCat extends Cat{
    public static int count;

    public DomesticCat(String name, int maxRunDistance) {
        super("Домашний кот", name, maxRunDistance, 0);
        count++;
    }
}
