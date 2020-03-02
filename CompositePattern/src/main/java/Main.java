public class Main {

    public static void main(String[] args) {
        Category books = new Category("Kitap");

        Category scienceFiction = new Category("Science Fiction");
        Category mystery = new Category("Mystery");

        Book scienceFictionBook = new Book("Dune", 6);
        Book scienceFictionBook1 = new Book("Fahrenheit 451", 4);

        Book mysteryBook = new Book("The Silent Patient", 2);
        Book mysteryBook1 = new Book("Golden in Death", 7);

        books.add(scienceFiction);
        books.add(mystery);

        scienceFiction.add(scienceFictionBook);
        scienceFiction.add(scienceFictionBook1);

        mystery.add(mysteryBook);
        mystery.add(mysteryBook1);

        books.show();
    }
}
