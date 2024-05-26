package firstProject.model;

import firstProject.Apple;
import firstProject.Food;
import firstProject.Meat;
import firstProject.service.ShoppingCart;

public class Main {
    public static void main(String[] args){
        Meat meat = new Meat(5,100);
        Apple redApple = new Apple(10, 50, "red");
        Apple greenApple = new Apple(8,60, "green");
        Apple[] item = new Apple[2];
        //item[0] = meat;
        item[0] = redApple;
        item[1] = greenApple;

        ShoppingCart shoppingCart = new ShoppingCart(item);
        shoppingCart.GetSumWithoutDiscount(item);
        shoppingCart.GetSumWithDiscount(item);
    }
}
