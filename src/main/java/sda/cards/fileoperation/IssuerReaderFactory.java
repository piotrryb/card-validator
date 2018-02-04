package sda.cards.fileoperation;

import sda.cards.fileoperation.reader.CsvIssuerReader;
import sda.cards.fileoperation.reader.EmbeddedIssuerReader;
import sda.cards.fileoperation.reader.IIssuerReader;
import sda.cards.fileoperation.reader.TxtIssuerReader;

import java.util.List;
import java.util.Map;

public class IssuerReaderFactory {
    public static List<Map<String,String>> createReader(String path) {
        IIssuerReader issuerReader;
        if (path != null && !path.isEmpty() && path.endsWith(".txt")) {
            issuerReader = new TxtIssuerReader(path);
        } else if (path != null && !path.isEmpty() && path.endsWith(".csv")) {
            issuerReader = new CsvIssuerReader(path);
        } else {
            issuerReader = new EmbeddedIssuerReader();
        }
        return issuerReader.readIssuers();
    }
}
