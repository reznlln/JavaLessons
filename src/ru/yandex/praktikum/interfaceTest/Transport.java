package ru.yandex.praktikum.interfaceTest;

public interface Transport {
     boolean ground();
     int getCountWheel();
}

class Boat implements Transport{
    private final boolean ground;
    private int countWheel;
    public Boat(boolean ground){
        this.ground = ground;
    }
    @Override
    public boolean ground(){
        return ground;
    }
    @Override
    public int getCountWheel(){
        return countWheel;
    }
        }

        class MotorCycle implements Transport{
            private final boolean ground;
            private final int countWheel;

            public MotorCycle(boolean ground, int countWheal){
                this.ground = ground;
                this.countWheel = countWheal;
            }
            @Override
            public boolean ground() {
                return ground;
            }

            @Override
            public int getCountWheel(){
                return countWheel;
            }
        }

        class MainClass {
            public static void main(String[] args) {
            Boat boat = new Boat(false);
            System.out.println("Boat надземный транспорт?: " + boat.ground());
            System.out.println("Boat количество колес: " + boat.getCountWheel());

            MotorCycle motorCycle = new MotorCycle(true,2);
            System.out.println("Boat надземный транспорт?: " + motorCycle.ground());
            System.out.println("Boat количество колес: " + motorCycle.getCountWheel());
            }
        }
