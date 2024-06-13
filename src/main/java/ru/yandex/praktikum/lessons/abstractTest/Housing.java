package ru.yandex.praktikum.lessons.abstractTest;

public abstract class Housing {
    public abstract void cook();

}

class Room extends Housing{
    @Override
    public void cook(){
        System.out.println("Готовим в общей кухне");
    }
}

class Flat extends Housing{
    @Override
    public void cook(){
        System.out.println("Готовим на своей кухне");
    }
}

class Villa extends Housing {
    @Override
    public void cook(){
        System.out.println("Есть своя кухня и место для барбекю");
    }
}
