package Inheritance.AutoShop;

public class Sedan extends Car {
    int length;


    public Sedan(int speed, double regularPrice, String color, int length) {
        super(speed, regularPrice, color);
        this.length = length;
    }
@Override
    public void getSalePrice() {

        if (this.length > 20) {
            double newPrice = this.regularPrice * 0.95;
            System.out.println(newPrice);
        } else {
            double newPrice = this.regularPrice * 0.90;
            System.out.println(newPrice);
        }
    }

}
