public class ChargeAdapter implements DellCharger {

    private HpCharger hpCharger;

    public ChargeAdapter(HpCharger hpCharger) {
        this.hpCharger = hpCharger;
    }

    public void charge() {
        hpCharger.chargeHp();
    }
}
