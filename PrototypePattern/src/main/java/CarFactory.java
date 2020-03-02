import java.util.HashMap;
import java.util.Map;

public class CarFactory {

    private static Map<CarType, Car> prototypeList = new HashMap<CarType, Car>();

    public static void load() {
        prototypeList.put(CarType.BMW, new Bmw());
        prototypeList.put(CarType.MERCEDES, new Mercedes());
        prototypeList.put(CarType.FERRARI, new Ferrari());
    }

    public static Car get(CarType carType) {
        return prototypeList.get(carType).clone();
    }
}
