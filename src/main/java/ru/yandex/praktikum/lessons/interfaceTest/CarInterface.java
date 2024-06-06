package main.java.ru.yandex.praktikum.lessons.interfaceTest;


public interface CarInterface{
    int getPower();
    void showInfo();//тут скорее всего можно было реализовать абстрактный класс
}

class SportCar implements CarInterface{
    @Override
    public int getPower(){
        return 1200;
    }

    @Override
    public void showInfo(){
        System.out.println("Информация из класса Sport Car");
    }

}

class Taxi implements CarInterface{
    @Override
    public int getPower(){
        return 500;
    }
    @Override
    public void showInfo(){
        System.out.println("Информация из класса Taxi");
    }

    public void methodClass(){
        System.out.println("Метод класса, которого нет в интерфейсе");
    }
}

class MyClass {
    public static void main(String[] args) {
    SportCar sportCar = new SportCar();
    System.out.println("Скорость машины: "+ sportCar.getPower());
    sportCar.showInfo();

    CarInterface taxi = new Taxi();
    taxi.showInfo();
    //taxi.methodClass(); метод не реализован в интерфейсе. Так как тип переменной CarInterface этот метод не используется

    Taxi taxi2 = new Taxi();
    taxi2.methodClass();
    }
}
