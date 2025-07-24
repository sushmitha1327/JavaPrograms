package day5;

import java.util.Scanner;
abstract class Vehicle2 {
	int speedlimit;
	String brandName;
	abstract void speed();
	abstract void brand();
	void display() {
		System.out.println("Brand: " + brandName + ", Speed Limit: " + speedlimit + " km/h");
	}
}
class Car extends Vehicle2{
	void speed() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the speed limit:");
		this.speedlimit = sc.nextInt();
		 sc.close();
	}
	void brand() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Brand Name:");
		this.brandName = sc.next();
		 sc.close();
	}
	void display() {
		System.out.println("Brand: " + brandName + ", Speed Limit: " + speedlimit +" km/h");
		
		
		
	}
}