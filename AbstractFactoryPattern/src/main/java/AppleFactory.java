public class AppleFactory implements AbstractSmartProductFactory {

    @Override
    public MobilePhone producePhone() {
        return new Iphone();
    }

    @Override
    public Tablet produceTablet() {
        return new Ipad();
    }
}
