package Inheritance.AutoShop;

public class AutoShop {
    public static void main(String[] args) {
        Truck truck = new Truck(130,150000,"Black",1999);
        truck.getSalePrice();

        Sedan sedan = new Sedan(200,200000,"white",21);
        sedan.getSalePrice();

        Ford fordFocus = new Ford(200, 200000,"Blue",2020,0.9);
        fordFocus.getSalePrice();

        Car car = new Car(34,100000,"black");
        System.out.println(car.regularPrice);
    }
}
