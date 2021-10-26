package JavaDataSearch;

import java.util.ArrayList;

public class BinarySearch {
ArrayList<Integer> ArrayListToSearch;
int numberToSearch;

    public BinarySearch(ArrayList<Integer> arrayListToSearch, int numberToSearch) {
        ArrayListToSearch = arrayListToSearch;
        this.numberToSearch = numberToSearch;

        int high = arrayListToSearch.size();
        int mid = (high/2)-1;
        while (true) {
            if (numberToSearch == mid) {
                System.out.println("the number " + numberToSearch + " is found");
                System.out.println("it has index "+arrayListToSearch.indexOf(mid));
                System.out.println(arrayListToSearch);
                return;
            } else if (numberToSearch > mid) {
                mid++;
            } else if (numberToSearch < mid) {
                mid--;
            }
        }
    }
}

