public abstract class Shop {

    public abstract void addToCart();
    public abstract void confirm();
    public abstract void makePayment();

    public void doShopping(){
        addToCart();
        confirm();
        makePayment();
    }
}
