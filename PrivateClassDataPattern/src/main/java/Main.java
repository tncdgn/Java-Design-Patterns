public class Main {

    public static void main(String[] args) {
        CarData carData = new CarData("red", 1.6, "hatchback");

        Car car = new Car(carData);
        car.create();
    }
}
