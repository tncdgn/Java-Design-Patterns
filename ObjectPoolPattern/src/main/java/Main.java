public class Main {

    public static void main(String[] args) {

        PersonPool personPool = new PersonPool();

        Person person = personPool.checkOut();
        System.out.println(person);

        Person person1 = personPool.checkOut();
        System.out.println(person1);

        personPool.checkIn(person);

        Person person2 = personPool.checkOut();
        System.out.println(person2);
    }
}
