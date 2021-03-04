import INF2120.API.SyllabeFrancais;
import INF2120.API.TexteSonore;
import org.junit.Assert;
import org.junit.Test;

import java.sql.SQLOutput;
import java.util.Scanner;

public class TesteDistanceSyllabe {

    Scanner scanner = new Scanner(System.in);

    @Test
    public void distance1() {

        int resultat = 0;
        TexteSonore text = new TexteSonore("test1");

        SyllabeFrancais s1 = text.get(0);
        System.out.println("Valeur 1 : "+s1.toString());

        SyllabeFrancais s2 = text.get(1);
        System.out.println("\nValeur 2 : "+s2.toString());

        resultat = s1.distanceSyllabeFrancais(s2);

        Assert.assertEquals(10,resultat);
    }

    @Test
    public void distance2() {

        int resultat = 0;
        TexteSonore text = new TexteSonore("test2");

        SyllabeFrancais s1 = text.get(0);
        System.out.println("Valeur 1 : "+s1.toString());

        SyllabeFrancais s2 = text.get(1);
        System.out.println("\nValeur 2 : "+s2.toString());

        resultat = s1.distanceSyllabeFrancais(s2);

        Assert.assertEquals(12,resultat);
    }

    @Test
    public void testeEqualsString() {

        boolean egal;
        TexteSonore txt = new TexteSonore("tes3");

        SyllabeFrancais s1 = txt.get(0);
        SyllabeFrancais s2 = txt.get(1);
        egal = s1.toString().equals(s2.toString());

        System.out.println(s1);
        System.out.println(s2);

        Assert.assertTrue(egal);

    }
}
