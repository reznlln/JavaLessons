package ru.yandex.praktikum;

public class PrimitivePack {
    public static void main (String[] args) {
        int x = 123;
        Integer x2 = 777; //автоматическая упакова в обертку класса Integer
        int x3 = x2; //распаковка обертки
        String text = "1000";
        String text2 = "6";
        int numb = Integer.parseInt(text);
        byte numbB = Byte.parseByte(text2);
        System.out.println(numb);
        System.out.println(numbB);
    }
}
