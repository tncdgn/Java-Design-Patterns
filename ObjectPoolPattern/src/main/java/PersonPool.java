public class PersonPool extends ObjectPool<Person> {
    public Person create() {
        return new Person();
    }
}
