package Inheritance.AutoShop;

public class Truck extends Car {
    int weight;

    public Truck(int speed, double regularPrice, String color, int weight) {
        super(speed, regularPrice, color);
        this.weight = weight;
    }
    @Override
    public void getSalePrice() {
        if (this.weight > 2000) {
            double newprice = this.regularPrice = regularPrice * 0.9;
            System.out.println(newprice);
        } else {
            double newprice = this.regularPrice = regularPrice * 0.8;
            System.out.println(newprice);
        }
    }
}
