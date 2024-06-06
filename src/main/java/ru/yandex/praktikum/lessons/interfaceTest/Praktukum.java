package main.java.ru.yandex.praktikum.lessons.interfaceTest;

 class Praktikum {

    public static void main(String[] args) {
        Boat2 boat = new Boat2(false);
        System.out.println("Является ли транспорт наземным: " + boat.isGround());

        GroundTransport motorcycle = new Motorcycle(true, 2);
        System.out.println("Является ли транспорт наземным: " + motorcycle.isGround());
        System.out.println("Количество колёс: " + motorcycle.getWheelsCount());

        GroundTransport car = new Car(true, 4);
        System.out.println("Является ли транспорт наземным: " + car.isGround());
        System.out.println("Количество колёс: " + car.getWheelsCount());

        Car sportcar = new Sportcar(true, 4);
        System.out.println("Является ли транспорт наземным: " + sportcar.isGround());
        System.out.println("Количество колёс: " + sportcar.getWheelsCount());
    }

}

interface Transport2 {
    boolean isGround();
}

 abstract class GroundTransport implements Transport2 {
    private final boolean ground;
    private final int wheelsCount;

    public GroundTransport(boolean ground, int wheelsCount) {
        this.ground = ground;
        this.wheelsCount = wheelsCount;
    }
    public boolean isGround(){
        return ground;
    }
    public int getWheelsCount(){
        return wheelsCount;
    }
}

 class Boat2 implements Transport2 {

    private final boolean ground;

    public Boat2(boolean ground) {
        this.ground = ground;
    }

    public boolean isGround() {
        return ground;
    }
}

 class Motorcycle extends GroundTransport {

    public Motorcycle(boolean ground, int wheelsCount) {
        super(ground,wheelsCount);
    }
}

 class Car extends GroundTransport {

    public Car(boolean ground, int wheelsCount) {
        super(ground,wheelsCount);
    }

}

 class Sportcar extends Car {

    public Sportcar(boolean ground, int wheelsCount) {
        super(ground,wheelsCount);
    }

}