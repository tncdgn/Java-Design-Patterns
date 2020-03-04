public class SamsungFactory implements AbstractSmartProductFactory {

    @Override
    public MobilePhone producePhone() {
        return new Galaxy();
    }

    @Override
    public Tablet produceTablet() {
        return new GalaxyTab();
    }
}
