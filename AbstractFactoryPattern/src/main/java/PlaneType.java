public enum PlaneType {
    AIRBUS(AirBus.class.getName(), AirBus.class),
    BOEING(Boeing.class.getName(), Boeing.class);

    private final String planeClassName;
    private final Class<?> classType;

    PlaneType(String planeClassName, Class<?> classType) {
        this.classType = classType;
        this.planeClassName = planeClassName;
    }

    public String getPlaneClassName() {
        return planeClassName;
    }

    public Class<?> getClassType() {
        return classType;
    }
}
