package sda.cards.fileoperation.reader;

import sda.cards.issuer.Issuer;

import java.util.List;

public abstract class AbstractIssuerReader  implements IssuerReader{

    protected String pathToFile;

    protected AbstractIssuerReader(String pathToFile) {
        this.pathToFile = pathToFile;
    }

    @Override
    public abstract List<Issuer> readIssuers();

}
