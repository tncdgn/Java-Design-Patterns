public class CarData {
    private String color;
    private double motorPower;
    private String type;

    public CarData(String color, double motorPower, String type) {
        this.color = color;
        this.motorPower = motorPower;
        this.type = type;
    }

    public void createCar() {
        System.out.println(String.format("Car is produced.Color is %s. Motor Power is %.1f. Type is %s",color,motorPower,type));
    }
}
