package sda.cards.fileoperation.reader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TxtIssuerReader extends AbstractIssuerReader {

    private static final String COMMENT_PREFIX = "#";
    private static final String RULE_SEPARATOR = ";";

    public TxtIssuerReader(String pathToFile) {
        super(pathToFile);
    }

    /**
     * Method read Issuers from .txt file. Includes Issuer Name, prefix and card number length.
     *
     * @return ArrayList with Issuers properties
     */
    public List<Map<String, String>> readIssuers() {
        List<Map<String, String>> issuersRule = new ArrayList<>();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(pathToFile))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                if (line.startsWith(COMMENT_PREFIX)) {
                    continue;
                }
                String[] split = line.split(RULE_SEPARATOR);

                // structure: [0] = issuer name; [1] = prefix; [2] = number length
                Map<String, String> tempMap = new HashMap<>();
                tempMap.put("name", split[0]);
                tempMap.put("prefix", split[1]);
                tempMap.put("length", split[2]);
                issuersRule.add(tempMap);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return issuersRule;
    }
}
