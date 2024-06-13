package main.java.ru.yandex.praktikum.lessons.switchTest;

import java.util.Scanner;

public class SwitchCountry {
    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите название города: ");
            String cityName = scanner.nextLine();
            String compareText = "Стоп";

    if (cityName.equals(compareText)){
        break;
    }
    else {
            switch (cityName) {
                case ("Москва"):
                case ("Владивосток"):
                case ("Ростов "):
                    System.out.println("Россия");
                    break;
                case ("Рим"):
                case ("Милан"):
                case ("Турин"):
                    System.out.println("Италия");
                    break;
                case ("Ливерпуль"):
                case ("Манчестер"):
                case ("Лондон"):
                    System.out.println("Англия");
                    break;
                case ("Берлин"):
                case ("Мюнхен"):
                case ("Кёльн"):
                    System.out.println("Германия");
                    break;
                case ("Стоп"):
                    break;
                default:
                    System.out.println("Неизвестная страна");
            }
        }
    }
        }
}
