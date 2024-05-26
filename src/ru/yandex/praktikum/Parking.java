package ru.yandex.praktikum;

public class Parking {
    // константа, отвечающая за общее количество парковочных мест
    public static final int TOTAL_PARKING_PLACES = 100;
    // всего на парковке 100 свободных мест;
    // эта переменная доступна всем классам
    public int freeParkingPlaces = 100;
    // если парковка заполнена, значение переменной isFull будет true;
    // если свободные места ещё есть - false
    public boolean isFull = false;
    //метод который выводит общее количество мест
    public void printFreeParkingPlacesAmount (){
        System.out.println("Свободных парковочных мест осталось: " + freeParkingPlaces);
    }
    //метод, который резервирует парковочные места
    public void reserveParkingPlace(){
        if (!isFull) {
            System.out.println("Парковочное место зарезервировано");
            freeParkingPlaces--;
            if (freeParkingPlaces == 0) {
                isFull = true;
            }
        }
        else {
            System.out.println("Парковочных мест больше нет");
        }

        }

        //метод, который освобождает парковочные места
    public void leaveParkingPlace () {
        if (freeParkingPlaces < TOTAL_PARKING_PLACES) {
            System.out.println("Освободилось парковочное место");
            freeParkingPlaces++;
            printFreeParkingPlacesAmount();
        }
        else {
            System.out.println("Парковочных мест не может быть больше чем: " + TOTAL_PARKING_PLACES);
        }
    }

    }
