public class RemoveFromBasketCommand implements BasketCommand {
    public void execute(Basket basket, Product product) {
        basket.remove(product);
        System.out.println(String.format("Product removed from basket.Product id is %d. Name is %s.", product.getId(), product.getName()));
    }
}
