package INF2120.API;

/**
 * Cette classe contient les references vers deux syllabes ainsi que la
 * distance entre elles.
 *
 * @see SyllabeFrancais
 */
public class CoupleDeSyllabe {

    /**
     * La première syllabe du couple
     */
    protected NombreDeSyllabe syllabe1;

    /**
     * La seconde syllabe du couple
     */
    protected NombreDeSyllabe syllabe2;

    /**
     * La distance entre la syllabe1 et la syllabe2
     */
    protected int distance;

    /**
     * Construit un objet {@code CoupleDeSyllabe} avec deux syllabes
     * et calcul leurs distance qui est un attribut de la classe.
     *
     * @param syllabe1 la premiére syllabe
     * @param syllabe2 la deuxiéme syllabe
     */
    public CoupleDeSyllabe(NombreDeSyllabe syllabe1, NombreDeSyllabe syllabe2) {
        this.syllabe1 = syllabe1;
        this.syllabe2 = syllabe2;
        this.distance = calculerDistance();
    }

    /**
     * Calculer la distance entre les deux syllabes 'syllabes1' et 'syllabes2'
     *
     * @see SyllabeFrancais
     * @return la distance entre les deux syllabes.
     */
    private int calculerDistance() {
        int distance = 0;

        distance = syllabe1.getSyllabeFrancais().
                distanceSyllabeFrancais(syllabe2.getSyllabeFrancais());

        return distance;
    }

    /**
     * Retourner la syllabe {@code SyllabeFrancais} avec le plus d'occurence
     *
     * @return la {@code SyllabeFrancais} contenu dans {@code OccurenceSyllabe}
     */
    public SyllabeFrancais syllabeEnPlusGrandNombre() {
        SyllabeFrancais resultat;

        if(syllabe1.occurences >= syllabe2.occurences)
            resultat = syllabe1.syllabeFrancais;
        else
            resultat = syllabe2.syllabeFrancais;

        return resultat;
    }

    /**
     * Retourner la syllabe {@code SyllabeFrancais} avec le moin d'occurence
     *
     * @return la {@code SyllabeFrancais} contenu dans {@code OccurenceSyllabe}
     */
    public SyllabeFrancais syllabeEnPlusPetitNombre() {
        SyllabeFrancais resultat;

        if(syllabe1.occurences >= syllabe2.occurences)
            resultat = syllabe2.syllabeFrancais;
        else
            resultat = syllabe1.syllabeFrancais;

        return resultat;
    }

    /**
     * Retourner la chaine de caractére des deux OccurenceSyllabes ainsi que
     * la distance entre eux.
     *
     * @return la chaine contenant les deux syllabes ainsi que leurs distance.
     */
    @Override
    public String toString() {
        return "["+ syllabe1.toString() + "," +
                syllabe2.toString() + "," +
                distance + "]";
    }
}
