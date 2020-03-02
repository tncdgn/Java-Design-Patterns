public class CarWithAutomaticShift extends Decorator {

    private String shiftType = "automatic shift";

    public CarWithAutomaticShift(Car car) {
        super(car);
    }

    public void create() {
        super.create();
        System.out.println("with " + shiftType);
    }
}
