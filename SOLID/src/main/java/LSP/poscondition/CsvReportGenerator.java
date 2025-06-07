package LSP.poscondition;

public class CsvReportGenerator implements ReportGenerator {
    @Override
    public String generate() {
        // generate csv report and return filepath
        return "/reports/report_.csv";
    }
}
