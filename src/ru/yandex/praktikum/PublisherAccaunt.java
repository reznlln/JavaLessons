package ru.yandex.praktikum;

public class PublisherAccaunt {
    int calculatePoemPrice (int poemLines)
    {
        // создаём экземпляр класса с дефолтным модификатором доступа
        PriceCalculator priceCalculator = new PriceCalculator();
        // вызываем метод с дефолтным модификатором доступа
        return priceCalculator.getTotalPrice(poemLines);
    }
}
