package Inheritance.TechAndCloth;

public class Laptop extends Computer{
    int weight;

    public Laptop(int price, boolean isComputerActive, String cpu, int weight) {
        super(price, isComputerActive, cpu);
        this.weight = weight;
    }

    public static void playingSound() {
        System.out.println("Beep, beep, beep!");
    }
}
