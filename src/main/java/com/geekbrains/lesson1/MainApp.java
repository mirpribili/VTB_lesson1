package com.geekbrains.lesson1;

import animals.Animal;
import animals.Cat;
import animals.Dog;

public class MainApp {
    public static void main(String[] args) {
        Cat cat = new Cat("Murzik", "White", 2);
        /*

        cat.voice();
        Cat.doSomething();
        Cat[] cats = new Cat[1];
        cats[0] = cat;
        cats[0].info();
       /* */
        Animal[] catsAndDogs = {
                new Cat("Murzik", "White", 2),
                new Dog("Bobik", "White", 3),
        };
        for (Animal o: catsAndDogs){
            o.voice();
        }
        Cat.doSomething();

        if(catsAndDogs[0] instanceof Cat){
            (( Cat )catsAndDogs[0]).catMethod();
        }
        System.out.println(cat == catsAndDogs[0]);
        System.out.println(cat.equals(catsAndDogs[0]));

        System.out.println(cat.hashCode());
        System.out.println(catsAndDogs[0].hashCode());
    }
}
