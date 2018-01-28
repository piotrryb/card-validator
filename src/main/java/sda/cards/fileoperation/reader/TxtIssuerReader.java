package sda.cards.fileoperation.reader;

import sda.cards.issuer.Issuer;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TxtIssuerReader extends AbstractIssuerReader {

    public TxtIssuerReader(String pathToFile) {
       super(pathToFile);
    }

    public List<Issuer> readIssuers() {
        List<Issuer> issuers = new ArrayList<>();

        // Try with resources
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(pathToFile))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                // split by ";"
                String[] split = line.split(";");

                // structure: [0] = issuerName; [1] = prefix; [2] = numberLength
                Issuer issuer = new Issuer(split[0],(split[1]), (Integer.parseInt(split[2])));
                issuers.add(issuer);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return issuers;
    }
}
