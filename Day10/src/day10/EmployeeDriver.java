package day10;
import java.util.TreeSet;

public class EmployeeDriver {
    public static void main(String[] args) {
		Employee e1=new Employee("a",25);
		Employee e2=new Employee("b",13);
		Employee e3=new Employee("c",16);
		SortByAge s=new SortByAge();
		TreeSet<Employee>t=new TreeSet<Employee>(s);
		t.add(e1);
		t.add(e2);
		t.add(e3);
		
		for(Employee ele:t) {
			System.out.println(ele);
		}
	}
}