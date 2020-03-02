public class CarWithSunRoof extends Decorator {

    private String sunRoof = "sun roof";

    public CarWithSunRoof(Car car) {
        super(car);
    }

    public void create() {
        super.create();
        System.out.println("with " + sunRoof);
    }
}
