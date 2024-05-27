package firstProject.model;
import firstProject.Apple;
import firstProject.Food;
import firstProject.Meat;
import firstProject.service.ShoppingCart;

public class Main {
    public static void main(String[] args){
        Food meat = new Meat(6,100, false);
        Food redApple = new Apple(10, 50, true, "Green");
        Food greenApple = new Apple(8,60, true, "Red");
        Food[] item = { meat, redApple, greenApple};

        ShoppingCart shoppingCart = new ShoppingCart(item);
        shoppingCart.GetSumWithoutDiscount(item);
        shoppingCart.GetSumWithDiscount(item);
        shoppingCart.GetSumVegeterianFoodWithoutDiscount(item);
    }
}
