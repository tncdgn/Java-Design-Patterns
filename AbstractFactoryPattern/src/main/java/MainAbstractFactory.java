public class MainAbstractFactory {

    public static void main(String[] args) {
        Plane airbus = PlaneFactory.getPlane(new AirBusFactory());
        Plane boeing = PlaneFactory.getPlane(new BoeingFactory());

        airbus.produce();
        boeing.produce();
    }
}
