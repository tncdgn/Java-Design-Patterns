public class AirBusFactory implements AbstractPlaneFactory {
    public Plane createPlane() {
        return new AirBus();
    }
}
