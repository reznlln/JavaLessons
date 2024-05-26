package ru.yandex.praktikum;

public class ConvertStringAndChar {
    public static void main (String[] args)
    {
        String str = "Hello world!";
        short[] symArr = new short[str.length()];
        for (byte i = 0; i < str.length(); i++)
        {
            char symb = str.charAt(i);
            symArr[i] = (short) symb;

        }
        System.out.println("Это числовой массив, в котором закодирована строка: ");

        for (byte i = 0; i < symArr.length; i++) {
            System.out.println(symArr[i]);

            if (i < symArr.length - 1) System.out.print(", ");
        }
        short[] numArr = {72, 101, 108, 108, 111, 32, 87, 111, 114, 108, 100, 33};
        System.out.print("\nЭто раскодированная строка из массива чисел: ");

        for (byte i = 0; i < numArr.length; i++){
           System.out.println((char)numArr[i]);
        }
    }
}
