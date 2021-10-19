package Arrays;

import java.util.Scanner;

public class Arrays_start_test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello, write a name of a person");
        String userInputName = scanner.nextLine();
        System.out.println("Hello, write a name of another person");
        String userInputName2 = scanner.nextLine();

        String[] names = {userInputName, userInputName2};

        //System.out.println("Type a number between 0 and 1");
        //int userAnswer = scanner.nextInt();
        //String nameAt = names[userAnswer];


        // finder det første element ved index 0
        String firstElement = names[0];
        // finder det sidste element ved længden af array
        // og trække en fra på vi får det korrekte index
        String lastElement = names[names.length-1];

        System.out.println(firstElement);
        System.out.println(lastElement);
    }
}
