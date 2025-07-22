package ecommercepayment;

public class CashOnDelivery implements PaymentMode {
    @Override
    public void pay(double amount) {
        System.out.println("Payment of ₹" + amount + " will be collected on delivery.");
    }
}
