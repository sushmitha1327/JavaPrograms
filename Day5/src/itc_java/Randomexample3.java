package itc_java;

import java.util.Random;
public class Randomexample3 {
	
	
	    public static void main(String[] args) {
	        Random random = new Random();
	        int randomNumber = random.nextInt(1000);  // Random number between 0 and 99
	        System.out.println("Random number: " + randomNumber);
	    }
	}