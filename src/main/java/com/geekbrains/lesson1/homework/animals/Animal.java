package com.geekbrains.lesson1.homework.animals;

public abstract class Animal {
    public static int count;
    String type;
    String name;

    int maxRunDistance;
    int maxSwimDistance;

    public Animal(String type, String name, int maxRunDistance, int maxSwimDistance) {
        count++;
        this.type = type;
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxSwimDistance = maxSwimDistance;
    }

    public void run (int distance){
        if(distance <= maxRunDistance){
            System.out.println(type + " " + name + " успех! пробежал достойно!" + distance + ".м");
        }else   {
            System.out.println(type + " " + name + " не удалось пробежать" + distance + ".м");
        }
    }

    public void swim (int distance){
        if(distance < 0 ) {
            throw new IllegalArgumentException("дистанция меньше 0");
        }
        if(maxSwimDistance == 0){
            System.out.println(type + " " + name + " не умеет плавать");
            return;
        }
        if(distance <= maxSwimDistance){
            System.out.println(type + " " + name + " успех! проплыл достойно!");
        }else   {
            System.out.println(type + " " + name + " не удалось проплыть");
        }
    }
}
