public class Main {

    public static void main(String[] args) {
        Shop shopFromN11 = new N11();
        shopFromN11.doShopping();

        System.out.println("--------------------");

        Shop shopFromTrendyol = new Trendyol();
        shopFromTrendyol.doShopping();

        System.out.println("--------------------");

        Shop shopFromHepsiBurada = new HepsiBurada();
        shopFromHepsiBurada.doShopping();
    }
}
