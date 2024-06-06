package main.java.ru.yandex.praktikum.lessons.Static;

public class FlatCount {
    static int StaticCounter;
    int NotStaticCounter;

    FlatCount(){
        StaticCounter ++;
        NotStaticCounter ++;
    }

    public void printCount(){
        System.out.println("Статическая переменная: " + StaticCounter);
        System.out.println("Не статическая переменная: " + NotStaticCounter);
        //Если перед переменной не поставить слово static, она будет обнуляться у каждого объекта и считаться заново.
    }

    public static void main (String[] args){
        FlatCount flatCount = new FlatCount();
        flatCount.printCount();

        FlatCount flatCount2 = new FlatCount();
        flatCount2.printCount();

        FlatCount flatCount3 = new FlatCount();
        flatCount3.printCount();


    }
}
