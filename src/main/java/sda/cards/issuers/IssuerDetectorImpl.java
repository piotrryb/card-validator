package sda.cards.issuers;

import sda.cards.fileoperation.IssuerReaderFactory;
import sda.cards.fileoperation.reader.IssuerReader;
import java.util.List;

public class IssuerDetectorImpl implements IIssuerDetector {

    @Override
    public String detectIssuer(String cardNo) {
        IssuerReader reader = IssuerReaderFactory.createReader("C:\\Users\\piotr\\IdeaProjects\\validator\\plik.txt");
        List<Issuer> rules = reader.readIssuers();
        //TODO: List<Map<String, String>>

        for (Issuer rule : rules) {
            // check prefix and number length - if correct, return name
            if (cardNo.length() == rule.getNumberLength() && cardNo.startsWith(rule.getPrefix())) {
                return rule.getIssuerName();
            }
        }
        return "There is no issuer for this card number.";
    }
}
