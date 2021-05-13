package com.example.data;

import com.example.entity.Animal;

public class AnimalTestData {
    public static Animal newAnimal() {
        Animal animal = new Animal();
        animal.setName("Animal1");
        animal.setHeight("LOW");
        animal.setWeight("LUNG");
        animal.setType("HERBIVOROUS");
        return animal;
    }
}