package INF2120.API;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.stream.Collectors;


/**
 * Une classe pour contenir une suite de syllabe.
 *
 * Cette classe permet la gestion d'une suite de syllabe.
 *
 * @see SyllabeFrancais
 */
public class TexteSonore extends ArrayList<SyllabeFrancais> {
    /**
     * Le caractère utilisé pour séparé les syllabes lors de la lecture et de l'écriture.
     */
    public static final String SEPARATEUR = ".";

    /**
     * Construit une suite de syllabe vide.
     */
    public TexteSonore() {}

    /**
     * Construit une suite de syllabes à partir du contenu d'un fichier.
     *
     * @param nomFichier Le nom du fichier qui contient la suite de syllabes.
     */
    public TexteSonore( String nomFichier ) {
        File fichier = new File( nomFichier );
        Scanner scanner = null;

        try{
            scanner = new Scanner( fichier );
        } catch( FileNotFoundException e ) {
            Erreur.FICHIER_INEXISTANT.lancer( "\"" + nomFichier +"\"" );
        }

        scanner.useDelimiter( "" );
        lire( scanner );
        scanner.close();
    }


    /**
     * Lit une suite de syllabe dans le {@code Scanner}.
     *
     * Consulte le {@code Scanner} pour lire une suite de syllabe séparé par le caractère {@code SEPARATEUR}.
     *
     * @param scanner le {@code Scanner} dans lequel la lecture est effectué.
     * @return le groupe de consonne lu.
     * @exception NoSuchElementException s'il n'y a pas de {@code API_Consonne} valide.
     * @exception IllegalStateException si le {@code Scanner} est fermé.
     */
    private void lire( Scanner scanner ) {
        try{
            while( scanner.hasNext() ) {
                add( SyllabeFrancais.lire( scanner ) );
                scanner.next( SEPARATEUR );
            }
        } catch( NoSuchElementException e ) {
        }
    }

    /**
     * Remplacer dans le texte sonore une ancienne syllabe par une nouvelle
     *
     * @param ancienne la syllabe qui va disparaitre
     * @param nouvelle la syllabe qui va prendre cq place
     */
    public void remplacer(SyllabeFrancais ancienne , SyllabeFrancais nouvelle) {
        for(int i = 0 ; i < this.size() ; i++) {
            if(this.get(i).equals(ancienne))
                this.set(i,nouvelle);
        }
    }

    /**
     * Construit une chaîne de caractères contenant la suite de syllabe représenté par les symboles de l'API.
     *
     * @return la chaîne construite.  S'il n'y a pas de syllabe dans la suite, alors la chaîne sera vide.
     */
    @Override
    public String toString() {
        return stream().map( SyllabeFrancais::toString ).collect( Collectors.joining( SEPARATEUR ) );
    }
}
