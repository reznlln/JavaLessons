package ru.yandex.praktikum.lessons;

public class SwapTest {
    public static void main (String[] args) {
        MyClass myClass = new MyClass();
        mySwap(myClass);
        System.out.println("Значение а равно: " + myClass.a + ". Значение b равно: " + myClass.b);
    }

    public static void mySwap (MyClass o){
        int temp = o.a;
        o.a = o.b;
        o.b = temp;
    }
}

class MyClass
    {
    int a = 1;
    int b = 2;
    }


