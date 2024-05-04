package ru.yandex.praktikum;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

import static ru.yandex.praktikum.Animal.*;

public class AnimalFarm {
    private static List<String> farmAnimals;

    public AnimalFarm(List<String> farmAnimals) {
        this.farmAnimals = farmAnimals;
    }

    public HashMap countedAnimals() {
        HashMap<Animal, Integer> hashMap = new HashMap<>();
        for (String animal : farmAnimals) {
            String[] str = animal.split(" ");
            if (str[0].equals(CAT.toString())) {
                if (hashMap.get(CAT) != null)
                hashMap.put(CAT, hashMap.get(CAT) + 1);
                else hashMap.put(CAT, 1);
            } else if (str[0].equals(DOG.toString())) {
                if (hashMap.get(DOG) != null)
                    hashMap.put(DOG, hashMap.get(DOG) + 1);
                else hashMap.put(DOG, 1);
            } else if (str[0].equals(HORSE.toString())) {
                if (hashMap.get(HORSE) != null)
                    hashMap.put(HORSE, hashMap.get(HORSE) + 1);
                else hashMap.put(HORSE, 1);
            } else if (str[0].equals(COW.toString())) {
                if (hashMap.get(COW) != null)
                    hashMap.put(COW, hashMap.get(COW) + 1);
                else hashMap.put(COW, 1);
            } else {
                System.out.println("Please correct string " + animal + ". Incorrect input data.");
                if (hashMap.get(NOT_DEFINED) != null)
                    hashMap.put(NOT_DEFINED, hashMap.get(NOT_DEFINED) + 1);
                else hashMap.put(NOT_DEFINED, 1);
            }
        }
        return hashMap;
    }

    public HashSet<String> uniqueNames() {
        HashSet<String> hashSet = new HashSet<>();
        for (String animal : farmAnimals) {
            String[] str = animal.split(" ");
            try {
                hashSet.add(str[1]);
            } catch (ArrayIndexOutOfBoundsException exception) {
                System.out.println("Please correct string " + animal + ". Incorrect input data.");
            }
        }
        return hashSet;
    }

    public void animalFarmAdd(Animal animal) {
        String str = animal.toString() + " N";
        this.farmAnimals.add(str);
    }

    public void animalFarmAdd(Animal animal, String name) {
        this.farmAnimals.add(animal.toString() + " " + name);
    }

    public void animalFarmAdd(String name) {
        this.farmAnimals.add(NOT_DEFINED.toString() + " " + name);
    }

    @Override
    public String toString() {
        String str = "";
        for (String animals: farmAnimals) {
            if (str.length() !=0) {
                str = str + "\n";
            }
            str = str + animals;
        }
        return str;
    }
}
