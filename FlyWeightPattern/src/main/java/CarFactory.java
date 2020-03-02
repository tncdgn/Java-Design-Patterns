import java.util.HashMap;

public class CarFactory {

    private static HashMap<String, Car> hashMap = new HashMap<String, Car>();

    public static Car getCar(String color) {

        if (!hashMap.containsKey(color)) {
            Car mercedes = new Mercedes(color);
            hashMap.put(color, mercedes);

            System.out.println("Mercedes with " + color + " color is created");
        } else {
            System.out.println("Mercedes with " + color + " color is already in memory");
        }

        return hashMap.get(color);
    }
}
