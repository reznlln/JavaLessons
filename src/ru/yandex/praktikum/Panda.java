package ru.yandex.praktikum;

public class Panda {
    String name; // не проинициализировано
    int age; // не проинициализировано
    boolean isLazy; // не проинициализировано
    int weight = 100;

    Panda (int PandaAge, int PandaWeight)
    {
        age = PandaAge;
        weight = PandaWeight;
    }
}