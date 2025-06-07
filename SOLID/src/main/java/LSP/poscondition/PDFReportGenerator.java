package LSP.poscondition;

public class PDFReportGenerator implements ReportGenerator {
    @Override
    public String generate() {
        // generate pdf report and return filepath
        return "/reports/report_.pdf";
    }
}
