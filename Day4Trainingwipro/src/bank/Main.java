package bank;

public class Main {
    public static void main(String[] args) {
        // Testing Credit Card Payment
        CreditCardPayment ccp = new CreditCardPayment(10000);
        ccp.makePayment();

        // Testing UPI Payment
        UpiPayment upi = new UpiPayment(5000);
        upi.makePayment();
    }
}
