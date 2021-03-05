package INF2120.API;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

/**
 * Cette classe contient tout les couples de syllabes {@code CoupleDeSyllabe}
 * pouvant etre formée a partir d'une liste de syllabe {@code ListeDeSyllabe}.
 * Cette liste est ordonnée du couple ayant la plus petite distance a la plus
 * grande.
 */
public class ListeCoupleSyllabe extends ArrayList<CoupleDeSyllabe> {

    ListeDeSyllabe listeDeSyllabe;

    /**
     * Construire a partir d'une liste de syllabe {@code ListeDeSyllabe}
     * contenant une occurence de chaque syllabe dans le texte sonore
     * une liste d'object {@code CoupleDeSyllabe} triée de la distance la plus
     * petite a la plus grande. Cette liste comporte tout les couples différent
     * pouvant etre crée grace a la listeDeSyllabe.
     *
     * @param listeDeSyllabe une liste contenant une occurence de chaque syllabe
     *                       différente dans le texte sonore ainsi que la distance
     *                       eux.
     */
    public ListeCoupleSyllabe(ListeDeSyllabe listeDeSyllabe) {

        this.listeDeSyllabe = listeDeSyllabe;

        int taille = listeDeSyllabe.size();

        for (int i = 0 ; i < taille ; i++) {
            for(int j = i + 1 ; j < taille ; j++ )
                add(new CoupleDeSyllabe(listeDeSyllabe.get(i), listeDeSyllabe.get(j)));
        }

        Collections.sort(this,new TrierParDistance());
    }

    /**
     * Remplacer le son le moins frequent et ayant la plus petite distance par le son
     * ayant la plus petite distance. On suppose la liste triée de la paire de syllabes
     * ayant la plus petite distance a la plus grande.
     */
    public void reduire() {

        NombreDeSyllabe premiereSyllabe1 = this.get(0).syllabe1;
        NombreDeSyllabe premiereSyllabe2 = this.get(0).syllabe2;

        if (premiereSyllabe1.occurences >= premiereSyllabe2.occurences ) {
            premiereSyllabe1.incrementerOccurence(premiereSyllabe2.occurences);
            premiereSyllabe2.occurenceAzero();
        }
        else {
            premiereSyllabe2.incrementerOccurence(premiereSyllabe1.occurences);
            premiereSyllabe1.occurenceAzero();
        }

        SyllabeFrancais syllabeAsupprimer = this.get(0).syllabeEnPlusPetitNombre();

        supprimerSyllabe(syllabeAsupprimer);
    }

    /**
     * Supprimer de la listePaireSyllabe tout couple fesant reference a l'argument
     *
     * @param syllabeFrancais la syllabe a supprimer de la liste courrante.
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
        return stream().map(CoupleDeSyllabe::toString ).collect( Collectors.joining(".") );
    }
}
