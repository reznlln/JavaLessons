package main.java.ru.yandex.praktikum.lessons.abstractTest;

abstract class Payment {
    abstract void pay();
}

class PayCash extends Payment{
    @Override
    void pay(){
        System.out.println("Оплачу кешем");
    }
}

class PayCard extends Payment{
    @Override
    void pay(){
        System.out.println("Оплачу картой");
    }
}
