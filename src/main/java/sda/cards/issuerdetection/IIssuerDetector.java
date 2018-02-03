package sda.cards.issuerdetection;

public interface IIssuerDetector {
    String detectIssuer(String cardNo, String pathToFile);
}
