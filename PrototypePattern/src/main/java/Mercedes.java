public class Mercedes implements Car {
    public Car clone() {
        return new Mercedes();
    }

    public CarType getType() {
        return CarType.MERCEDES;
    }
}
