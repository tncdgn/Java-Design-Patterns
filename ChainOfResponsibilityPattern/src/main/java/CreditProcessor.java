public class CreditProcessor {

    public void processCredit(Credit credit){
        Employee treasurer = new Treasurer();
        Employee manager = new Manager();
        Employee generalManager = new GeneralManager();

        treasurer.setNextApprover(manager);
        manager.setNextApprover(generalManager);

        treasurer.process(credit);

    }
}
