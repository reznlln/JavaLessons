package ru.yandex.praktikum;

public class ParkingService {
    public static void main (String[] args)
    {
        Parking parking = new Parking();
        parking.reserveParkingPlace();
        parking.printFreeParkingPlacesAmount();
        parking.reserveParkingPlace();
        parking.printFreeParkingPlacesAmount();
        parking.leaveParkingPlace();
    }
}
