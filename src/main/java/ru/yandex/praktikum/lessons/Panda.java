package main.java.ru.yandex.praktikum.lessons;

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