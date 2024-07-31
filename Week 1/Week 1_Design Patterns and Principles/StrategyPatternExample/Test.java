public class Test {
    public static void main(String[] args) {
        PaymentContext PayPal = new PaymentContext(new PayPalPayment());
        PayPal.payment();

        PaymentContext cc = new PaymentContext(new CreditCardPayment());
        cc.payment();
    }
}
