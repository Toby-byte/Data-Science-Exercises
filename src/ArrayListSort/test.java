package ArrayListSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class test {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        int num1 = 10;
        int num2 = 6;
        int num3 = 4;
        int num4 = 4;
        int num5 = 1;
        numbers.add(num1);
        numbers.add(num2);
        numbers.add(num3);
        numbers.add(num4);
        numbers.add(num5);
        // Ctrl+d duplikere en linje kode
        System.out.println(numbers);

        Collections.sort(numbers);

        System.out.println(numbers);

        // sådan laver man en liste som ikke er af typen String om til en String
        // https://stackoverflow.com/questions/599161/best-way-to-convert-an-arraylist-to-a-string
        String listString = numbers.stream().map(Object::toString)
                .collect(Collectors.joining(""));

        System.out.println(listString);
    }


}
