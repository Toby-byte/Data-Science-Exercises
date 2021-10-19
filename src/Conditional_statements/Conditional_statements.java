package Conditional_statements;

public class Conditional_statements {
    public static void main(String[] args) {

        boolean sun = true;

        if (sun==true) {
            System.out.println("sun is shinning");
        }
        System.out.println("program will reach this code, if sun is true");

        int tvPrice = 32000;
        int moneyForTv = 32000;
        int difference = tvPrice - moneyForTv;

        if (difference >= 0) {
            System.out.println("you can buy the tv :)");
        } else if (difference < 0) {
            System.out.println("you cant buy the tv :(");
        }
    }
}
