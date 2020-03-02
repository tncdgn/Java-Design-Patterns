public class ShoppingCartDiscount implements DiscountMaker {
    public int makeDiscount(Shoe shoe) {

        if (shoe.getPrice() > 100) {
            return shoe.getPrice() - 30;
        } else {
            return shoe.getPrice() - 10;
        }
    }

    public int makeDiscount(Shirt shirt) {
        if (shirt.getPrice() > 50) {
            return shirt.getPrice() - 22;
        } else {
            return shirt.getPrice() - 5;
        }
    }
}
