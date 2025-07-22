package ecommercepayment;

public class UpiPayment implements PaymentMode {
    @Override
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " via UPI.");
    }
}