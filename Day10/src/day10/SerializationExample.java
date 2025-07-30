package day10;

import java.io.*;
class Student1 implements Serializable {
	private static final long serialVersionUID = 1L;
	private int rollno;
	private String name;

	public Student1(int rollno, String name) {
		this.rollno = rollno;
		this.name = name;
	}
	public Student1() {}
	public String toString() {
		return "Student1 [rollno=" + rollno + ", name=" + name + "]";
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}

public class SerializationExample {
	public static void main(String[] args) {
		Student1 s = new Student1();
		s.setRollno(10);
		s.setName("Supriya");

		// Use local path or safe folder
		String filePath = "hello.txt"; // or any valid existing folder path

		try (FileOutputStream out = new FileOutputStream(filePath);
			 ObjectOutputStream output = new ObjectOutputStream(out)) {
			output.writeObject(s);
			System.out.println("Serialized data saved in file: " + filePath);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
