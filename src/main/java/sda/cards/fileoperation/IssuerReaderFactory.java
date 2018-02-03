package sda.cards.fileoperation;

import sda.cards.fileoperation.reader.TxtIssuerReader;
import sda.cards.fileoperation.reader.*;

public class IssuerReaderFactory {
    public static IIssuerReader createReader(String path) {
        IIssuerReader issuerReader;
        if (path != null && !path.isEmpty() && path.endsWith(".txt")) {
            issuerReader = new TxtIssuerReader(path);
        } else {
            issuerReader = new EmbeddedIssuerList();
        }
        return issuerReader;
    }
}
