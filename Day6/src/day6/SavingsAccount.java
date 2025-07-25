package day6;

	public class SavingsAccount implements Bank{
		private double balance;
		
		public SavingsAccount(double initialBalance) {
			this.balance=initialBalance;
		}
		public double getBalance() {
			return balance;
		}
		public void deposit(double amount) {
			balance +=amount;
		}
		public void withdraw(double amount) {
			if(balance>=amount) {
				balance -=amount;
			}else {
				System.out.println("Insufficients funds to withdraw $"+amount);
			}
		}
		public void displayAccountType() {
			System.out.println("account type:Savings Account");
		}
	}