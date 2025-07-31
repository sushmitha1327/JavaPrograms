package day11;

import java.util.ArrayList;

public class JavaCollections {

    static class Department {
        private String name;
        private double sales;
        private double expenses;

        public Department(String name, double sales, double expenses) {
            this.name = name;
            this.sales = sales;
            this.expenses = expenses;
        }

        public double getProfit() {
            return sales - expenses;
        }

        public String getName() {
            return name;
        }
    }

    public static void main(String[] args) {
        ArrayList<Department> departments = new ArrayList<>();
        departments.add(new Department("Sales", 200000, 150000));

     // Print department profits
        for (Department dept : departments) {
            System.out.println(dept.getName() + " profit: " + dept.getProfit());
    }   
  }  	
}