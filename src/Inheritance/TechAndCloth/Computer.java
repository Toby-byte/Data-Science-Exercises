package Inheritance.TechAndCloth;

public class Computer {
    int price;
    boolean isComputerActive;
    String CPU;

    public static void computerNoise() {
        System.out.println("beep, boob");
    }

    public static void loadProgram() {
        System.out.println("Loading program...");
        System.out.println("...");
        System.out.println("...");
        System.out.println("...");
        System.out.println("Program loaded!");
    }

    public Computer(int price, boolean isComputerActive, String CPU) {
        this.price = price;
        this.isComputerActive = isComputerActive;
        this.CPU = CPU;
    }
}
