package day9;

import java.util.HashMap;
import java.util.Map;

public class Collections_Map {

    public static void main(String[] args) {
        Map<String, Integer> mapData = new HashMap<String, Integer>();

        mapData.put("A", 65);
        mapData.put("B", 66);
        mapData.put("C", 67);
        mapData.put("D", 68);

        // Print keys
        System.out.println(mapData.keySet()); // Output: [A, B, C, D]

        // Print values
        System.out.println(mapData.values()); // Output: [65, 66, 67, 68]

        // Print key-value pairs
        for (String key : mapData.keySet()) {
            System.out.println(key + ":" + mapData.get(key));
        }
    }
}
	