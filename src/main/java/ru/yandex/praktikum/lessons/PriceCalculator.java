package main.java.ru.yandex.praktikum.lessons;

class PriceCalculator {
    private int priceForLine = 100; // приватная переменная
    int getTotalPrice (int amountOfLines) // метод с модификатором по умолчанию
    {
        return priceForLine * amountOfLines;
    }

    int getPriceForLine () // метод с модификатором по умолчанию
    {
        return priceForLine;
    }
}