public class WebApp implements Observer {
    @Override
    public void update() {
        System.out.println("Stock Updated through Web App");
    }
}
