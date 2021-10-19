package Inheritance.AutoShop;

public class Ford extends Car {
    int year;
    double manufacturerDiscount;

    public Ford(int speed, double regularPrice, String color, int year, double manufacturerDiscount) {
        super(speed, regularPrice, color);
        this.year = year;
        this.manufacturerDiscount = manufacturerDiscount;
    }

    @Override
    public void getSalePrice() {
       double newPrice = this.regularPrice * this.manufacturerDiscount;
        System.out.println(newPrice);
    }
}
