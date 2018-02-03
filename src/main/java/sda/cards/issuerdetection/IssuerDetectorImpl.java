package sda.cards.issuerdetection;

import sda.cards.fileoperation.IssuerReaderFactory;

import java.util.List;
import java.util.Map;

public class IssuerDetectorImpl implements IIssuerDetector {

    @Override
    public String detectIssuer(String cardNo, String pathToFile) {
        List<Map<String, String>> rules = IssuerReaderFactory.createReader(pathToFile);

        for (Map<String, String> rule : rules) {
            if (cardNo.length() == Integer.parseInt(rule.get("length"))
                    && cardNo.startsWith(rule.get("prefix"))) {
                return rule.get("name");
            }
        }
        return "There is no Issuer for this card number.";
    }
}
