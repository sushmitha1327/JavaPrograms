package day9;


import java.util.List;
import java.util.ArrayList;
import java.util.Collection;

@SuppressWarnings("unused")
public class Collections1 {

	    public static void main(String[] args) {
	        List<Integer> data = new ArrayList<Integer>();
	        data.add(10);
	        data.add(11);
	        data.add(12);
	        data.add(13);

	        System.out.println(data.get(3));            // Output: 13
	        System.out.println(data.indexOf(13));       // Output: 3

	        // data.add("50"); // ❌ Invalid if uncommented – List<Integer> can't accept a String

	        /*
	        for(int i=0; i<data.size(); i++) {
	            System.out.print(data.get(i) + " ");
	        }
	        */

	        for (Object i : data) {
	            int data1 = (Integer) i;
	            System.out.println(data1);
	        }
	    }
}