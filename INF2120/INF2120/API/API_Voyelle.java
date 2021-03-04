package INF2120.API;

import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * Constantes représentant les phonèmes de voyelles selon l'alphabet phonétique international.
 *
 * Chaque constante contient l'information nécessaire pour décrire le phonème.
 *
 * @since 15
 */
public enum API_Voyelle {
    API_301( 0x0069, Ouverture.FERMEES,      PointArticulationVoyelle.ANTERIEURES,        Rondeur.NON_ARRONDI ),
    API_302( 0x0065, Ouverture.MI_FERMEES,   PointArticulationVoyelle.ANTERIEURES,        Rondeur.NON_ARRONDI ),
    API_303( 0x025B, Ouverture.MI_OUVERTES,  PointArticulationVoyelle.ANTERIEURES,        Rondeur.NON_ARRONDI ),
    API_304( 0x0061, Ouverture.OUVERTES,     PointArticulationVoyelle.ANTERIEURES,        Rondeur.NON_ARRONDI ),
    API_305( 0x0251, Ouverture.OUVERTES,     PointArticulationVoyelle.POSTERIEURES,       Rondeur.NON_ARRONDI ),
    API_306( 0x0254, Ouverture.MI_OUVERTES,  PointArticulationVoyelle.POSTERIEURES,       Rondeur.ARRONDI ),
    API_307( 0x006F, Ouverture.MI_FERMEES,   PointArticulationVoyelle.POSTERIEURES,       Rondeur.ARRONDI ),
    API_308( 0x0075, Ouverture.FERMEES,      PointArticulationVoyelle.POSTERIEURES,       Rondeur.ARRONDI ),
    API_309( 0x0079, Ouverture.FERMEES,      PointArticulationVoyelle.ANTERIEURES,        Rondeur.ARRONDI ),
    API_310( 0x00F8, Ouverture.MI_FERMEES,   PointArticulationVoyelle.ANTERIEURES,        Rondeur.ARRONDI ),
    API_311( 0x0153, Ouverture.MI_OUVERTES,  PointArticulationVoyelle.ANTERIEURES,        Rondeur.ARRONDI ),
    API_312( 0x0276, Ouverture.OUVERTES,     PointArticulationVoyelle.ANTERIEURES,        Rondeur.ARRONDI ),
    API_313( 0x0252, Ouverture.MI_OUVERTES,  PointArticulationVoyelle.POSTERIEURES,       Rondeur.ARRONDI ),
    API_314( 0x028C, Ouverture.MI_OUVERTES,  PointArticulationVoyelle.POSTERIEURES,       Rondeur.NON_ARRONDI ),
    API_315( 0x0264, Ouverture.MI_FERMEES,   PointArticulationVoyelle.POSTERIEURES,       Rondeur.NON_ARRONDI ),
    API_316( 0x026F, Ouverture.FERMEES,      PointArticulationVoyelle.POSTERIEURES,       Rondeur.NON_ARRONDI ),
    API_317( 0x0268, Ouverture.FERMEES,      PointArticulationVoyelle.CENTRALES,          Rondeur.NON_ARRONDI ),
    API_318( 0x0289, Ouverture.FERMEES,      PointArticulationVoyelle.CENTRALES,          Rondeur.ARRONDI ),
    API_319( 0x026A, Ouverture.PRE_FERMEES,  PointArticulationVoyelle.QUASI_ANTERIEURES,  Rondeur.NON_ARRONDI ),
    API_320( 0x028F, Ouverture.PRE_FERMEES,  PointArticulationVoyelle.QUASI_ANTERIEURES,  Rondeur.ARRONDI ),
    API_321( 0x028A, Ouverture.PRE_FERMEES,  PointArticulationVoyelle.QUASI_POSTERIEURES, Rondeur.ARRONDI ),
    API_322( 0x0259, Ouverture.MOYENNES,     PointArticulationVoyelle.CENTRALES,          Rondeur.NON_DEFINI ),
    API_323( 0x0275, Ouverture.MI_FERMEES,   PointArticulationVoyelle.CENTRALES,          Rondeur.ARRONDI ),
    API_324( 0x0250, Ouverture.PRE_OUVERTES, PointArticulationVoyelle.CENTRALES,          Rondeur.NON_DEFINI ),
    API_325( 0x00E6, Ouverture.PRE_OUVERTES, PointArticulationVoyelle.ANTERIEURES,        Rondeur.NON_ARRONDI ),
    API_326( 0x025C, Ouverture.MI_OUVERTES,  PointArticulationVoyelle.CENTRALES,          Rondeur.NON_ARRONDI ),
    API_395( 0x025E, Ouverture.MI_OUVERTES,  PointArticulationVoyelle.CENTRALES,          Rondeur.ARRONDI ),
    API_398( 0x0258, Ouverture.MI_FERMEES,   PointArticulationVoyelle.CENTRALES,          Rondeur.NON_ARRONDI ),
    API_415( 0x00E4, Ouverture.OUVERTES,     PointArticulationVoyelle.CENTRALES,          Rondeur.NON_DEFINI ),

