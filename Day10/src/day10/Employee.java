package day10;

public class Employee {

		
		String name;
		int age;
		Employee(String name,int age){
			this.name=name;
			this.age=age;
		}
		@Override
		public String toString() {
			return "Employee [name=" + name + ", age=" + age + "]";
		}
		
	}

