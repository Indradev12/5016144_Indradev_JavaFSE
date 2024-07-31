public class upiPayment implements Gateway{

    @Override
    public void gatewayType(double amount) {
        System.out.println("Processing payment of " + amount + " through Upi.");
    }
    
}
