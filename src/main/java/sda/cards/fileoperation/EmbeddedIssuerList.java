package sda.cards.fileoperation;

import sda.cards.fileoperation.reader.IIssuerReader;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmbeddedIssuerList implements IIssuerReader {
    @Override
    public List<Map<String,String>> readIssuers() {
        List<Map<String,String>> issuersRule = new ArrayList<>();

        issuersRule.add(createRule("Master Card","51","16"));
        issuersRule.add(createRule("Master Card","52","16"));
        issuersRule.add(createRule("Master Card","53","16"));
        issuersRule.add(createRule("Master Card","54","16"));
        issuersRule.add(createRule("Master Card","55","16"));
        issuersRule.add(createRule("Visa","4","16"));
        issuersRule.add(createRule("American Express","34","15"));
        issuersRule.add(createRule("American Express","37","15"));

        return issuersRule;
    }

    private Map<String,String> createRule(String name, String prefix, String numberLength) {
        Map<String, String> tempMap = new HashMap<>();
        tempMap.put("name", name);
        tempMap.put("prefix", prefix);
        tempMap.put("length", numberLength);
        return tempMap;
    }
}
