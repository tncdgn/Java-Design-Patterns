public class GeneralManager implements Employee {
    private Employee nextApprover;

    public void setNextApprover(Employee nextApprover) {
        this.nextApprover = nextApprover;
    }

    public void process(Credit credit) {
        if (credit.getAmount() > 75000) {
            System.out.println("Credit is approved by General Manager");
        }
    }
}
