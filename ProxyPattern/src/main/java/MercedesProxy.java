public class MercedesProxy implements Car {

    private Car car;
    private static int MAX_MERCEDES_CREATE_CAPACITY = 3;
    private int numOfMercedes;

    public MercedesProxy(Car car) {
        this.car = car;
    }

    public void create() {
        if (numOfMercedes < MAX_MERCEDES_CREATE_CAPACITY) {
            car.create();
            numOfMercedes++;
        } else {
            System.out.println("Mercedes can not be created because of over create capacity limit");
        }
    }
}
