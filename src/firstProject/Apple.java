package firstProject;

import firstProject.model.constans.Colour;
import firstProject.model.constans.Discount;

public class Apple extends Food implements Discountable{
    public String colour;
    public Apple(int amount, double price, boolean isVegetarian, String colour){
        super(amount,price,isVegetarian);
        this.colour = colour;
    }

    @Override
    public double getDiscount() {
        if (colour == Colour.Red) {
            return Discount.discount;
        }
        else
            return 0;
    }

    @Override
    public double getPrice() {
        return super.getPrice();
    }

    public String getColour(){ return colour; }
}