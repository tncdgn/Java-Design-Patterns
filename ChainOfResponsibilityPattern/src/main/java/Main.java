public class Main {

    public static void main(String[] args) {
        Credit credit = new Credit("Adam", 20000);
        Credit credit1 = new Credit("Jonas", 60000);
        Credit credit2 = new Credit("Neilsen", 1000000);

        CreditProcessor creditProcessor=new CreditProcessor();

        creditProcessor.processCredit(credit);
        creditProcessor.processCredit(credit1);
        creditProcessor.processCredit(credit2);
    }
}
