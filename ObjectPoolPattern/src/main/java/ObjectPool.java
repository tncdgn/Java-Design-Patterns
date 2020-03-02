import java.util.ArrayList;
import java.util.List;

public abstract class ObjectPool<T> {

    List<T> locked = new ArrayList<T>();
    List<T> unLocked = new ArrayList<T>();

    public abstract T create();

    public synchronized T checkOut() {

        if (unLocked.isEmpty()) {
            unLocked.add(create());
        }

        T instance = unLocked.get(0);

        unLocked.remove(instance);
        locked.add(instance);

        return instance;
    }

    public synchronized void checkIn(T instance) {
        locked.remove(instance);
        unLocked.add(instance);
    }

}
