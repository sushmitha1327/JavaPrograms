package billing;

public class BillingTest {

	public static void main(String[] args) {

		        // Using static method from interface
		        BillGenerator.displayHeader();

		        // Lambda expression implementing the interface
		        BillGenerator bill = (amount) -> {
		            System.out.println("Amount: ₹" + amount);
		            System.out.println("Thank you for your payment!");
		        };

		        // Using default method
		        bill.showBillFormat();

		        // Calling the abstract method using lambda
		        bill.generate(4500);
		    }
		}
