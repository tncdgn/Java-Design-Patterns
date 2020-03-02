public class Main {

    public static void main(String[] args) {
        MercedesProxy mercedesProxy = new MercedesProxy(new Mercedes("red", 1.6));

        mercedesProxy.create();
        mercedesProxy.create();
        mercedesProxy.create();
        mercedesProxy.create();
    }
}
