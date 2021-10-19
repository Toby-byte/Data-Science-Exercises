package Java_files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Movie {
    int year;
    int length;
    String title;
    String Subject;
    int popularity;
    String Awards;

    public Movie(int year, int length, String title, String subject, int popularity, String awards) {
        this.year = year;
        this.length = length;
        this.title = title;
        Subject = subject;
        this.popularity = popularity;
        Awards = awards;
    }


    public static void main(String[] args) {
        ArrayList<Movie> Allmovies = new ArrayList<Movie>();
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
                    Movie currentMovie = new Movie(year, length, title, Subject, popularity, Awards);
                    Allmovies.add(currentMovie);
                }
                // dette else bruges til når man skipper den første linje
                else{
                    scanner.nextLine();
                }
                count++;
            }
            System.out.println(Allmovies);
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
