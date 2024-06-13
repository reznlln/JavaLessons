package main.java.ru.yandex.praktikum.lessons.operatorIf;

import java.util.Scanner;

public class Buildings {
    public static void main (String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Введите число: ");
        int countOfFlour = s.nextInt();

        if(countOfFlour <= 0){
            System.out.println("Ошибка ввода");
        }
        else if (countOfFlour <= 4){
            System.out.println("Малоэтажный дом");
        }
        else if (countOfFlour <= 8){
            System.out.println("Среднеэажный дом");
        }
        else {
            System.out.println("Многоэтажный дом");
        }
    }
}
