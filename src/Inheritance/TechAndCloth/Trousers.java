package Inheritance.TechAndCloth;

public class Trousers extends Garment{
int length;
String color;

    public Trousers(int price, String name, int length,String color) {
        super(price, name);
        this.length = length;
        this.color = color;
    }

    public static void main(String[] args) {
        Trousers pants = new Trousers(150,"Cowboy",100,"black");
    }
}


