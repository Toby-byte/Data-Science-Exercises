package Inheritance;

abstract class Animal {
    public String name;
    public int nrOfLegs;
    public boolean isMammal;
    public abstract void animalSound(String sound);

    public Animal(String name, int nrOfLegs, boolean isMammal) {
        this.name = name;
        this.nrOfLegs = nrOfLegs;
        this.isMammal = isMammal;
    }
}
