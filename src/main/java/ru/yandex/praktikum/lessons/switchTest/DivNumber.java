package main.java.ru.yandex.praktikum.lessons.switchTest;

import java.util.Scanner;

public class DivNumber {
    public static void main(String[] args) {

        while (true) {
            Scanner scannerA = new Scanner(System.in);
            System.out.println("Введите число для деления: ");
            double div = scannerA.nextDouble();

            Scanner scannerB = new Scanner(System.in);
            System.out.println("Введите число на которое будет делить: ");
            double divider = scannerB.nextDouble();

            double result = div / divider;

            if (divider == 0) {
                break;
            } else {
                System.out.println("Результат деления равен: " + result);
            }
        }
    }
}
