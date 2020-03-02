public class Main {

    public static void main(String[] args) {

        CarFactory.load();

        Car bmw = CarFactory.get(CarType.BMW);
        Car ferrari = CarFactory.get(CarType.FERRARI);
        Car mercedes = CarFactory.get(CarType.MERCEDES);

        System.out.println(bmw.getType());
        System.out.println(ferrari.getType());
        System.out.println(mercedes.getType());
    }
}
