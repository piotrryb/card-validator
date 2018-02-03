package sda.cards.fileoperation.reader;

import java.util.List;
import java.util.Map;

public interface IIssuerReader {

    List<Map<String, String>> readIssuers();
}
