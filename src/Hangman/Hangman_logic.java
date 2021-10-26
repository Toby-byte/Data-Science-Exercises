package Hangman;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Hangman_logic {

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            // først finder man sin fil ved at bruge "file klassen"
            // https://behu.gitbook.io/java-first-semester/topics/06-algorithms-and-data-structure/reading-a-file
            File HangmanNames = new File("ressources/HangmanNames.txt");
            // derefter laver man en scanner som scanner i HangmanNames identifier
            Scanner scanner = new Scanner(HangmanNames);
            // så længe scanner har næste linje, så printer den
            String HangmanName = null;
            while (scanner.hasNextLine()){
                HangmanName = scanner.nextLine();
            }
            ArrayList<String> name = new ArrayList<>();
            for (int i = 0; i < HangmanName.length(); i++) {
                char character = HangmanName.charAt(i);
                String letter = String.valueOf(character);
                name.add(letter);
            }
            System.out.println(name);

            ArrayList<String> blank = new ArrayList<>();
            blank.add("_");
            blank.add("_");
            blank.add("_");
            blank.add("_");
            blank.add("_");
            blank.add("_");

            while (true) {
                String userGuess = sc.nextLine();

                if (userGuess.contains(name.get(0))) {
                    blank.set(0, name.get(0));
                    System.out.println(blank);
                } else if (userGuess.contains(name.get(1))) {
                    blank.set(1, name.get(1));
                    System.out.println(blank);
                } else if (userGuess.contains(name.get(2))) {
                    blank.set(2, name.get(2));
                    System.out.println(blank);
                } else if (userGuess.contains(name.get(3))) {
                    blank.set(3, name.get(3));
                    System.out.println(blank);
                } else if (userGuess.contains(name.get(4))) {
                    blank.set(4, name.get(4));
                    System.out.println(blank);
                } else if (userGuess.contains(name.get(5))) {
                    blank.set(5, name.get(5));
                    System.out.println(blank);
                } else {
                    System.out.println("sorry but that's wrong");
                    return;
                }
            }

        } catch (FileNotFoundException e) {
            System.out.println("file could not be found!");
            e.printStackTrace();
        }
    }

}
