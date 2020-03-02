public class Car {

    private CarData carData;

    public Car(CarData carData) {
        this.carData = carData;
    }

    public void create() {
        carData.createCar();
    }
}
