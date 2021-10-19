package Arrays;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Array_list {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> names2 = new ArrayList<String>();

        String userInputName;
        System.out.println("Write the name of a person, write 'stop' to stop");
        do {
            userInputName = scanner.nextLine();
            names2.add(userInputName);
        // dette er en anden version af userInputName != stop
        } while (!Objects.equals(userInputName, "stop"));

        //System.out.println("Here are your strings"+names2);

        // for each loop
        for (String name : names2) {
            System.out.println(name);
        }
        // iteration loop
        for (int i = 0; i < names2.size(); i++) {
            System.out.println(i);
        }

    }
}
