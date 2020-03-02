public class Product {
    private Observable smsObservable;
    private int quantity;
    private double price = 10;

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
        smsObservable.notifyObserver();
    }

    public Observable getSmsObservable() {
        return smsObservable;
    }

    public void setSmsObservable(Observable smsObservable) {
        this.smsObservable = smsObservable;
    }
}
