package JavaDataSearch;

import java.util.ArrayList;

public class BinarySearchExample {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 20; i++) {
            numbers.add(i);
        }
            BinarySearch binarySearch = new BinarySearch(numbers,20);
    }

}
