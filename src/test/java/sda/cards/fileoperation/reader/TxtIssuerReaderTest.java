package sda.cards.fileoperation.reader;

import org.junit.Test;
import sda.cards.fileoperation.IssuerReaderFactory;
import sda.cards.issuers.Issuer;
import java.util.List;
import static org.junit.Assert.*;

public class TxtIssuerReaderTest {

    @Test
    public void buildRules() {
        IssuerReader builder = IssuerReaderFactory.createReader("C:\\Users\\piotr\\IdeaProjects\\validator\\plik.txt");
        List<Issuer> rules = builder.readIssuers();

        assertTrue(rules.size() == 8);
    }
}
