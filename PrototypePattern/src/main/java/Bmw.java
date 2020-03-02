public class Bmw implements Car {
    public Car clone() {
        return new Bmw();
    }

    public CarType getType() {
        return CarType.BMW;
    }
}
