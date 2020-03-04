public enum PlaneType {
    AIRBUS(Iphone.class.getName(), Iphone.class),
    BOEING(Galaxy.class.getName(), Galaxy.class);

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
