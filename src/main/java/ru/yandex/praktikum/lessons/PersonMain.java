package main.java.ru.yandex.praktikum.lessons;

public class PersonMain {
    public static void main(String[] args) {
        Person person = new Person();
        person.setAge(25);
        System.out.println(person.getAge());
        person.setAge(-100);
        System.out.println(person.getAge());
    }
}
