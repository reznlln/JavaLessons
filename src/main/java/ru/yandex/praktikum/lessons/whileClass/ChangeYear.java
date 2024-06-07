package main.java.ru.yandex.praktikum.lessons.whileClass;

public class ChangeYear {
    public static void main (String [] args){
        int fromYear = 1980;
        int BeforeYear = 2020;
        while (fromYear <= BeforeYear){
            System.out.println("Олимпиада " + fromYear + " года");
            fromYear = fromYear + 4;
        }
    }
}
