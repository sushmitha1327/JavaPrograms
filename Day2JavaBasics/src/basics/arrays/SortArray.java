package basics.arrays; // ✅ Include package if you're using one

import java.util.Arrays; // ✅ Required to use Arrays.sort()

public class SortArray {
    public static void main(String[] args) {
        int[] arr = {50, 20, 40, 10, 30};

        Arrays.sort(arr); // ✅ Use fully qualified class

        System.out.println("Sorted array:");
        for (int value : arr) {
            System.out.print(value + " ");
        }
    }
}