package INF2120.API;

import java.util.Scanner;

/**
 * Écrivez vos nom ici :
 *
 * @nom Hadji Nadir
 * @code_permanent HADN08069703
 *
 * @nom Cissé Saliou
 * @code_permanent CISS20129907
 */

public class Principal {
    /**
     * Demande le nom du fichier dans lequel la suite de syllabe sera lu.
     *
     * @param scanner Indique l'endroit où le nom du fichier sera lu.
     * @return une chaîne de caractères contenant le nom du fichier.
     */
    public static String demanderNomFichier( Scanner scanner ) {
        String resultat = "";

        System.out.print( Textes.MSSG_DEMANDE_NOMFICHIER );
        resultat = scanner.nextLine();

        return resultat;
    }

    /**
     * Demande le nombre de syllabe cible que le logiciel doit utiliser pour faire la réduction.
     *
     * Cette valeur doit être plus grande ou égal à {@code Constantes.MIN_NOMBRE_SYLLABE}.
     *
     * @see Constantes
     * @param scanner  Indique l'endroit où la valeur sera lu.
     * @return l'entier lu dans le {@code Scanner}.
     */
    public static int demanderNombreDeSyllabe( Scanner scanner ) {
        int resultat = 0;

        System.out.print( Textes.MSSG_DEMANDE_NOMBRE_SYLLABE );
        resultat = scanner.nextInt();

        if( resultat < Constantes.MIN_NOMBRE_SYLLABE ) {
            Erreur.NOMBRE_SYLLABE.lancer( "  Valeur entrée : " + resultat );
        }

        return resultat;
    }

    /**
     * Programme principal de l'application
     *
     * @param args Les paramètres externe de l'application.
     */
    public static void main( String [] args ) {
        // cette partie du code lie les entrées.
        Scanner scanner = new Scanner( System.in );
        String nomFichier = demanderNomFichier( scanner );
        int nombreDeSyllabes = demanderNombreDeSyllabe( scanner );

        scanner.close();

        TexteSonore texteSonore = new TexteSonore( nomFichier );

        OccurenceSonore occurenceSonore = new OccurenceSonore(texteSonore);

        ListePaireSyllabe listePaireSyllabe = new ListePaireSyllabe(occurenceSonore);

        System.out.println(texteSonore.toString());
        System.out.println(occurenceSonore.toString());
        System.out.println(listePaireSyllabe.toString());
        System.out.println("---------------------------");

        while(nombreDeSyllabes < occurenceSonore.size()) {

            texteSonore.remplacer(listePaireSyllabe.get(0).syllabeEnPlusPetitNombre(),
                    listePaireSyllabe.get(0).syllabeEnPlusGrandNombre());

            occurenceSonore.reduire(listePaireSyllabe.get(0).syllabeEnPlusPetitNombre());

            listePaireSyllabe.reduire();

            System.out.println(texteSonore.toString());
            System.out.println(occurenceSonore.toString());
            System.out.println(listePaireSyllabe.toString());
            System.out.println("---------------------------");

        }

        // cette partie du code affiche les résultats, modifier au besoin.
        System.out.println( texteSonore );
        System.out.println( nombreDeSyllabes );
    }
}

