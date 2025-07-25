package day6;

public class BankMain {

	public static void main(String[] args) {
			Bank b=new SavingsAccount(2000);
			b.displayAccountType();
			b.executeTransaction("deposit", 500);
			b.executeTransaction("withdraw", 300);
			b.executeTransaction("withdraw", -100);
			System.out.println("Final Balance:$"+b.getBalance());
		}
	}