package sda.cards.issuers;

public class Issuer {
    private String issuerName;
    private String prefix;
    private Integer numberLength;

    public Issuer(String issuerName, String prefix, Integer numberLength) {
        this.issuerName = issuerName;
        this.prefix = prefix;
        this.numberLength = numberLength;
    }

    String getIssuerName() {
        return issuerName;
    }

    String getPrefix() {
        return prefix;
    }

    int getNumberLength() {
        return numberLength;
    }
}
