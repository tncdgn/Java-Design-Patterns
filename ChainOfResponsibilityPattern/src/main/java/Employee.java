public interface Employee {

    void setNextApprover(Employee nextApprover);

    void process(Credit credit);
}
