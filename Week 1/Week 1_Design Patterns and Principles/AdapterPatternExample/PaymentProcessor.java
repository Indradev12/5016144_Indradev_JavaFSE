public interface PaymentProcessor {
    void processPayment(String paymentType, double amount);
}