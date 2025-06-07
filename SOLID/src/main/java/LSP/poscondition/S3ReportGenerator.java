package LSP.poscondition;

public class S3ReportGenerator implements ReportGenerator {
    @Override
    public String generate() {
        var fileKey = "s3_report.txt";
        return "https://s3.amazonaws.com/mybucket/" + fileKey;
    }
}
