package firstProject;

public class Apple extends Food{
    public String colour;
    public Apple(int amount, double price, String colour){
        this.amount = amount;
        this.price = price;
        this.colour = colour;
        this.isVegetarian = true;

    }

    @Override
    public double getPrice() {
        return super.getPrice();
    }
}