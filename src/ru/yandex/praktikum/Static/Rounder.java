package ru.yandex.praktikum.Static;

public class Rounder {
    public static void roundNumber(double number){
        System.out.println("Округленное число: " + Math.round(number));
    }
}

class RounderMain {
    public static void main(String[] args) {
    double number = 34.123;
    Rounder.roundNumber(number);//вызов статического метода их другого класса
    }
}

