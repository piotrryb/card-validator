package sda.cards.fileoperation;

import sda.cards.fileoperation.reader.TxtIssuerReader;
import sda.cards.fileoperation.reader.*;
public class IssuerReaderFactory {
    public static IssuerReader createReader(String path) {
        if (path.endsWith(".txt")) {
            return new TxtIssuerReader(path);
        }
        return null;
    }
}
