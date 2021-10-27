package Hangman;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> name = new ArrayList<>();
        name.add("T");
        name.add("o");
        name.add("b");
        name.add("i");
        name.add("a");
        name.add("s");

        String userGuess = sc.nextLine();

        String newStringName = name.stream().map(Object::toString)
                .collect(Collectors.joining(""));

        try {
            if (userGuess.contains(name.get(name.indexOf(userGuess)))) {
                System.out.println(userGuess + " is in there and the index is " + name.indexOf(userGuess));
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println(userGuess + " is not in there");
        }

    }
}
