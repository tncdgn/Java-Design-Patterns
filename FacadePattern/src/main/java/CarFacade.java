public class CarFacade implements Operation {

    CarModel carModel = new CarModel();
    CarBody carBody = new CarBody();
    CarMotor carMotor = new CarMotor();

    public void create() {
        carModel.create();
        carBody.create();
        carMotor.create();

        System.out.println("Creating car process finished");
    }
}
