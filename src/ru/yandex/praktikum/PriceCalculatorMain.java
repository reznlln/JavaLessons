package ru.yandex.praktikum;

class PriceCalculatorMain {
    public static void main(String[] args) {
        PriceCalculator priceCalculator = new PriceCalculator();
        // если попытаться напрямую вывести значение переменной priceForLine,
        // получится ошибка: 'priceForLine' has private access in 'publisher.PriceCalculator'
        //System.out.println(priceCalculator.priceForLine); // эта строка не скомпилируется и будет гореть красным
        // зато через метод getPriceForLine всё сработает
        System.out.println("Цена за строку: " + priceCalculator.getPriceForLine());
    }
}
