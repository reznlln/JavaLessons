package main.java.ru.yandex.praktikum.lessons;

public class ChangeTypeVariableMain {
    public static void main(String[] args) {
        int integerNumber = 500;
        double anotherNumber = 13.78;
        //byte smallNumber = (byte) integerNumber; можно привести преведение типа через инициализацию переменной
        //ChangeTypeVariable.CheckMethod((byte) integerNumber); // явное приведение переменной в тип byte через метод
        byte anotherNumberByte = (byte) anotherNumber;
        ChangeTypeVariable.CheckMethod(anotherNumberByte);
        // переменную не получится привести к типу, если переменная не входит в диапазон приводимого типа.
        // из меньшего в большего получится, но не наоборот.
        //переменнные не получится привести в тип boolean и char
        // double можно перевести в char, но значение после запятой будет стерто
    }
}
