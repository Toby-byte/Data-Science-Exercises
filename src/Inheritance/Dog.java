package Inheritance;

public class Dog extends Animal{

    public Dog(String name, int nrOfLegs, boolean isMammal) {
        super(name, nrOfLegs, isMammal);
    }

    @Override
    public void animalSound(String sound) {
        System.out.println(sound);
    }
}
