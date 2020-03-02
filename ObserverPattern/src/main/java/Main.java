public class Main {

    public static void main(String[] args) {
        Observer customer = new Customer("Adam");
        Observer customer1 = new Customer("Jonas");
        Observer customer2 = new Customer("Neilsen");
        Observer customer3 = new Customer("Martha");

        Observable sms = new SmsObservable();
        sms.addObserver(customer);
        sms.addObserver(customer1);
        sms.addObserver(customer2);
        sms.addObserver(customer3);

        Product product = new Product();
        product.setSmsObservable(sms);

        product.setPrice(12);
    }
}
