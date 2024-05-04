package org.example;

import ru.yandex.praktikum.Animal;
import ru.yandex.praktikum.AnimalFarm;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("CAT Mayy");
        list.add("DOG Zhuchka");
        list.add("CAT Mayy");
        list.add("COW Burenka");
        list.add("COW");
        list.add("DOG Sharik");
        list.add("COW Burenka");
        list.add("COW Burenka");
        list.add("CAT Mayy");
        list.add("MOUSE Melkaya");
        AnimalFarm animal = new AnimalFarm(list);
        animal.animalFarmAdd(Animal.CAT, "Ryzhik");
        animal.animalFarmAdd("Tuzik");
        animal.animalFarmAdd(Animal.HORSE);
        System.out.println("===== Печать списка =====");
        System.out.println(animal.toString());
        System.out.println("===== Печать списка закончился =====");
//        System.out.println(animal.countedAnimals().toString());
//        System.out.println(animal.uniqueNames().toString());
    }
}