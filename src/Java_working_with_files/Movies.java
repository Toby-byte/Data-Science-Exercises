package Java_working_with_files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Movies {
    private int year;
    private int length;
    private String title;
    private String Subject;
    private int popularity;
    private String Awards;

    public Movies(int year, int length, String title, String subject, int popularity, String awards) {
        this.year = year;
        this.length = length;
        this.title = title;
        Subject = subject;
        this.popularity = popularity;
        Awards = awards;
    }

    static void getLongestMovie(ArrayList<Movies> ArrayListWithMovies) {
        ArrayList<Integer> lengthOfMovies = new ArrayList<>();
        for (int i = 0; i < ArrayListWithMovies.size(); i++) {
            int movieLength = ArrayListWithMovies.get(i).length;
            lengthOfMovies.add(movieLength);
        }
        int maxMovieLength = Collections.max(lengthOfMovies);
        System.out.println(maxMovieLength);
    }

    static void getStartrekMovies(ArrayList<Movies> ArrayListWithMovies) {
        int count = 0;
        for (int i = 0; i <ArrayListWithMovies.size() ; i++) {
            if (ArrayListWithMovies.get(i).title.contains("Star Trek")) {
                count++;
                System.out.println(ArrayListWithMovies.get(i).title);
            }
        }
        System.out.println("there is "+count+" titles with star trek in them");
    }

    static void getAvrageOfMovies(ArrayList<Movies> ArrayListWithMovies) {
        int count = 0;
        double sum = 0;
        for (int i = 0; i <ArrayListWithMovies.size() ; i++) {
            int movieLength = ArrayListWithMovies.get(i).length;
            sum = sum+movieLength;
            count++;
        }
        double AvarageMovieLength = (sum/count)/60;
        System.out.println(AvarageMovieLength);
    }

    static void getMaxWordsOfMovies(ArrayList<Movies> ArrayListWithMovies) {
        ArrayList<Integer> ArrayListWordlength = new ArrayList<Integer>();
        for (int i = 0; i < ArrayListWithMovies.size(); i++) {
            String getStringArrayList = ArrayListWithMovies.get(i).title;
            String[] currentWords = getStringArrayList.split(" ");
            int wordlength = currentWords.length;
            ArrayListWordlength.add(wordlength);
            if (wordlength == 12) {
                System.out.println(ArrayListWithMovies.get(i).title);
            }
        }
        int longestWordtitle = Collections.max(ArrayListWordlength);
        System.out.println(longestWordtitle);
    }

    public static void main(String[] args) {
        ArrayList<Movies> Allmovies = new ArrayList<Movies>();
        File moviesDetails = new File("ressources/moviesDetails.csv");
        try {
            Scanner scanner = new Scanner(moviesDetails);
            // vi bruger count for at kunne skippe den første linje
            int count = 0;
            while (scanner.hasNextLine()) {
                if (count>=1) {
                    String movieLines = scanner.nextLine();
                    String[] stringAsArray = movieLines.split(";");
                    int year = Integer.parseInt(stringAsArray[0]);
                    int length = Integer.parseInt(stringAsArray[1]);
                    String title = stringAsArray[2];
                    String Subject = stringAsArray[3];
                    int popularity = Integer.parseInt(stringAsArray[4]);
                    String Awards = stringAsArray[5];
                    Movies currentMovie = new Movies(year, length, title, Subject, popularity, Awards);
                    Allmovies.add(currentMovie);
                }
                // dette else bruges til når man skipper den første linje
                else{
                    scanner.nextLine();
                }
                count++;
            }
            System.out.println(Allmovies);
            getLongestMovie(Allmovies);
            getStartrekMovies(Allmovies);
            getAvrageOfMovies(Allmovies);
            getMaxWordsOfMovies(Allmovies);

        } catch (FileNotFoundException e) {
            System.out.println("file could not be found!");
            e.printStackTrace();
        }

    }

    @Override
    public String toString() {
        return "Java_files.Movie{" +
                "year=" + year +
                ", length=" + length +
                ", title='" + title + '\'' +
                ", Subject='" + Subject + '\'' +
                ", popularity=" + popularity +
                ", Awards='" + Awards + '\'' +
                '}';
    }
}
