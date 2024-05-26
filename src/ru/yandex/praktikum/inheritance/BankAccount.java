package ru.yandex.praktikum.inheritance;

public class BankAccount {
    private long money;

    BankAccount(){
        this.money = 0;
    }

    BankAccount(long money){
        this.money = money;
        // значение поля экземпляра текущего класса money равно значению аргумента money
        // без this поле не изменилось бы
    }

    public long getMoney(){
        return money;
    }

    public void setMoney(long money){
        this.money = money; //this нужен, если у поля класса и параметра метода одинаковые названия
    }
}

class MyClass {
    public static void main(String[] args) {
    BankAccount bankAccount = new BankAccount(500);
    System.out.println("На счету: " + bankAccount.getMoney() + " долларов");
    }
}
