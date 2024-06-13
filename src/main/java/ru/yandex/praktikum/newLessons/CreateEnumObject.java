package ru.yandex.praktikum.newLessons;

import ru.yandex.praktikum.newLessons.model.DayOfWeek;

public class CreateEnumObject {
    public static void main(String[] args){
        DayOfWeek dayOfWeek = DayOfWeek.Friday;
        CheckIsWeekend checkIsWeekend = new CheckIsWeekend();
        System.out.println("Указанный день " + dayOfWeek + " является выходным?: " + checkIsWeekend.isWeekend(dayOfWeek));
        checkIsWeekend.ListOfWeek();

        String day = "Tuesday";
        System.out.println(checkIsWeekend.CheckDaysInWeek(day));
        checkIsWeekend.NumberOfDay(day);
    }
}

 class CheckIsWeekend {
    public boolean isWeekend (DayOfWeek day){
        return DayOfWeek.Saturday.equals(day) || DayOfWeek.Sunday.equals(day);
    }
    public void ListOfWeek() {
        for (DayOfWeek dayOfWeek : DayOfWeek.values()){//метод для вывода всех enum на экран
            System.out.println(dayOfWeek);
        }
    }

    public DayOfWeek CheckDaysInWeek(String day){
        return DayOfWeek.valueOf(day);
    }

    public void NumberOfDay(String day){
        DayOfWeek dayEnum = DayOfWeek.valueOf(day);
        System.out.println("Порядковый номер дня: " + dayEnum.ordinal());
        System.out.println("День недели " + dayEnum.toString());//вывод enum как строку
    }
}


