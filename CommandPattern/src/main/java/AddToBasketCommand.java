public class AddToBasketCommand implements BasketCommand {
    public void execute(Basket basket, Product product) {
        basket.add(product);
        System.out.println(String.format("Product added to basket.Product id is %d. Name is %s.", product.getId(), product.getName()));
    }
}
