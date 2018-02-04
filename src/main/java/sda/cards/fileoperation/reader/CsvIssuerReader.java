package sda.cards.fileoperation.reader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class CsvIssuerReader extends AbstractIssuerReader {

    private static final String COMMENT_PREFIX = "#";
    private static final String RULE_SEPARATOR = ";";

    public CsvIssuerReader(String pathToFile) {
        super(pathToFile);
    }

    @Override
    public List<Map<String, String>> readIssuers() {
        List<Map<String, String>> issuersRule = new ArrayList<>();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(pathToFile))) {
            String line = bufferedReader.readLine();
            String[] splitHeader = line.split(RULE_SEPARATOR);

            while ((line = bufferedReader.readLine()) != null) {
                if (line.startsWith(COMMENT_PREFIX)) {
                    continue;
                }
                String[] split = line.split(RULE_SEPARATOR);

                Map<String, String> tempMap = new LinkedHashMap<>();
                for (int i = 0; i < split.length; i++) {
                    tempMap.put(splitHeader[i], split[i]);
                }
                issuersRule.add(tempMap);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return issuersRule;
    }
}
