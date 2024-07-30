public class paymentAdapter implements PaymentProcessor {
    Gateway gateway;

    public paymentAdapter(String paymentType){
        if(paymentType.equalsIgnoreCase("upi")){
            gateway = new upiPayment();
        }else if(paymentType.equalsIgnoreCase("NetBanking")){
            gateway = new netbankingPayment();
        }
    }

    @Override
    public void processPayment(String paymentType, double amount) {
        if(paymentType.equalsIgnoreCase("upi")){
            gateway.gatewayType(amount);
        }else if(paymentType.equalsIgnoreCase("NetBanking")){
            gateway.gatewayType(amount);
        }
    }
    
}








