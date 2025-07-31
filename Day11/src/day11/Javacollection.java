package day11;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Javacollection {

    public static void main(String[] args) {

        // Adding courses
        ArrayList<String> courses = new ArrayList<>();
        courses.add("java");
        courses.add("python");
        courses.add("Data structures");
        courses.add("reactjs");

        System.out.println("Courses List:");
        for (String c : courses) {
            System.out.println(c);
        }

        // Adding course codes
        Set<String> courseCodes = new HashSet<>();
        courseCodes.add("101");
        courseCodes.add("102");
        courseCodes.add("103");
        courseCodes.add("104");

        System.out.println("\nCourse Codes:");
        for (String code : courseCodes) {
            System.out.println(code);
        }

        // Adding course durations using Map
        Map<String, Integer> courseDuration = new HashMap<>();
        courseDuration.put("java", 101);
        courseDuration.put("python", 102);
        courseDuration.put("Data structures", 103);
        courseDuration.put("reactjs", 104);

        System.out.println("\nCourse Duration Map:");
        for (String c : courseDuration.keySet()) {
            System.out.println(c + " = " + courseDuration.get(c));
        }
    }
}

