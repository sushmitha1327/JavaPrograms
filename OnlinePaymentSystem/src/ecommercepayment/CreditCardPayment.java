package ecommercepayment;

public class CreditCardPayment implements PaymentMode {
    @Override
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Credit Card.");
    }
}