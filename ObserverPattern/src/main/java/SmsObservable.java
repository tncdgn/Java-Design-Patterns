import java.util.ArrayList;
import java.util.List;

public class SmsObservable implements Observable {

    private List<Observer> observers = new ArrayList<Observer>();

    private String message = "Product price changed";

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObserver() {
        observers.forEach(observer -> {
            System.out.println(String.format("Message is sending to %s name customer", observer.getName()));
            observer.notify(message);
        });
    }
}
