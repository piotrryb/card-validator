package sda.cards.issuerdetection;

import sda.cards.fileoperation.IssuerReaderFactory;
import sda.cards.fileoperation.reader.IIssuerReader;

import java.util.List;
import java.util.Map;

public class IssuerDetectorImpl implements IIssuerDetector {

    @Override
    public String detectIssuer(String cardNo, String pathToFile) {
        IIssuerReader reader = IssuerReaderFactory.createReader(pathToFile);
        List<Map<String, String>> rules = reader.readIssuers();

        for (Map<String, String> rule : rules) {
            if (cardNo.length() == Integer.parseInt(rule.get("length"))
                    && cardNo.startsWith(rule.get("prefix"))) {
                return rule.get("name");
            }
        }
        return "There is no Issuer for this card number.";
    }
}
