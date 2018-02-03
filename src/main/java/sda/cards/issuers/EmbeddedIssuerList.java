package sda.cards.issuers;

import sda.cards.fileoperation.reader.IssuerReader;

import java.util.ArrayList;
import java.util.List;

public class EmbeddedIssuerList implements IssuerReader {
    @Override
    public List<Issuer> readIssuers() {
        List<Issuer> issuers = new ArrayList<>();
        Issuer issuer1 = new Issuer("Master Card", "51", 16);
        Issuer issuer2 = new Issuer("Master Card", "52", 16);
        Issuer issuer3 = new Issuer("Master Card", "53", 16);
        Issuer issuer4 = new Issuer("Master Card", "54", 16);
        Issuer issuer5 = new Issuer("Master Card", "55", 16);
        Issuer issuer6 = new Issuer("Visa", "4", 16);
        Issuer issuer7 = new Issuer("American Express", "34", 15);
        Issuer issuer8 = new Issuer("American Express", "37", 15);
        issuers.add(issuer1);
        issuers.add(issuer2);
        issuers.add(issuer3);
        issuers.add(issuer4);
        issuers.add(issuer5);
        issuers.add(issuer6);
        issuers.add(issuer7);
        issuers.add(issuer8);
        return issuers;
    }
}
