package INF2120.API;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

/**
 * Une classe pour contenir toute les {@code NombreDeSyllabe} : soit une copie
 * de chaque syllable differente dans un {@code TexteSonore} ainsi que le
 * nombre d'occurence dans celui-ci.
 *
 * @see ListeDeSyllabe
 * @see TexteSonore
 */
public class ListeDeSyllabe extends ArrayList<NombreDeSyllabe> {

    protected TexteSonore texteSonore;

    public ListeDeSyllabe(TexteSonore texteSonore) {
        this.texteSonore = texteSonore;
        this.initialiser();
    }

    /**
     *Crée un tableau de {@code SyllabeFrancais} avec une occurence de chaque element
     * du texte Sonore.
     */
    private ArrayList<SyllabeFrancais> getUniqueSyllabeList() {

        ArrayList<SyllabeFrancais> listSyllabe = new ArrayList<>();

        for (SyllabeFrancais syllabe : texteSonore ) {
            if(! (listSyllabe.contains(syllabe) ) )
                listSyllabe.add(syllabe);
        }

        return listSyllabe;
    }

    /**
     * Initialiser la liste de la classe courante avec une {@code NombreDeSyllabe}
     */
    private void initialiser() {

        ArrayList<SyllabeFrancais> listSyllabe = getUniqueSyllabeList();
        int nbOccurence;

        for (SyllabeFrancais syllabe : listSyllabe) {
            nbOccurence = Collections.frequency(texteSonore,syllabe);
            add(new NombreDeSyllabe(syllabe,nbOccurence));
        }
    }

    /**
     * Enlever une syllabe de la liste
     *
     * @param syllabeFrancais la syllabe a enlever de la liste courante
     */
    public void reduire(SyllabeFrancais syllabeFrancais) {
        for(int i = 0 ; i < this.size() ; i++) {
            if(this.get(i).syllabeFrancais.equals(syllabeFrancais))
                this.remove(i);
        }
    }

    /**
     * Retourner une chaine de caractére représentant tout les objects de la liste
     * courante.
     *
     * @return Une chaine de caractére descriptibe de la liste courante.
     */
    @Override
    public String toString() {
        return stream().map(NombreDeSyllabe::toString).collect(Collectors.joining("."));
    }
}
