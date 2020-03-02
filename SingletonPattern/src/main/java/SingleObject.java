import java.util.Objects;

public class SingleObject {

    private static SingleObject singleObject;

    private SingleObject() {

    }

    public static SingleObject getInstance() {
        if (Objects.isNull(singleObject)) {
            singleObject = new SingleObject();
        }
        return singleObject;
    }

    public void showMessage() {
        System.out.println("Object created");
    }
}
