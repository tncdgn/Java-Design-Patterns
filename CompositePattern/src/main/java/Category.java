import java.util.ArrayList;
import java.util.List;

public class Category implements Library {
    private String name;

    public Category(String name) {
        this.name = name;
    }

    private List<Library> books = new ArrayList<Library>();

    public void show() {
        System.out.println(String.format("%s(%d)", this.name, books.size()));
        books.stream().forEach(
                book -> {
                    book.show();
                }
        );
    }

    public void add(Library book) {
        books.add(book);
    }

    public void remove(Library book) {
        books.remove(book);
    }
}
