package billing;

@FunctionalInterface
public interface BillGenerator {
    void generate(double amount);  // Abstract method

    // Default method
    default void showBillFormat() {
        System.out.println("***** BILL RECEIPT *****");
    }

    // Static method
    static void displayHeader() {
        System.out.println("Welcome to Online Billing System");
    }
}