    ;


    /**
     * Contient toutes les constantes de la classe dans l'ordre des déclarations.
     */
    private static final API_Voyelle [] TOUS = API_Voyelle.class.getEnumConstants();


    /**
     * Contient la représentation utf de chaque symbole de l'API.
     *
     * Il est important que les symboles soient placés dans le même ordre que les contantes dans {@code TOUS}.
     */
    private static final String S_TOUS =
            Arrays.stream( TOUS )
                    .map( API_Voyelle::toString )
                    .collect( Collectors.joining() );


    /**
     * Contient un {@code Pattern} de reconnaissance pour identifier si un caractère est un symbole valide de l'API.
     */
    private static final Pattern PATRON_CHOIX_TOUS = Pattern.compile( "[" + S_TOUS + "]" );

    private int codePoint;
    private Ouverture ouverture;
    private PointArticulationVoyelle pointArticulationVoyelle;
    private Rondeur rondeur;


    /**
     * Constructeur pour les constantes.
     *
     * @param codePoint La valeur entière pour l'utf-16 du symbole.
     * @param ouverture indique la position verticale dela langue par rapport au palais (extrait de Wikipedia).
     * @param pointArticulationVoyelle L'endroit où s'effectue l'obstruction au passage d'air injecté
     *                                 (extrait de Wikipedia).
     * @param rondeur Forme des lèvres lors de la prononciation (extrait de Wikipedia).
     */
    private API_Voyelle(int codePoint,
                        Ouverture ouverture,
                        PointArticulationVoyelle pointArticulationVoyelle,
                        Rondeur rondeur ) {
        this.codePoint = codePoint;
        this.ouverture = ouverture;
        this.pointArticulationVoyelle = pointArticulationVoyelle;
        this.rondeur = rondeur;
    }


    /**
     * getter pour le codePoint.
     * @return le codePoint du phonème.
     */
    public int getCodePoint() {
        return codePoint;
    }


    /**
     * Indique si la voyelle a la caractéristique sonore 'arrière'.
     *
     * @see PointArticulationVoyelle
     * @return {@code true} si la voyelle a la caractéristique sonore 'arrière'.
     */
    public boolean estArriere() {
        return  pointArticulationVoyelle.estArriere();
    }


    /**
     * Indique si la voyelle a la caractéristique sonore 'haut'.
     *
     * @see Ouverture
     * @return {@code true} si la voyelle a la caractéristique sonore 'haut'.
     */
    public boolean estHaut() {
        return ouverture.estHaut();
    }


    /**
     * Indique si la voyelle a la caractéristique sonore 'arrondi'.
     *
     * @see Rondeur
     * @return {@code true} si la voyelle a la caractéristique sonore 'arrondi'.
     */
    public boolean estArrondi() {
        return rondeur.estArrondi();
    }


    /**
     * Indique si la voyelle a la caractéristique sonore 'ouverte'.
     *
     * @see Ouverture
     * @return {@code true} si la voyelle a la caractéristique sonore 'ouverte'.
     */
    public boolean estOuverte() {
        return ouverture.estOuverte();
    }

