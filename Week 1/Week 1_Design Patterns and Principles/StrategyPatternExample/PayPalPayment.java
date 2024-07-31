public class PayPalPayment implements PaymentStrategy{

    @Override
    public void pay() {
        System.out.println("Paying via PayPal...");
    }
    
}
