public interface Storage<T> {
    Iterator<T> iterator();

    void add(Person person);

    void remove(Person person);
}
