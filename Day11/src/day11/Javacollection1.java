package day11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Javacollection1 {

    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(4000, 3000, 5000, 1000));
        a.add(6000);
        a.add(7000);
        
        System.out.println("Original list: " + a);

        Collections.sort(a);
        System.out.println("Sorted list: " + a);

        int b = Collections.binarySearch(a, 5000);
        System.out.println("Index of 5000 in sorted list: " + b);

        Collections.reverse(a);
        System.out.println("Reversed list: " + a);
    }
}
