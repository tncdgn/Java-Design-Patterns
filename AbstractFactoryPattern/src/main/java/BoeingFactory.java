public class BoeingFactory implements AbstractPlaneFactory {
    public Plane createPlane() {
        return new Boeing();
    }
}
