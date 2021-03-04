import INF2120.API.ListePaireSyllabe;
import INF2120.API.OccurenceSonore;
import INF2120.API.SyllabeFrancais;
import INF2120.API.TexteSonore;
import org.junit.Assert;
import org.junit.Test;

public class TestOccurenceSonore {

    @Test
    public void testOccurenceUnique() {

        TexteSonore txt = new TexteSonore("test4");
        OccurenceSonore occurenceSonore = new OccurenceSonore(txt);
        System.out.println(occurenceSonore.toString());
        ListePaireSyllabe listePaireSyllabe = new ListePaireSyllabe(occurenceSonore);
        System.out.println(listePaireSyllabe.toString());
        String res = occurenceSonore.toString();
        Assert.assertEquals("ta.na.ba.ka",res);
    }

    @Test
    public void StringOut() {
        TexteSonore txt = new TexteSonore("test4");

        for (SyllabeFrancais s:txt) {
            System.out.println(s);
        }
    }
}
