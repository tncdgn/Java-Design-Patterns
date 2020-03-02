public class PersonBuilder extends BaseBuilder<Person> {

    private String name;
    private int age;

    public Person doBuild() {
        Person person = new Person();
        person.setName(name);
        person.setAge(age);
        
        return person;
    }

    public PersonBuilder name(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder age(int age) {
        this.age = age;
        return this;
    }
}
