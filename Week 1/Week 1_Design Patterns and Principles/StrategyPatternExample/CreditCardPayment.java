public class CreditCardPayment implements PaymentStrategy{

    @Override
    public void pay() {
        System.out.println("Paying via Credit Card...");
    }
    
}