    /**
     * Compare la  caractéristique sonore 'arrière' de la voyelle courrante
     * avec l'attribut {@code PointArticulationVoyelle} de la voyelle comparé
     *
     * @param voyelle le {@code PointArticulationVoyelle} de la voyelle comparé
     * @return 1 si les voyelles ont la meme valeur pour cette caractéristique
     */
    private int distanceProprieteArriere(PointArticulationVoyelle voyelle) {
        int resultat = 0;

        if (this.estArriere() != voyelle.estArriere())
            resultat = resultat + 1;

        return resultat;
    }

    /**
     * Compare la  caractéristique sonore 'haut' de la voyelle courrante
     * avec l'attribut {@code Ouverture} de la voyelle comparé
     *
     * @param voyelle le {@code Ouverture} de la voyelle comparé
     * @return 1 si les voyelles ont la meme valeur pour cette caractéristique
     */
    private int distanceProprieteHaut(Ouverture voyelle) {
        int resultat = 0;

        if (this.estHaut() != voyelle.estHaut())
            resultat = resultat + 1;

        return resultat;
    }

    /**
     * Compare la  caractéristique sonore 'arrondi' de la voyelle courrante
     * avec l'attribut {@code Rondeur} de la voyelle comparé
     *
     * @param voyelle le {@code Rondeur} de la voyelle comparé
     * @return 1 si les voyelles ont la meme valeur pour cette caractéristique
     */
    private int distanceProprieteArrondi(Rondeur voyelle) {
        int resultat = 0;

        if (this.estArrondi()!= voyelle.estArrondi())
            resultat = resultat + 1;

        return resultat;
    }

    /**
     * Compare la  caractéristique sonore 'ouverte' de la voyelle courrante
     * avec l'attribut {@code Ouverture} de la voyelle comparé
     *
     * @param voyelle le {@code Ouverture} de la voyelle comparé
     * @return 1 si les voyelles ont la meme valeur pour cette caractéristique
     */
    private int distanceProprieteOuverte(Ouverture voyelle) {
        int resultat = 0;

        if (this.estOuverte() != voyelle.estOuverte())
            resultat = resultat + 1;

        return resultat;
    }

    /**
     * Compare la voyelle courante avec la voyelle donnée en argument
     *
     * @param voyelle la {@code API_Voyelle} comparée
     * @return
     */
    public int distanceVoyelle_API(API_Voyelle voyelle) {

        int resultat = 0;

        if (this.codePoint != voyelle.codePoint) {

            resultat = distanceProprieteArriere(voyelle.pointArticulationVoyelle);
            resultat = resultat + distanceProprieteArrondi(voyelle.rondeur);
            resultat = resultat + distanceProprieteHaut(voyelle.ouverture);
            resultat = resultat + distanceProprieteOuverte(voyelle.ouverture);
        }

        return resultat;
    }


    /**
     * Lit une voyelle dans le {@code Scanner}.
     *
     * Vérifie si le prochain caractère du {@code scanner} représente une voyelle.  Si oui, alors le symbole est lu et
     * la constante représentant cette voyelle est retournée.
     *
     * @param scanner le {@code Scanner} dans lequel la lecture est effectué.
     * @return la constante représenté par le symbole.
     * @exception NoSuchElementException s'il n'y a pas de {@code API_Voyelle} valide.
     * @exception IllegalStateException si le {@code Scanner} est fermé.
     */
    public static API_Voyelle lire( Scanner scanner ) {
        String suivant = scanner.next( PATRON_CHOIX_TOUS );

        return TOUS[ S_TOUS.indexOf( suivant ) ];
    }

    /**
     * Retourne une chaîne de caractère contenant le symbole de l'API représentant le phonème.
     *
     * @return la chaîne contenant le caractère utf-16 représentant le phonème.
     */
    @Override
    public String toString() {
        return Character.toString(codePoint);
    }
}
