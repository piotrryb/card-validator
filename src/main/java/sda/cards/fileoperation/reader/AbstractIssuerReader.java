package sda.cards.fileoperation.reader;

import sda.cards.issuers.Issuer;

import java.util.List;

public abstract class AbstractIssuerReader  implements IssuerReader{

    String pathToFile;

    AbstractIssuerReader(String pathToFile) {
        this.pathToFile = pathToFile;
    }

    @Override
    public abstract List<Issuer> readIssuers();

}
