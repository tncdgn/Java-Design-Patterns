public class SmartProductFactory {

    public static MobilePhone produceMobilePhone(AbstractSmartProductFactory factory) {
        return factory.producePhone();
    }

    public static Tablet produceTablet(AbstractSmartProductFactory factory) {
        return factory.produceTablet();
    }
}
