package sda.cards.fileoperation;

import sda.cards.fileoperation.reader.TxtIssuerReader;
import sda.cards.fileoperation.reader.*;
import sda.cards.issuers.EmbeddedIssuerList;

public class IssuerReaderFactory {
    public static IssuerReader createReader(String path) {
        if (path.endsWith(".txt")) {
            return new TxtIssuerReader(path);
        } else {
            return new EmbeddedIssuerList();
        }
    }
}
