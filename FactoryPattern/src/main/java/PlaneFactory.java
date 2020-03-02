public class PlaneFactory {

    public Plane getPlaneType(PlaneType planeType) {
        try {
            return (Plane) Class.forName(planeType.getPlaneClassName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
