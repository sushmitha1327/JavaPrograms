package day5;
import java.util.Scanner;
public class Attendance_System {

		public static void main(String[] args) {
			        Scanner sc = new Scanner(System.in);
			        System.out.println("Enter the Number of Students");
			        int n = sc.nextInt();
			        sc.nextLine();

			        String[] name = new String[n];
			        String[] Status = new String[n];

			        for (int i = 0; i < n; i++) {
			            System.out.print("Enter name of student " + (i + 1) + ": ");
			            name[i] = sc.nextLine();

			            System.out.print("Is " + name[i] + " present? (P/A): ");
			            Status[i] = sc.nextLine().toUpperCase();

			            if (!Status[i].equals("P") && !Status[i].equals("A")) {
			                System.out.println("Invalid input. Marking Absent by default.");
			                Status[i] = "A";
			            }
			        }

			        System.out.println("\nAttendance Report:");
			        for (int i = 0; i < n; i++) {
			            System.out.println(name[i] + " - " + (Status[i].equals("P") ? "Present" : "Absent"));
			        }

			        sc.close();
			    }
			}