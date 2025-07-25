package day6;

public interface Bank {
	 double getBalance();
     void deposit(double amount);
     void withdraw(double amount);
     default void displayAccountType() {
  	   System.out.println("Account Type:Generic Bank Account");
     }
     default void executeTransaction(String type,double amount) {
  	   if(!Bank.isValid(amount)) {
  		   System.out.println("Invalid amount: "+amount);
  		   return;
  	   }
  	   switch(type.toUpperCase()) {
  	   case "DEPOSIT":
  		   deposit(amount);
  		   System.out.println("Deposited $"+amount+"New balance:$"+getBalance());
  		   break;
  	   case "WITHDRAW":
  		   withdraw(amount);
  		   System.out.println("Withdrew $"+amount+"New balance:$"+getBalance());
  		   break;
  		   default:
  		   System.out.println("Unknown transaction type: "+type);
  	   }
     }
     static boolean isValid(double amount) {
  	   return amount>0;
     }
}