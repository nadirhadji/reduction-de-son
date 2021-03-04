import INF2120.API.API_Consonne;
import org.junit.Assert;
import org.junit.Test;

public class TesteAPIConsonne {

    @Test
    public void distance0() {

        int resultat = 0;
        API_Consonne consonne1 = API_Consonne.API_101;
        resultat = consonne1.distanceConsonne_API(consonne1);
        Assert.assertEquals(0,resultat);
    }

    @Test
    public void distance1() {

        int resultat = 0;
        API_Consonne consonne1 = API_Consonne.API_101;
        API_Consonne consonne2 = API_Consonne.API_102;
        resultat = consonne1.distanceConsonne_API(consonne2);
        Assert.assertEquals(1,resultat);
    }

    @Test
    public void distance2() {

        int resultat = 0;
        API_Consonne consonne1 = API_Consonne.API_102;
        API_Consonne consonne2 = API_Consonne.API_103;
        resultat = consonne1.distanceConsonne_API(consonne2);
        Assert.assertEquals(2,resultat);
    }

}
