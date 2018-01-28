package sda.cards.issuer;

public class Issuer {
    private String issuerName;
    private String prefix;
    private Integer numberLength;

    public Issuer(String issuerName, String prefix, Integer numberLength) {
        this.issuerName = issuerName;
        this.prefix = prefix;
        this.numberLength = numberLength;
    }

    public String getIssuerName() {
        return issuerName;
    }

    public String getPrefix() {
        return prefix;
    }

    public int getNumberLength() {
        return numberLength;
    }
}
