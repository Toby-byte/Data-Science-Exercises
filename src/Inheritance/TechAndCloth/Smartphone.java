package Inheritance.TechAndCloth;

public class Smartphone extends Computer{
    boolean isConnectedToInternet;

    public Smartphone(int price, boolean isComputerActive, String cpu, boolean isConnectedToInternet) {
        super(price, isComputerActive, cpu );
        this.isConnectedToInternet = isConnectedToInternet;
    }

    public static void ringtone() {
        System.out.println("do door, do do");
    }
}
