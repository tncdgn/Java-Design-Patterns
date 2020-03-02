public class Main {

    public static void main(String[] args) {
        Car standardCar = new StandardCar();
        standardCar.create();

        System.out.println();

        Car withSunRoof = new CarWithSunRoof(standardCar);
        withSunRoof.create();

        Car withAutomaticShift = new CarWithAutomaticShift(standardCar);
        withAutomaticShift.create();
    }
}
