package INF2120.API;

/**
 * Cette classe représente une syllabe dans un texte sonore ainsi que le
 * nombre de fois qu'elle apparait dans le {@code TexteSonore}
 *
 * @see SyllabeFrancais
 * @see TexteSonore
 */
public class OccurenceSyllabe {

    protected SyllabeFrancais syllabeFrancais;

    protected int occurences;

    public OccurenceSyllabe(SyllabeFrancais syllabeFrancais,int occurences) {
        this.syllabeFrancais = syllabeFrancais;
        this.occurences = occurences;
    }

    public SyllabeFrancais getSyllabeFrancais() {
        return syllabeFrancais;
    }

    public int getOccurences() {
        return occurences;
    }

    public void occurenceAzero() {
        occurences = 0;
    }

    public void incrementerOccurence(int nombre) {
        occurences = occurences + nombre;
    }

    @Override
    public String toString() {
        return "[" + this.syllabeFrancais.toString() +
                "," + this.occurences + "]";
    }
}
