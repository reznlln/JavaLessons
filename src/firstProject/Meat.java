package firstProject;

public class Meat extends Food implements Discountable{
    public Meat(int amount, double price,boolean isVegetarian){
        super(amount,price,isVegetarian);
    }

    @Override
    public double getPrice() {
        return super.getPrice();
    }

    @Override
    public double getDiscount() {
        return 0;
    }
}
