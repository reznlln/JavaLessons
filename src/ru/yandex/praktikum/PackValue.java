package ru.yandex.praktikum;

public class PackValue {
    public static void main (String[] args)
    {
        byte a = 10;
        byte b = -8;
        byte c = 2;
        byte d = 1;
        byte e = 127;
        Byte[] number = new Byte[5];

        number[0] = a;
        number[1] = b;
        number[2] = c;
        number[3] = d;
        number[4] = e;

        for (byte i = 0; i < number.length; i++)
        {
            System.out.println(number[i]);
            if (i< number.length - 1)
            {
                System.out.println(", ");
            }
        }
    }
}
