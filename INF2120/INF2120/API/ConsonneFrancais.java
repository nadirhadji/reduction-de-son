package INF2120.API;

import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Scanner;


/**
 * Décrit le son d'un groupe de consonne en français.
 *
 * Cette description permet de contenir une ou deux consonnes afin de décrire le son des consonnes dans une syllabe.
 *
 * @see API_Consonne
 * @see SyllabeFrancais
 * @see <a href="https://fr.wiktionary.org/wiki/Annexe:Prononciation/fran%C3%A7ais">référence</a>
 */
public class ConsonneFrancais {
    /**
     * La consonne de base du groupe de consonne.
     * Ne doit pas être {@code null}.
     */
    protected API_Consonne consonne1;

    /**
     * La consonne secondaire du groupe de consonne.
     * La valeur {@code null} est utilisé pour indiquer qu'elle n'est pas présente dans le groupe.
     */
    protected API_Consonne consonne2 = null;


    /**
     * Construit un groupe avec une seule consonne.
     *
     * @param consonne1 La consonne du groupe.  Elle est placé comme consonne de base.  Ne doit pas être {@code null}.
     */
    public ConsonneFrancais( API_Consonne consonne1 ) {
        this.consonne1 = consonne1;
    }


    /**
     * Construit un groupe avec deux consonnes.
     *
     * @param consonne1 La consonne de base du groupe.  Ne doit pas être {@code null}.
     * @param consonne2 La consonne secondaire du groupe.
     */
    public ConsonneFrancais( API_Consonne consonne1, API_Consonne consonne2 ) {
        this.consonne1 = consonne1;
        this.consonne2 = consonne2;
    }

    /**
     * Calculer la distance entre la consonne courante et le silence
     *
     * @return la distance entre le silence et la consonne courante peut etre 6 ou 12
     * dépendement si la consonne courante contient 1 ou 2 attribut.
     */
    public int distanceSilence() {
        int resultat = 6;

        if(consonne2 != null)
            resultat = resultat + 6;

        return resultat;
    }

    /**
     * Calculer la distance entre la consonneFrancais courante et cette donnée en argument
     *
     * @param consonneFrancais la consonne qui sera comparé
     * @return la distance entre la consonneFrancais courante et celle en argument
     */
    public int distanceConsonneFrancais(ConsonneFrancais consonneFrancais ) {

        int resultat = 0;

        resultat = consonne1.distanceConsonne_API(consonneFrancais.consonne1);

        if(consonne2 != null && consonneFrancais.consonne2 != null)
            resultat = resultat + consonne2.distanceConsonne_API(consonneFrancais.consonne2);

        if(consonne2 == null ^ consonneFrancais.consonne2 == null)
            resultat = resultat + 6;

        return resultat;
    }

    /**
     * Lit un groupe de consonnes dans le {@code Scanner}.
     *
     * Vérifie si le prochain caractère du {@code scanner} représente une consonne.  Si oui, alors cette consonne
     * deviendra la consonne de base du groupe retourné.
     * Ensuite, vérifie si le prochain caractère représente une consonne.  Si oui, alors cette consonne deviendra la
     * consonne secondaire du groupe retourné.
     *
     * @param scanner le {@code Scanner} dans lequel la lecture est effectué.
     * @return le groupe de consonne lu.
     * @exception NoSuchElementException s'il n'y a pas de {@code API_Consonne} valide.
     * @exception IllegalStateException si le {@code Scanner} est fermé.
     */
    public static ConsonneFrancais lire( Scanner scanner ) {
        ConsonneFrancais resultat = null;
        API_Consonne consonne1 = API_Consonne.lire( scanner );
        API_Consonne consonne2;

        try {
            consonne2 = API_Consonne.lire( scanner );
            resultat = new ConsonneFrancais( consonne1, consonne2 );
        } catch ( NoSuchElementException e ) {
            resultat = new ConsonneFrancais( consonne1 );
        }

        return resultat;
    }

    @Override
    public boolean equals(Object o) {
        boolean resultat = false;

        if(this == o)
            resultat = true;
        if(o == null)
            resultat = false;
        if(getClass() != o.getClass())
            resultat = false;

        ConsonneFrancais consonne = (ConsonneFrancais) o;

        if( Objects.equals(this.consonne1,consonne.consonne1) &&
            Objects.equals(this.consonne2,consonne.consonne2) )
            resultat = true;

        return resultat;
    }

    /**
     * retourne une chaîne de caractère composée des consonnes du groupe.
     *
     * @return la chaîne contenant les symboles des consonnes du groupe.
     */
    @Override
    public String toString() {
        return "" + consonne1 + ( null == consonne2 ? "" : consonne2 );
    }
}
