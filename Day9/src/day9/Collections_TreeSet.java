package day9;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Collections_TreeSet {

    public static void main(String[] args) {
        Set<Integer> setData = new TreeSet<Integer>();
        setData.add(10);
        // setData.add("hello"); // Not allowed: TreeSet<Integer> only accepts integers
        setData.add(10);       // Duplicate - ignored
        setData.add(98);
        setData.add(16);

        System.out.println(setData); // Output: [10, 16, 98]

        Iterator<Integer> iterator = setData.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());  // ✅ print the actual values
        }
    }
}
