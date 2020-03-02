import java.util.List;

public class PersonIterator implements Iterator<Person> {

    private List<Person> personList;

    private int position;

    public PersonIterator(List<Person> personList) {
        this.personList = personList;
    }

    public Person next() {
        return personList.get(position++);
    }

    public boolean hasNext() {
        return position >= personList.size() ? false : true;
    }
}
