package day11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Collection_Compaable1 {
    public static void main(String args[]) {
        ArrayList<Integer> courses = new ArrayList<>();
        courses.add(80);
        courses.add(10);
        courses.add(70);
        courses.add(40);
        courses.add(50);

        System.out.println("Before sorting: " + courses);

        Comparator<Integer> cpm = new Comparator<Integer>() {
            public int compare(Integer i, Integer j) {
                return i - j; // ascending order
            }
        };

        Collections.sort(courses, cpm);
        System.out.println("After sorting in ascending order: " + courses);
    }	
}
