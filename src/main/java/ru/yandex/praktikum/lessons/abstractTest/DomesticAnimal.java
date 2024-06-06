package main.java.ru.yandex.praktikum.lessons.abstractTest;

public abstract class DomesticAnimal {
    public abstract String getSound();
    public abstract String getName();
    public abstract int getAge();
}

class Dog extends DomesticAnimal{
    @Override
    public String getSound(){
        return "Гав";
    }

    @Override
    public String getName(){
        return "Шарик";
    }

    @Override
    public int getAge(){
        return 3;
    }
}

class Main {
    public static void main(String[] args)

    {
        DomesticAnimal dog = new Dog();
        System.out.println(dog.getAge());
    }
}
