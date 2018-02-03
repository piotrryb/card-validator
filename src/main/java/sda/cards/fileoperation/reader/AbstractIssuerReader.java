package sda.cards.fileoperation.reader;

import java.util.List;
import java.util.Map;

public abstract class AbstractIssuerReader  implements IIssuerReader {

    String pathToFile;

    AbstractIssuerReader(String pathToFile) {
        this.pathToFile = pathToFile;
    }

    @Override
    public abstract List<Map<String,String>> readIssuers();

}
