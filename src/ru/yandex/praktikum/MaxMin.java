package ru.yandex.praktikum;

public class MaxMin {
    public static void main (String[] args)
    {
        byte a = 8;
        byte b = 6;
        System.out.println("Максимальное число: " + getMax(a,b));
        System.out.println("Минимальное число: " + getMin(a,b));
    }

    private static byte getMax(byte FirstNumber, short SecondNumber)
    {
        return (byte)Integer.max(FirstNumber,SecondNumber);
    }

    private static byte getMin (byte FirstNumber, byte SecondNumber)
    {
        return (byte)Integer.min(FirstNumber, SecondNumber);
    }
}
