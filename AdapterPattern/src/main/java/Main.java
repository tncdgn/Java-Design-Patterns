public class Main {

    public static void main(String[] args) {
        DellCharger dellCharger = new DellComputer();
        dellCharger.charge();

        dellCharger = new ChargeAdapter(new HpComputer());
        dellCharger.charge();
    }
}
