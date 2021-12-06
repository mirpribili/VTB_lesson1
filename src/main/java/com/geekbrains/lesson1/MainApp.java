package com.geekbrains.lesson1;

import animals.Animal;
import animals.Cat;
import animals.Dog;
import com.geekbrains.lesson1.homework.animals.DomesticCat;
import com.geekbrains.lesson1.homework.animals.Tiger;

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
            if(o instanceof Cat){
                (( Cat )catsAndDogs[0]).catMethod();
            }
        }
        Cat.doSomething();


        //System.out.println(cat == catsAndDogs[0]);
        System.out.println(cat.equals(catsAndDogs[0]));

        System.out.println(cat.hashCode());
        System.out.println(catsAndDogs[0].hashCode());



        /* Home work */
        com.geekbrains.lesson1.homework.animals.Animal[] animals = {
                new DomesticCat("Маха-Коха", 200),
                new com.geekbrains.lesson1.homework.animals.Dog("Бим", 1000, 50),
                new Tiger("Тигран", 10000, 400)
        };
        for (com.geekbrains.lesson1.homework.animals.Animal o : animals){
            o.run(500);
            o.swim(50);
        }
        System.out.println("Животных: " + com.geekbrains.lesson1.homework.animals.Animal.count );
        System.out.println("Собак: " + com.geekbrains.lesson1.homework.animals.Dog.count );
        System.out.println("Тигров: " + Tiger.count );
        System.out.println("Домашних котов: " + DomesticCat.count);
    }
}
