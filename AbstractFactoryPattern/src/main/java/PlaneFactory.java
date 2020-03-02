public class PlaneFactory {

    public static Plane getPlane(AbstractPlaneFactory planeFactory) {
        return planeFactory.createPlane();
    }
}
