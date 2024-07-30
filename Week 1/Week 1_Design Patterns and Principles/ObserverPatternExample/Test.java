public class Test {
    public static void main(String[] args) {
        StockMarket Stock = new StockMarket();

        Observer mobileApp = new MobileApp();
        Observer webApp = new WebApp();

        Stock.register(mobileApp);
        Stock.register(webApp);

        mobileApp.update();
    }
}
