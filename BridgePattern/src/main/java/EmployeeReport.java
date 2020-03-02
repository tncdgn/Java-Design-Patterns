public class EmployeeReport extends Report {

    protected EmployeeReport(ReportFormat reportFormat) {
        super(reportFormat);
    }

    void create() {
        System.out.print("Employee Report created with  ");
        reportFormat.create();
    }
}
