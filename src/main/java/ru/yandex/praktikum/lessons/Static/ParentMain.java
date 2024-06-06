package main.java.ru.yandex.praktikum.lessons.Static;

public class ParentMain{
    public static void main (String[] args){
        Parent object = new Child();// создаём переменную с типом Parent, в которую кладём новый объект типа Child
        object.staticMethod();// вызываем статический метод
        Child.staticMethod();// вызываем статический метод без создания объекта, сразу через класс
    }
}

class Parent {
    public static void staticMethod(){
        System.out.println("Метод внутри родительского класса");
    }
}

class Child extends Parent {
    public static void staticMethod(){
        System.out.println("Метод внутри дочернего класса");
    }
}
//Если методы нестатические, переопределение срабатывает.
// И тогда выполняется метод класса, который соответствует типу объекта. То есть Child