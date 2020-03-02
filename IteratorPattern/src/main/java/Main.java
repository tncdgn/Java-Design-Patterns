public class Main {

    public static void main(String[] args) {
        Person person = new Person(1, "adam");
        Person person1 = new Person(2, "jonas");
        Person person2 = new Person(3, "noah");
        Person person3 = new Person(4, "nielsen");

        PersonStorage personStorage = new PersonStorage();

        personStorage.add(person);
        personStorage.add(person1);
        personStorage.add(person2);
        personStorage.add(person3);

        Iterator<Person> personIterator = personStorage.iterator();

        while (personIterator.hasNext()) {
            Person person4 = personIterator.next();

            System.out.println(person4.getId() + " " + person4.getName());
        }
    }
}
