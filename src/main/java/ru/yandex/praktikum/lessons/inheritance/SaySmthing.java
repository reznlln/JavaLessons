package main.java.ru.yandex.praktikum.lessons.inheritance;

class Animal {
    double weight;
    boolean iSScratching;
    protected String name = "Животное";

    public Animal(){// Конструктор по умолчанию
        weight = 0.0;
        iSScratching = false;
        name = "Не известно";
    }

    public Animal (String animalName)
    {
        name = animalName;
    }

    public String Say(){
        return "Я животное!";
    }

    public void PrintMethod(){
        System.out.println("Напечатано из класса Animal");
    }
}

//класс наследник
class Fox extends Animal
{
    private String color;
    private String name = "Рыжок";

    @Override //аннотация на преопределение метода
    public String Say(){
        return "Я лис!";
    }

    public void PrintMethod()
    {
        super.PrintMethod();//вызов родительского метода
        System.out.println(super.name);//вызов родительского поля через суперкласс
        System.out.println("Напечатано из класса Fox");
        System.out.println(name);
    }
}

class Dog extends Animal {
    public Dog(){
        super();// вызов конструктора суперкласса без параметров
        System.out.println("Животное без имени");
    }

    public Dog (String animalName){
        super(animalName);// вызов конструктора суперкласса с параметром
    }
}

public class SaySmthing {
    public static void main (String[] args)
        {
            Animal fox = new Fox();//в переменной с типом класса-родителя можно хранить объект дочернего класса.
            System.out.println(fox.Say());
            fox.PrintMethod();
            Animal dog = new Dog("Бобик");
            System.out.println("Имя собачки: " + dog.name);
            Animal doggy = new Dog();
            System.out.println("Имя собачки: " + doggy.name);

        }
}


