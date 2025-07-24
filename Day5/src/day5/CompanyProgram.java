package day5;

public class CompanyProgram {	
		   // Department class to hold department information
		   class Department {
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

		       public void displayDepartmentInfo() {
		           System.out.println("Department: " + name);
		           System.out.println("Sales: $" + sales);
		           System.out.println("Expenses: $" + expenses);
		           System.out.println("Profit: $" + getProfit());
		           System.out.println("-------------------------------------");
		       }
		   }

		   // Company class to hold multiple departments
		   class Company {
		       private Department[] departments;
		       private int departmentCount;

		       public Company(int maxDepartments) {
		           departments = new Department[maxDepartments];
		           departmentCount = 0;
		       }

		       public void addDepartment(Department department) {
		           if (departmentCount < departments.length) {
		               departments[departmentCount] = department;
		               departmentCount++;
		           } else {
		               System.out.println("Cannot add more departments.");
		           }
		       }

		       public double getTotalProfit() {
		           double totalProfit = 0;
		           for (int i = 0; i < departmentCount; i++) {
		               totalProfit += departments[i].getProfit();
		           }
		           return totalProfit;
		       }

		       public void displayAllDepartments() {
		           System.out.println("Company Departments and Their Profits:");
		           for (int i = 0; i < departmentCount; i++) {
		               departments[i].displayDepartmentInfo();
		           }
		       }
		   }

		   public static void main(String[] args) {
		       CompanyProgram companyProgram = new CompanyProgram();

		       Company company = companyProgram.new Company(3);

		       Department salesDepartment = companyProgram.new Department("Sales", 500000, 200000);
		       Department hrDepartment = companyProgram.new Department("Human Resources", 200000, 150000);
		       Department itDepartment = companyProgram.new Department("IT", 350000, 100000);

		       company.addDepartment(salesDepartment);
		       company.addDepartment(hrDepartment);
		       company.addDepartment(itDepartment);

		       company.displayAllDepartments();

		       double totalProfit = company.getTotalProfit();
		       System.out.println("Total Profit for the Company: $" + totalProfit);
		   }
		}
