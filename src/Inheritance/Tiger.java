package Inheritance;

public class Tiger extends Animal {
    String furColor;

    public Tiger(String name, int nrOfLegs, boolean isMammal, String furColor) {
        super(name, nrOfLegs, isMammal);
        this.furColor = furColor;
    }

    @Override
    public void animalSound(String sound) {
        System.out.println(sound);
    }
}
