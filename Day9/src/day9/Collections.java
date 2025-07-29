package day9;

import java.util.ArrayList;
import java.util.List;

public class Collections {

    public static void main(String[] args) {
        List<Integer> data = new ArrayList<Integer>();
        
        data.add(10);
        data.add(11);
        data.add(12);
        data.add(13);

        // Print the element at index 3
        System.out.println(data.get(3));

        // Print the index of value 13
        System.out.println(data.indexOf(13));

        // Enhanced for loop to print all elements
        for (Object o : data) {
            int data1 = (Integer) o;
            System.out.println(data1);
        }
    }
}
