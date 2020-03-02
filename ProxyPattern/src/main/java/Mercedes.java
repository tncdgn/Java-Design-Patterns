public class Mercedes implements Car {
    private String color;
    private double motorPower;

    public Mercedes(String color, double motorPower) {
        this.color = color;
        this.motorPower = motorPower;
    }

    public void create() {
        System.out.println(String.format("Mercedes is created.Motor power is %.1f. Color is %s", motorPower, color));
    }
}
