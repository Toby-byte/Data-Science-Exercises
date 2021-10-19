package Variables;

public class Variables {
    public static void main(String[] args) {
        // this is a comment, this how you make comments, type "//"
        // variable declaration
        int age;
        int height;
        // variable assignment
        age = 33;
        height = 2;

        double heightButBetter = 2.17;
        // only '' allowed
        char FirstLetterOfName = 'T';
        // String needs to be spelled with capital S in java
        String name = "Tobias";

        // sout is a shortcut for System.out.println();, write sout and press tab
        System.out.println(heightButBetter);

        int sum = 12+87;
        System.out.println(sum);

        double sum2 = 23.5/56.9;
        System.out.println(sum2);

        // Danish foot
        double danishFootPrMeter = 0.3138535;
        // meter
        double boatInDanishFeet = 23;
        // how many meters is my boat?
        double boatInMeters = boatInDanishFeet * danishFootPrMeter;
        System.out.println("your boat is " + boatInMeters + " meters");
    }
}
