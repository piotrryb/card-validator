package sda.cards.issuer;

import sda.cards.fileoperation.IssuerReaderFactory;
import sda.cards.fileoperation.reader.IssuerReader;
import sda.cards.issuer.IIssuerDetector;
import sda.cards.issuer.Issuer;

import java.util.List;

public class IssuerDetectorImpl implements IIssuerDetector {

    @Override
    public String detectIssuer(String cardNo) {
        IssuerReader reader = IssuerReaderFactory.createReader("C:\\Users\\piotr\\IdeaProjects\\validator\\plik.txt");
        List<Issuer> rules = reader.readIssuers();

        for (Issuer rule : rules) {
            // sprawdzić czy prefix i długość się zgadzają - jeśli tak to zwracamy name
            if (cardNo.length() == rule.getNumberLength()) {
                if (cardNo.startsWith(rule.getPrefix())) {
                    return rule.getIssuerName();
                }
            }
        }
        return "Brak wystawcy, niepoprawny numer karty";
    }
}
