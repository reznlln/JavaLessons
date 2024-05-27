package firstProject;

public abstract class Food{
    public int amount;
    public double price;
    public boolean isVegetarian;

    public Food(int amount, double price, boolean isVegetarian) {
        this.amount = amount;
        this.price = price;
        this.isVegetarian = isVegetarian;
    }

    public double getPrice() {
        return price;

    }


    public abstract double getDiscount();
}

