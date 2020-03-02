public class Book implements Library {

    private String name;

    private int quantity;

    public Book(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    @Override
    public void show() {
        System.out.println(String.format("\t%s.(%d)", name, quantity));
    }
}
