public class SalesReport extends Report {

    protected SalesReport(ReportFormat reportFormat) {
        super(reportFormat);
    }

    void create() {
        System.out.print("Sales Report created with  ");
        reportFormat.create();
    }
}
