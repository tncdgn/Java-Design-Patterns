public abstract class Report {

    protected ReportFormat reportFormat;

    protected Report(ReportFormat reportFormat) {
        this.reportFormat = reportFormat;
    }

    abstract void create();
}
