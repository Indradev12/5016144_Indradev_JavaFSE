public class Test {
    public static void main(String[] args) {
        PaymentProcessor upiPayment = new paymentAdapter("upi");
        upiPayment.processPayment("upi", 50000.00);

        PaymentProcessor netBankingPayment = new paymentAdapter("NetBanking");
        netBankingPayment.processPayment("NetBanking", 70000.00);
    }
}


