import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<CartItem> cartItems = new ArrayList<CartItem>();

        CartItem deriden = new Shoe("deriden", 250);
        CartItem inci = new Shoe("inci", 75);

        CartItem network = new Shirt("network", 100);
        CartItem levis = new Shirt("levis", 30);

        cartItems.addAll(Arrays.asList(deriden, inci, network, levis));
        DiscountMaker discountMaker = new ShoppingCartDiscount();
        int totalCost = cartItems.stream().mapToInt(cartItem -> cartItem.accept(discountMaker)).sum();

        System.out.println(totalCost);
    }
}
