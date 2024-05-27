package firstProject.service;
import firstProject.Food;

public class ShoppingCart {
    Food[] items;

    public ShoppingCart(Food[] items) {
        this.items = items;
    }

    public void GetSumWithoutDiscount(Food[] items) {

        double totalPriceWithoutDiscount = 0;
        for (int i = 0; i < items.length; i++) {
            totalPriceWithoutDiscount = totalPriceWithoutDiscount + items[i].price * items[i].amount;
        }
        System.out.println("Сумма товаров без скидки: " + totalPriceWithoutDiscount);
    }

    public void GetSumWithDiscount(Food[] items) {

        double totalPriceWithDiscount = 0;
        double discount = 0;

        for (int i = 0; i < items.length; i++) {
            discount = (items[i].getDiscount() / 100) * items[i].price;
            totalPriceWithDiscount = totalPriceWithDiscount + (items[i].price - discount) * items[i].amount;
            System.out.println("Скидка на товар: " + discount * items[i].amount);
        }
        System.out.println("Итого сумма продуктов со скидкой: " + totalPriceWithDiscount);
    }

    public void GetSumVegeterianFoodWithoutDiscount(Food[] items) {
        double totalPriceVegeterianFood = 0;
        for (int i = 0; i < items.length; i++) {

            if (items[i].isVegetarian == true) {
                totalPriceVegeterianFood = totalPriceVegeterianFood + items[i].price * items[i].amount;
            }
        }
        System.out.println("Итого сумма вегетерианских продуктов без скидки: " + totalPriceVegeterianFood);
    }
}
