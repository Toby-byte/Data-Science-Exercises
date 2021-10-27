package Hangman;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Hangman_logic {

    static void hangmanDrawingsInitialize(int count) {
        if (count==1) {
            System.out.println(
                    "  _____\n" +
                            " | * * |\n" +
                            " |  _  |\n" +
                            "  \\___/\n" +
                            "\n" +
                            "\n" +
                            "\n" +
                            "\n" +
                            "     ");
        }else if (count==2) {
            System.out.println(
                    "  _____\n" +
                            " | * * |\n" +
                            " |  _  |\n" +
                            "  \\___/\n" +
                            "    |\n" +
                            "    |\n" +
                            "    |\n" +
                            "\n" +
                            "     ");
        }else if (count==3) {
            System.out.println(
                    "  _____\n" +
                            " | * * |\n" +
                            " |  _  |\n" +
                            "  \\___/\n" +
                            "    |\n" +
                            "    |\n" +
                            "    |\n" +
                            "   /\n" +
                            "  /    ");
        }else if (count==4) {
            System.out.println(
                    "  _____\n" +
                            " | * * |\n" +
                            " |  _  |\n" +
                            "  \\___/\n" +
                            "    |\n" +
                            "    |\n" +
                            "    |\n" +
                            "   / \\\n" +
                            "  /   \\");
        }else if (count==5) {
            System.out.println(
                    "  _____\n" +
                            " | * * |\n" +
                            " |  _  |\n" +
                            "  \\___/\n" +
                            "   /|\n" +
                            "  / |\n" +
                            "    |\n" +
                            "   / \\\n" +
                            "  /   \\");

        }else if (count==6) {
            System.out.println("  _____\n" +
                    " | * * |\n" +
                    " |  _  |\n" +
                    "  \\___/\n" +
                    "   /|\\\n" +
                    "  / | \\\n" +
                    "    |\n" +
                    "   / \\\n" +
                    "  /   \\");
        } else if (count==7) {
            System.out.println("  _____\n" +
                    " | * * |\n" +
                    " |  _  |\n" +
                    "  \\___/\n" +
                    "   /|\\\n" +
                    "  / | \\\n" +
                    "    |\n" +
                    "   / \\\n" +
                    "  /   \\");
            System.out.println("Stickman is dead");
        }
    }

    static void makeNameArrayList(String HangmanName,ArrayList<String> name ) {
        for (int i = 0; i < HangmanName.length(); i++) {
            char character = HangmanName.charAt(i);
            String letter = String.valueOf(character);
            name.add(letter);
        }
    }

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            // først finder man sin fil ved at bruge "file klassen"
            File HangmanNames = new File("ressources/HangmanNames.txt");
            // derefter laver man en scanner som scanner i HangmanNames identifier
            Scanner scanner = new Scanner(HangmanNames);
            // så længe scanner har næste linje, så printer den
            String hangmanName = null;
            while (scanner.hasNextLine()){
                hangmanName = scanner.nextLine();
            }

            ArrayList<String> name = new ArrayList<>();
            // Take letters from hangmanName and puts them into the ArrayList with the name: name
            makeNameArrayList(hangmanName,name);

            // is here to check the word in arraylist is correct
            System.out.println("The word is "+hangmanName.length()+" letters");

            ArrayList<String> blank = new ArrayList<>();

            for (int i = 0; i < name.size(); i++) {
                blank.add("_");
            }
            // Laver blank om til en string
            System.out.println(blank.stream().map(Object::toString)
                    .collect(Collectors.joining("")));

            int count = 0;
            while (true) {
                if (!blank.contains("_")) {
                    System.out.println("you won the game!");
                    return;
                } else if (count==7) {
                    System.out.println("you lost the game");
                    return;
                }
                try {
                    String userGuess = sc.nextLine();
                    if (userGuess.contains(name.get(name.indexOf(userGuess)))) {
                        blank.set(name.indexOf(userGuess), name.get(name.indexOf(userGuess)));
                        /*Jeg ved ikke hvordan denne kode virker,
                         men den laver en ArrayListe om til en String*/
                        String blankToString = blank.stream().map(Object::toString)
                                .collect(Collectors.joining(""));
                        System.out.println(blankToString);
                    }  else {
                        System.out.println("sorry but that's wrong");
                        count++;
                        System.out.println("you have "+count+" mistakes, you can have 6 in total");

                        hangmanDrawingsInitialize(count);
                    }
                } catch (IndexOutOfBoundsException e) {
                    System.out.println("That is not correct");
                    count++;
                    System.out.println("you have "+count+" mistakes, you can have 6 in total");

                    hangmanDrawingsInitialize(count);
                }
            }

        } catch (FileNotFoundException e) {
            System.out.println("file could not be found!");
            e.printStackTrace();
        }
    }

}
