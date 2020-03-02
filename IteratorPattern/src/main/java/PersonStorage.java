import java.util.ArrayList;
import java.util.List;

public class PersonStorage implements Storage<Person> {

    private List<Person> personList;

    public PersonStorage() {
        this.personList = new ArrayList<Person>();
    }

    public Iterator<Person> iterator() {
        return new PersonIterator(personList);
    }

    public void add(Person person) {
        personList.add(person);
    }

    public void remove(Person person) {
        personList.remove(person);
    }

    public List<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(List<Person> personList) {
        this.personList = personList;
    }
}
