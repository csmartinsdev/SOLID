package LSP.poscondition;

import exception.DomainException;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class App {
    public static void main(String[] args) {
        process(new S3ReportGenerator());

    }

    private static void process(ReportGenerator reportGenerator) {
        var reportPath = reportGenerator.generate();
        Path path = Paths.get(reportPath);

        if (Files.exists(path)) {
            throw new DomainException("File not found on disk");
        }

        // We have an exception thrown because the S3ReportGenerator has different behavior.
        // It returns URL of object uploaded in S3 Bucket in AWS.
        // Finally, we have problem with general abstraction


    }
}
