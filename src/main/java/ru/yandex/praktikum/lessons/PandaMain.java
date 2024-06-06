package main.java.ru.yandex.praktikum.lessons;

public class PandaMain {
    public static void main (String[] args)
    {
        Panda lilu = new Panda(5,150);
        //Полям, у которых нет значения, программа присвоила значения по умолчанию.
        System.out.println("Имя панды: " + lilu.name);
        System.out.println("Возраст панды: " + lilu.age);
        System.out.println("Ленивая ли панда: " + lilu.isLazy);
        System.out.println("Вес панды: " + lilu.weight);
    }
}
