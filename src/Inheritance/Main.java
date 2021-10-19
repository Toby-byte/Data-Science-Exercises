package Inheritance;

public class Main {
    public static void main(String[] args) {
        Tiger tony = new Tiger("tony",4,true,"orange");
        Cat blakie = new Cat("blakie",4,true);
        Dog pepe = new Dog("pepe",4,true);

        tony.animalSound("roar!");
        blakie.animalSound("meow!");
        pepe.animalSound("bark!");

    }
}
