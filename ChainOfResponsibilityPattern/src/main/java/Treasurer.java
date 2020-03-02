public class Treasurer implements Employee {
    private Employee nextEmployee;

    public void setNextApprover(Employee nextApprover) {
        this.nextEmployee = nextApprover;
    }

    public void process(Credit credit) {
        if (credit.getAmount() < 50000) {
            System.out.println("Credit is approved by Treasurer");
        } else {
            nextEmployee.process(credit);
        }
    }
}
