package INF2120.API;

/**
 * Cette classe représente une syllabe dans un texte sonore ainsi que le
 * nombre de fois qu'elle apparait dans le {@code TexteSonore}
 *
 * @see SyllabeFrancais
 * @see TexteSonore
 */
public class NombreDeSyllabe {

    /**
     * Une syllabe dans {@code TexteSonore}
     */
    protected SyllabeFrancais syllabeFrancais;

    /**
     * Le nombre de fois que la syllabe est presente dans {@code TexteSonore}
     */
    protected int occurences;

    /**
     * Construit un object Nombre de syllabe qvec son nombre d'occurence
     *
     * @param syllabeFrancais une syllabe {@code SyllabeFrancais}
     * @param occurences le nombre d'occurence dans le syllabe sans le texte
     *                   {@code TexteSonore}
     */
    public NombreDeSyllabe(SyllabeFrancais syllabeFrancais, int occurences) {
        this.syllabeFrancais = syllabeFrancais;
        this.occurences = occurences;
    }

    /**
     * Retourner la syllabeFrancais de l'object courant
     *
     * @return l'object {@code SyllabeFrancais}
     */
    public SyllabeFrancais getSyllabeFrancais() {
        return syllabeFrancais;
    }

    /**
     * Retourner le nombres d'occurence de la syllabe courante
     *
     * @return le nombre d'occurence de la syllabe courante
     */
    public int getOccurences() {
        return occurences;
    }

    /**
     * Reinitialiser le nombre d'occurence de la syllabe courante a 0
     */
    public void occurenceAzero() {
        occurences = 0;
    }

    /**
     * Augmenter le nombre d'occurence de la syllabe courante par un nombre
     * précis.
     *
     * @param nombre le nombre d'occurence a ajouter au nombre d'occurence
     *               actuel.
     */
    public void incrementerOccurence(int nombre) {
        occurences = occurences + nombre;
    }

    /**
     * Retourner une chaine de caractére représentice de l'object NombreDeSyllabe
     *
     * @return la chaine de caractéres de l'object courant.
     */
    @Override
    public String toString() {
        return "[" + this.syllabeFrancais.toString() +
                "," + this.occurences + "]";
    }
}
