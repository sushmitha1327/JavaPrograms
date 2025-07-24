package day5;


import java.util.Scanner;

public class Vehicle_Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Vehicle2 v = new Car();  // Upcasting to abstract class
        v.brand();
        v.speed();
        v.display();
        
        sc.close();
    }
}