public class Shoe implements CartItem {

    private String brand;
    private int price;

    public int accept(DiscountMaker discount) {
        return discount.makeDiscount(this);
    }

    public Shoe(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
