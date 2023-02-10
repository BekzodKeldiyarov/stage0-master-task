package com.epam;

import com.epam.OOP.Animal;
import com.epam.OOP.Bird;
import com.epam.OOP.Dog;

public class Main {
    public static void main(String[] args) {
        Bird bird = new Bird();
        Dog dog = new Dog();
        System.out.println(bird.getDescription());
        System.out.println(dog.getDescription());

        // Everything is simple here,
        // we called getDescription() for two objects which are instances of classes inherited by Animal,
        // therefore from realization of method in class Animal, we have such kind of message in console.
        // In addition, overrided method in class Bird gives some different message
    }
}
