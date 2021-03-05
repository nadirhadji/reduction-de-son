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

        /* Créer une liste contenant chaque syllabe ainsi que son nombre d'occurence
        contenu dans le texteSonore
        */
        ListeDeSyllabe listeDeSyllabe = new ListeDeSyllabe(texteSonore);

        /*
        Créer une liste de comparaison qui contiendra tout les couples de syllabes
        diffents avec la distance entre eux.
         */
        ListeCoupleSyllabe listeCoupleSyllabe = new ListeCoupleSyllabe(listeDeSyllabe);

        while(nombreDeSyllabes < listeDeSyllabe.size()) {

            //Remplacer la syllabe a supprimer dans le texte par celle qui prend ca place
            texteSonore.remplacer(listeCoupleSyllabe.get(0).syllabeEnPlusPetitNombre(),
                    listeCoupleSyllabe.get(0).syllabeEnPlusGrandNombre());

            //Supprimer la syllabe remplacée dans la liste des syllabes présente dans le texte
            listeDeSyllabe.reduire(listeCoupleSyllabe.get(0).syllabeEnPlusPetitNombre());

            //Supprimer tous les couples fesant reference a la syllabe supprimée
            listeCoupleSyllabe.reduire();
        }

        // cette partie du code affiche les résultats, modifier au besoin.
        System.out.println( texteSonore );
        System.out.println( nombreDeSyllabes );
    }
}

