package sda.cards.fileoperation.reader;

import org.junit.Test;
import sda.cards.fileoperation.IssuerReaderFactory;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class TxtIssuerReaderTest {

    @Test
    public void buildRules() {
        IIssuerReader builder = IssuerReaderFactory.createReader("C:\\Users\\piotr\\IdeaProjects\\validator\\file.txt");
        List<Map<String, String>> rules = builder.readIssuers();

        assertTrue(rules.size() == 8);
    }
}
