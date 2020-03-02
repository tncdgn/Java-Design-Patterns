public class Main {

    public static void main(String[] args) {
        Product product = new Product(1, "ball");
        Product product1 = new Product(2, "lamb");
        Product product2 = new Product(3, "computer");

        Basket basket = new Basket();

        BasketCommand addToBasket = new AddToBasketCommand();
        BasketCommand removeFromBasket = new RemoveFromBasketCommand();

        CommandExecutor addExecutor = new CommandExecutor(addToBasket);
        addExecutor.executeCommand(basket, product);
        addExecutor.executeCommand(basket, product1);
        addExecutor.executeCommand(basket, product2);

        CommandExecutor removeExecutor = new CommandExecutor(removeFromBasket);
        removeExecutor.executeCommand(basket, product1);
        removeExecutor.executeCommand(basket, product);

        basket.showDetail();
    }
}
