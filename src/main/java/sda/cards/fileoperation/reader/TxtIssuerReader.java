package sda.cards.fileoperation.reader;

import sda.cards.issuers.Issuer;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TxtIssuerReader extends AbstractIssuerReader {

    private static final String COMMENT_PREFIX = "#";
    private static final String RULE_SEPARATOR = ";";

    public TxtIssuerReader(String pathToFile) {
        super(pathToFile);
    }

    /**
     * Method read Issuers from .txt file. Includes Issuer Name, prefix and card number length.
     *
     * @return ArrayList
     */
    public List<Issuer> readIssuers() {
        List<Issuer> issuers = new ArrayList<>();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(pathToFile))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                if (line.startsWith(COMMENT_PREFIX)) {
                    continue;
                }
                String[] split = line.split(RULE_SEPARATOR);

                // structure: [0] = issuerName; [1] = prefix; [2] = numberLength
                Issuer issuer = new Issuer(split[0], (split[1]), (Integer.parseInt(split[2])));
                issuers.add(issuer);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return issuers;
    }
}
