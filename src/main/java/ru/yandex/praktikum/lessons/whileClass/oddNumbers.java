package main.java.ru.yandex.praktikum.lessons.whileClass;

import java.util.Scanner;

public class oddNumbers {
    public static void main(String[] args){
        for (int i = 0; i<=15; i++){
            if (i % 2 == 0){
                continue;
            }
            System.out.println("Это не четное число: " + i);
        }
        Scanner scannerA = new Scanner(System.in);
        System.out.println("Введите значение для I");
        int countI = scannerA.nextInt();
        System.out.println("Введите значение для J");
        Scanner scannerB = new Scanner(System.in);
        int countJ = scannerB.nextInt();

        for (int i = 0; i<countI; i++) {
            int j =0;
            while (true) {
                if (j == countJ) {
                    break;
                }
                j++;
                System.out.println(i + "," +j);
            }
            System.out.println("Мы вышли из цикла");
        }
    }
}
