import java.util.ArrayList;
import java.util.List;

public class StockMarket implements Stock {
    private List<Observer> observers;

    public StockMarket() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void register(Observer o) {
        System.out.println("Observer registered...");
        observers.add(o);
    }

    @Override
    public void deregister(Observer o) {
        System.out.println("Observer De-Registered...");
        observers.remove(o);
    }

    @Override
    public void Notify() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
