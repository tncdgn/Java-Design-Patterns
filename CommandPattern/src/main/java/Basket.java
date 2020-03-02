import java.util.ArrayList;
import java.util.List;

public class Basket {

    private List<Product> basketItems = new ArrayList<Product>();

    public void add(Product product) {

        basketItems.add(product);
    }

    public void remove(Product product) {
        basketItems.remove(product);
    }

    public List<Product> getBasketItems() {
        return basketItems;
    }

    public void setBasketItems(List<Product> basketItems) {
        this.basketItems = basketItems;
    }

    public boolean isBasketEmpty() {
        return basketItems.size() == 0;
    }

    public void showDetail() {
        if (isBasketEmpty()) {
            System.out.println("Basket is empty");
        } else {
            System.out.println("Basket total size is " + basketItems.size());
            getBasketItems().forEach(product -> {
                System.out.println(String.format("Product id is %d. Name is %s", product.getId(), product.getName()));
            });
        }
    }
}
