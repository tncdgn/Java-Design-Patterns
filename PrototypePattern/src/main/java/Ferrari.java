public class Ferrari implements Car {
    public Car clone() {
        return new Ferrari();
    }

    public CarType getType() {
        return CarType.FERRARI;
    }
}
