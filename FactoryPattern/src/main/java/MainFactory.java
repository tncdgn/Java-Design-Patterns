public class MainFactory {

    public static void main(String[] args) {
        PlaneFactory planeFactory = new PlaneFactory();

        Plane airBus = planeFactory.getPlaneType(PlaneType.AIRBUS);
        Plane boeing = planeFactory.getPlaneType(PlaneType.BOEING);

        airBus.produce();
        boeing.produce();
    }
}
