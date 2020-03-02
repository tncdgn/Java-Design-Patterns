public class Main {

    public static void main(String[] args) {
        Report employeeReport = new EmployeeReport(new PdfFormat());
        Report salesReport = new SalesReport(new WordFormat());

        employeeReport.create();
        salesReport.create();
    }
}
