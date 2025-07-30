package day10;

import java.util.Scanner;

public class ScannerEg {
    public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter Number: ");
			int a=sc.nextInt();
			System.out.println("Result: "+a);
		}
	}
}
