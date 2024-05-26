package ru.yandex.praktikum;

public class Person {
    private int age;
    public String name;
    private boolean isStudent;

    public int getAge(){
        return age;
    }
    public boolean isStudent() { // геттер для переменной типа boolean
        return isStudent;
    }

    public void setAge (int newAge){
        if (newAge > 0)
        {
            age = newAge;
        }
    }
}
