package INF2120.API;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

/**
 *TODO
 */
public class ListePaireSyllabe extends ArrayList<PaireSyllabe> {

    OccurenceSonore occurenceSonore;

    public ListePaireSyllabe(OccurenceSonore occurenceSonore) {

        this.occurenceSonore = occurenceSonore;

        int taille = occurenceSonore.size();

        for (int i = 0 ; i < taille ; i++) {
            for(int j = i + 1 ; j < taille ; j++ )
                add(new PaireSyllabe(occurenceSonore.get(i),occurenceSonore.get(j)));
        }

        Collections.sort(this,new TrierParDistance());
    }

    /**
     * Remplacer le son le moins frequent et ayant la plus petite distance par le son
     * ayant la plus petite distance. On suppose la liste triée de la paire de syllabes
     * ayant la plus petite distance a la plus grande.
     */
    public void reduire() {

        int occurencesSyllabe1 = this.get(0).syllabe1.occurences;
        int occurencesSyllabe2 = this.get(0).syllabe2.occurences;

        if (occurencesSyllabe1 >= occurencesSyllabe2) {
            this.get(0).syllabe1.incrementerOccurence(occurencesSyllabe2);
            this.get(0).syllabe2.occurenceAzero();
        }
        else {
            this.get(0).syllabe2.incrementerOccurence(occurencesSyllabe1);
            this.get(0).syllabe1.occurenceAzero();
        }

        SyllabeFrancais syllabeAsupprimer = this.get(0).syllabeEnPlusPetitNombre();

        supprimerSyllabe(syllabeAsupprimer);
    }

    /**
     * Supprimer de la listePaireSyllabe tout couple fesant reference a l'argument
     *
     * @param syllabeFrancais
     */
    private void supprimerSyllabe(SyllabeFrancais syllabeFrancais) {

        for (int i = 0 ; i < this.size() ; i++) {

            if ( this.get(i).syllabe1.syllabeFrancais.equals(syllabeFrancais) ||
                 this.get(i).syllabe2.syllabeFrancais.equals(syllabeFrancais) ) {

                this.remove(i);
            }
        }
    }

    /**
     * Construire une chaîne de caractères contenant la suite des paires de syllabe représenté
     * dans la liste OccurenceSonore
     *
     * @return la chaîne construite.
     */
    @Override
    public String toString() {
        return stream().map(PaireSyllabe::toString ).collect( Collectors.joining(".") );
    }
}
