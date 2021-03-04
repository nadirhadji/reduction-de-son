package INF2120.API;


/**
 * Contient et gére les erreur du logiciel
 */
public enum Erreur {
    FICHIER_INEXISTANT( -101, Textes.MSSG_ERREUR_FICHIER_INEXISTANT ),
    NOMBRE_SYLLABE( -102, Textes.MSSG_ERREUR_NOMBRE_SYLLABE ),
    ;

    /**
     * contient le message d'erreur qui sera affiché.
     */
    private String _mssg;

    /**
     * contient le code d'erreur retourné par le {@code exit}.
     */
    private int _no;


    /**
     * Construit une erreur.
     *
     * @param no le code d'erreur, devrait être négatif.
     * @param mssg le message d'erreur.  Ne doit pas être {@code null}.
     */
    private Erreur( int no, String mssg ) {
        _no = no;
        _mssg = mssg;
    }


    /**
     * affiche le message d'erreur sur la canal d'erreur.
     */
    public void afficher() {
        afficher( "" );
    }


    /**
     * affiche le message d'erreur suivit d'un message complémentaire sur le canal d'erreur.
     *
     * @param complement un message complémentaire au message d'erreur.  Ne doit pas être {@code null}.
     */
    public void afficher( String complement ) {
        System.out.println( Textes.MSSG_ERREUR + _mssg + "  " + complement );
    }


    /**
     * Affiche le message d'erreur sur le canal d'erreur et termine abruptement l'exécution de l'application en
     * retournant le code de l'erreur.
     */
    public void lancer() {
        lancer( "" );
    }


    /**
     * affiche le message d'erreur suivit d'un message complémentaire sur le canal d'erreur et termine abruptement
     * l'exécution de l'application en retournant le code de l'erreur.
     *
     * @param complement un message complémentaire au message d'erreur.  Ne doit pas être {@code null}.
     */
    public void lancer( String complement ) {
        System.err.println( Textes.MSSG_ERREUR + _mssg + "  " + complement );
        System.exit( _no );
    }
}
