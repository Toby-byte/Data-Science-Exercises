package Inheritance.TechAndCloth;

public class Garment {
    int price;
    String name;

    public Garment(int price,String name) {
        this.name = name;
        this.price = price;
    }

    public static void main(String[] args) {
        Garment silke = new Garment(50,"silke");
        Garment bomuld = new Garment(20,"bomuld");
        Garment hør = new Garment(25,"hør");

        //garments kan være i array selvom de ikke er af samme type
        //det kan de fordi, nedarver fra Garment class
        Garment[] garments = {silke,bomuld,hør};

        for (Garment garment : garments) {
            System.out.println(garment.toString());
        }

    }

    @Override
    public String toString() {
        return "Garment{" +
                "price=" + price +
                ", name='" + name + '\'' +
                '}';
    }
}
