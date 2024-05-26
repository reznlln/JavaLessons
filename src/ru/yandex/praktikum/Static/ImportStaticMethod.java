package ru.yandex.praktikum.Static;
import static java.lang.Math.round;
import static java.lang.Math.pow;

public class ImportStaticMethod {
    public static void main (String[] args){
        long initialValue = 1000; // изначальная сумма вклада
        double interest = 0.05; // процентная ставка
        int count = 12; // количество периодов в год, когда начисляется процент
        int years = 2; // срок вклада в годах

        long total = round(initialValue * pow((1+ interest/count), count * years));//обратились к методам по названию
        // через импорт пакетов
        System.out.println("Итоговая сумма на счету: " + total);
    }
}
