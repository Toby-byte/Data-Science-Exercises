package Inheritance;

public class Cat extends Animal {

    public Cat(String name, int nrOfLegs, boolean isMammal) {
        super(name, nrOfLegs, isMammal);
    }

    @Override
    public void animalSound(String sound) {
        System.out.println(sound);
    }
}
