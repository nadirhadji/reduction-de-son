package INF2120.API;


/**
 * Les constantes de type {@code String} utilisé par l'application pour les communications avec le client.
 */
public class Textes {
    public static final String MSSG_DEMANDE_NOMFICHIER = "Entrez le nom du fichier contenant le texte de depart : ";
    public static final String MSSG_DEMANDE_NOMBRE_SYLLABE = "Entrez le nombre de syllabes a obtenir : ";

    public static final String MSSG_ERREUR = "Erreur : ";
    public static final String MSSG_ERREUR_FICHIER_INEXISTANT = "le fichier n'existe pas.";
    public static final String MSSG_ERREUR_NOMBRE_SYLLABE = "le nombre de syllabe minimal devrait plus grand que "
            + Constantes.MIN_NOMBRE_SYLLABE + ".";
}
