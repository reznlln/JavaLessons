package main.java.ru.yandex.praktikum.lessons.whileClass;

public class whileLoops {
    public static void main (String [] args){
        String text = "Java";
        int count = 1;

        System.out.println("Цикл while: ");
        while (count <= 10){
            System.out.println(text + " " + count);
            count++;
        }

        System.out.println("Цикл for: ");
        for (int i = 1; i<= 10; i++ ){
            System.out.println(text + " " + i);
        }

    }
}
