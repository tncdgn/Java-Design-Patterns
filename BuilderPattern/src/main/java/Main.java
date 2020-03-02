public class Main {
    public static void main(String[] args) {
        Person person = new PersonBuilder().name("Bill").age(60).build();

        System.out.println(person.getName());
        System.out.println(person.getAge());
    }
}
