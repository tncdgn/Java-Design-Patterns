public class Main {

    public static void main(String[] args) {
        MobilePhone iphone = SmartProductFactory.produceMobilePhone(new AppleFactory());
        MobilePhone galaxy = SmartProductFactory.produceMobilePhone(new SamsungFactory());

        Tablet ipad = SmartProductFactory.produceTablet(new AppleFactory());
        Tablet galaxyTab = SmartProductFactory.produceTablet(new SamsungFactory());

        iphone.produce();
        galaxy.produce();

        ipad.produce();
        galaxyTab.produce();
    }
}
