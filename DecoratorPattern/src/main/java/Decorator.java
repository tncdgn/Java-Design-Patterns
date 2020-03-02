public abstract class Decorator implements Car {

    private Car car;

    public Decorator(Car car) {
        this.car = car;
    }

    public void create() {
        car.create();
    }
}
