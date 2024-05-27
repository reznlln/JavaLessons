package firstProject.service;
import firstProject.Apple;
import firstProject.Discountable;
import firstProject.Food;
import firstProject.model.constans.Colour;
import firstProject.model.constans.Discount;

public class ShoppingCart{
    Food[] items;
    public ShoppingCart(Food[] items){
        this.items = items;
    }

    public void GetSumWithoutDiscount(Food[] items){

        double total = 0;
        for (int i = 0; i < items.length; i++) {
             total = total + items[i].price;
        }
        System.out.println(total);
    }
    public void GetSumWithDiscount(Food[] items){

       double totalPriceWithDiscount = 0;
       double discount = 0;

       for (int i = 0; i < items.length; i++)
       {
           // items.getDiscount();
       }

//                if (discount!= 0) {
//                    totalPriceWithDiscount  = totalPriceWithDiscount + ((item[i].price * item[i].amount) * discount/100);
//                    System.out.println("Цена со скидкой: " + totalPriceWithDiscount);
//                }
//                else
//                {
//                    totalPriceWithDiscount = totalPriceWithDiscount + (item[i].price * item[i].amount);
//                    System.out.println("Полная стоимость: " + totalPriceWithDiscount);
//                }
//      }
       System.out.println(totalPriceWithDiscount);
    }

    public int GetSumVegeterianFoodWithoutDiscount(){
        return 0;
    }
}
