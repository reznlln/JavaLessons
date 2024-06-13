package main.java.ru.yandex.praktikum.lessons.switchTest;

import java.util.Scanner;

public class CheckAge {
    public static void main(String[] Args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите возраст: ");
        int age = scanner.nextInt();
        switch(age){
            case 0:
                System.out.println("Ты родился");
                break;
            case 7:
                System.out.println("Ты пошел в школу");
                break;
            case 18:
                System.out.println("Ты учишься в университете");
                break;
            default:
                System.out.println("Вы не ввели подходящий возраст");
        }

    }
}
