package firstProject.service;
import firstProject.Apple;
import firstProject.Discountable;
import firstProject.Food;
import firstProject.model.constans.Colour;
import firstProject.model.constans.Discount;

public class ShoppingCart implements Discountable {
    Food[] items;
    public ShoppingCart(Food[] obj){

    }

    public void GetSumWithoutDiscount(Food[] item){

        double total = 0;
        for (int i = 0; i < item.length; i++) {
             total = total + item[i].price;
        }
        System.out.println(total);
    }
    @Override
    public double getDiscount(Apple item){
        //Discount discount = new Discount();

        if (item.colour == Colour.Red) {
            return Discount.discount;
        }
        else return 0;
    }

    public void GetSumWithDiscount(Apple[] item){

       double itemPrice = 0;

       for (int i = 0; i < item.length; i++)
       {
           double discount = getDiscount(item[i]);
                if (discount != 0) {
                    itemPrice  = itemPrice + ((item[i].price * item[i].amount) * discount/100);
                    System.out.println("Цена со скидкой: " + itemPrice);
                }
                else
                {
                    itemPrice = itemPrice + (item[i].price * item[i].amount);
                    System.out.println("Полная стоимость: " + itemPrice);
                }
      }
       System.out.println(itemPrice);
    }

    public int GetSumVegeterianFoodWithoutDiscount(){
        return 0;
    }
}
