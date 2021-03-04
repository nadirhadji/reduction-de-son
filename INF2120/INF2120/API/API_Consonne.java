package INF2120.API;

import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * Constantes représentant les phonèmes de consonnes selon l'alphabet phonétique international.
 *
 * Chaque constante contient l'information nécessaire pour décrire le phonème.
 *
 * @since 15
 */
public enum API_Consonne {
    API_101( 0x0070, ModeArticulation.OCCLUSIF, PointArticulationConsonne.BILABIAL, Phonation.SOURDE,
            Cavite.ORALE, Ecoulement.CENTRALE, Flux.PULMONAIRE ),
    API_102( 0x0062, ModeArticulation.OCCLUSIF, PointArticulationConsonne.BILABIAL, Phonation.VOISEE,
            Cavite.ORALE, Ecoulement.CENTRALE, Flux.PULMONAIRE ),
    API_103( 0x0074, ModeArticulation.OCCLUSIF, PointArticulationConsonne.ALVEOLAIRE, Phonation.SOURDE,
            Cavite.ORALE, Ecoulement.CENTRALE, Flux.PULMONAIRE ),
    API_104( 0x0064, ModeArticulation.OCCLUSIF, PointArticulationConsonne.ALVEOLAIRE, Phonation.VOISEE,
            Cavite.ORALE, Ecoulement.CENTRALE, Flux.PULMONAIRE ),
    API_105( 0x0288, ModeArticulation.OCCLUSIF, PointArticulationConsonne.RETROFLEXE, Phonation.SOURDE,
            Cavite.ORALE, Ecoulement.CENTRALE, Flux.PULMONAIRE ),
    API_106( 0x0256, ModeArticulation.OCCLUSIF, PointArticulationConsonne.RETROFLEXE, Phonation.VOISEE,
            Cavite.ORALE, Ecoulement.CENTRALE, Flux.PULMONAIRE ),
    API_107( 0x0063, ModeArticulation.OCCLUSIF, PointArticulationConsonne.PALATAL, Phonation.SOURDE,
            Cavite.ORALE, Ecoulement.CENTRALE, Flux.PULMONAIRE ),
    API_108( 0x025F, ModeArticulation.OCCLUSIF, PointArticulationConsonne.PALATAL, Phonation.VOISEE,
            Cavite.ORALE, Ecoulement.CENTRALE, Flux.PULMONAIRE ),
    API_109( 0x006B, ModeArticulation.OCCLUSIF, PointArticulationConsonne.VELAIRE, Phonation.SOURDE,
            Cavite.ORALE, Ecoulement.CENTRALE, Flux.PULMONAIRE ),
    API_110( 0x0261, ModeArticulation.OCCLUSIF, PointArticulationConsonne.VELAIRE, Phonation.VOISEE,
            Cavite.ORALE, Ecoulement.CENTRALE, Flux.PULMONAIRE ),
    API_111( 0x0071, ModeArticulation.OCCLUSIF, PointArticulationConsonne.UVULAIRE, Phonation.SOURDE,
            Cavite.ORALE, Ecoulement.CENTRALE, Flux.PULMONAIRE ),
    API_112( 0x0262, ModeArticulation.OCCLUSIF, PointArticulationConsonne.UVULAIRE, Phonation.VOISEE,
            Cavite.ORALE, Ecoulement.CENTRALE, Flux.PULMONAIRE ),
    API_113( 0x0294, ModeArticulation.OCCLUSIF, PointArticulationConsonne.GLOTTALE, Phonation.SOURDE,
            Cavite.ND, Ecoulement.NA, Flux.ND ),
    API_114( 0x006D, ModeArticulation.OCCLUSIF, PointArticulationConsonne.BILABIAL, Phonation.VOISEE,
             Cavite.NASALE, Ecoulement.CENTRALE, Flux.PULMONAIRE ),
    API_115( 0x0271, ModeArticulation.OCCLUSIF, PointArticulationConsonne.LABIO_DENTAL, Phonation.VOISEE,
            Cavite.NASALE, Ecoulement.CENTRALE, Flux.PULMONAIRE ),
    API_116( 0x006E, ModeArticulation.OCCLUSIF, PointArticulationConsonne.ALVEOLAIRE, Phonation.VOISEE,
             Cavite.NASALE, Ecoulement.CENTRALE, Flux.PULMONAIRE ),
    API_117( 0x0273, ModeArticulation.OCCLUSIF, PointArticulationConsonne.RETROFLEXE, Phonation.VOISEE,
            Cavite.NASALE, Ecoulement.CENTRALE, Flux.PULMONAIRE ),
    API_118( 0x0272, ModeArticulation.OCCLUSIF, PointArticulationConsonne.PALATAL, Phonation.VOISEE,
            Cavite.NASALE, Ecoulement.CENTRALE, Flux.PULMONAIRE ),
    API_119( 0x014B, ModeArticulation.OCCLUSIF, PointArticulationConsonne.VELAIRE, Phonation.VOISEE,
            Cavite.NASALE, Ecoulement.CENTRALE, Flux.PULMONAIRE ),
    API_120( 0x0274, ModeArticulation.OCCLUSIF, PointArticulationConsonne.UVULAIRE, Phonation.VOISEE,
            Cavite.NASALE, Ecoulement.CENTRALE, Flux.PULMONAIRE ),
    API_121( 0x0299, ModeArticulation.ROULEE, PointArticulationConsonne.BILABIAL, Phonation.VOISEE,
            Cavite.ORALE, Ecoulement.CENTRALE, Flux.PULMONAIRE ),
    API_122( 0x0072, ModeArticulation.ROULEE, PointArticulationConsonne.ALVEOLAIRE, Phonation.VOISEE,
            Cavite.ORALE, Ecoulement.CENTRALE, Flux.PULMONAIRE ),
    API_123( 0x0280, ModeArticulation.ROULEE, PointArticulationConsonne.UVULAIRE, Phonation.VOISEE,
            Cavite.ORALE, Ecoulement.CENTRALE, Flux.PULMONAIRE ),
    API_124( 0x027E, ModeArticulation.BATTU, PointArticulationConsonne.ALVEOLAIRE, Phonation.VOISEE,
            Cavite.ORALE, Ecoulement.CENTRALE, Flux.PULMONAIRE ),
    API_125( 0x027D, ModeArticulation.BATTU, PointArticulationConsonne.RETROFLEXE, Phonation.VOISEE,
            Cavite.ORALE, Ecoulement.CENTRALE, Flux.PULMONAIRE ),
    API_126( 0x0278, ModeArticulation.FRICATIF, PointArticulationConsonne.BILABIAL, Phonation.SOURDE,
            Cavite.ORALE, Ecoulement.CENTRALE, Flux.PULMONAIRE ),
    API_127( 0x03B2, ModeArticulation.FRICATIF, PointArticulationConsonne.BILABIAL, Phonation.VOISEE,
            Cavite.ORALE, Ecoulement.CENTRALE, Flux.PULMONAIRE ),
    API_128( 0x0066, ModeArticulation.FRICATIF, PointArticulationConsonne.LABIO_DENTAL, Phonation.SOURDE,
            Cavite.ORALE, Ecoulement.CENTRALE, Flux.PULMONAIRE ),
    API_129( 0x0076, ModeArticulation.FRICATIF, PointArticulationConsonne.LABIO_DENTAL, Phonation.VOISEE,
            Cavite.ORALE, Ecoulement.CENTRALE, Flux.PULMONAIRE ),
    API_130( 0x03B8, ModeArticulation.FRICATIF, PointArticulationConsonne.DENTALE, Phonation.SOURDE,
            Cavite.ORALE, Ecoulement.CENTRALE, Flux.PULMONAIRE ),
    API_131( 0x00F0, ModeArticulation.FRICATIF, PointArticulationConsonne.DENTALE, Phonation.VOISEE,
            Cavite.ORALE, Ecoulement.CENTRALE, Flux.PULMONAIRE ),
    API_132( 0x0073, ModeArticulation.FRICATIF, PointArticulationConsonne.ALVEOLAIRE, Phonation.SOURDE,
            Cavite.ORALE, Ecoulement.CENTRALE, Flux.PULMONAIRE ),
    API_133( 0x007A, ModeArticulation.FRICATIF, PointArticulationConsonne.ALVEOLAIRE, Phonation.VOISEE,
            Cavite.ORALE, Ecoulement.CENTRALE, Flux.PULMONAIRE ),
    API_134( 0x0283, ModeArticulation.FRICATIF, PointArticulationConsonne.PALATO_ALVEOLAIRE, Phonation.SOURDE,
            Cavite.ORALE, Ecoulement.CENTRALE, Flux.PULMONAIRE ),
    API_135( 0x0292, ModeArticulation.FRICATIF, PointArticulationConsonne.PALATO_ALVEOLAIRE, Phonation.VOISEE,
            Cavite.ORALE, Ecoulement.CENTRALE, Flux.PULMONAIRE ),
    API_136( 0x0282, ModeArticulation.FRICATIF, PointArticulationConsonne.RETROFLEXE, Phonation.SOURDE,
            Cavite.ORALE, Ecoulement.CENTRALE, Flux.PULMONAIRE ),
    API_137( 0x0290, ModeArticulation.FRICATIF, PointArticulationConsonne.RETROFLEXE, Phonation.VOISEE,
            Cavite.ORALE, Ecoulement.CENTRALE, Flux.PULMONAIRE ),
    API_138( 0x00E7, ModeArticulation.FRICATIF, PointArticulationConsonne.PALATAL, Phonation.SOURDE,
            Cavite.ORALE, Ecoulement.CENTRALE, Flux.PULMONAIRE ),
    API_139( 0x029D, ModeArticulation.FRICATIF, PointArticulationConsonne.PALATAL, Phonation.VOISEE,
            Cavite.ORALE, Ecoulement.CENTRALE, Flux.PULMONAIRE ),
    API_140( 0x0078, ModeArticulation.FRICATIF, PointArticulationConsonne.VELAIRE, Phonation.SOURDE,
            Cavite.ORALE, Ecoulement.CENTRALE, Flux.PULMONAIRE ),
    API_141( 0x0263, ModeArticulation.FRICATIF, PointArticulationConsonne.VELAIRE, Phonation.VOISEE,
            Cavite.ORALE, Ecoulement.CENTRALE, Flux.PULMONAIRE ),
    API_142( 0x03C7, ModeArticulation.FRICATIF, PointArticulationConsonne.UVULAIRE, Phonation.SOURDE,
            Cavite.ORALE, Ecoulement.CENTRALE, Flux.PULMONAIRE ),
    API_143( 0x0281, ModeArticulation.FRICATIF, PointArticulationConsonne.UVULAIRE, Phonation.VOISEE,
            Cavite.ORALE, Ecoulement.CENTRALE, Flux.PULMONAIRE ),
    API_144( 0x0127, ModeArticulation.FRICATIF, PointArticulationConsonne.PHARYNGAL, Phonation.SOURDE,
            Cavite.ORALE, Ecoulement.NA, Flux.PULMONAIRE ),
    API_145( 0x0295, ModeArticulation.FRICATIF, PointArticulationConsonne.PHARYNGAL, Phonation.VOISEE,
            Cavite.ORALE, Ecoulement.NA, Flux.PULMONAIRE ),
    API_146( 0x0068, ModeArticulation.FRICATIF, PointArticulationConsonne.GLOTTALE, Phonation.SOURDE,
            Cavite.ORALE, Ecoulement.NA, Flux.PULMONAIRE ),
    API_147( 0x0266, ModeArticulation.FRICATIF, PointArticulationConsonne.GLOTTALE, Phonation.VOISEE,
            Cavite.ORALE, Ecoulement.NA, Flux.PULMONAIRE ),
    API_148( 0x026C, ModeArticulation.FRICATIF, PointArticulationConsonne.ALVEOLAIRE, Phonation.SOURDE,
            Cavite.ORALE, Ecoulement.LATERALE, Flux.PULMONAIRE ),
    API_149( 0x026E, ModeArticulation.FRICATIF, PointArticulationConsonne.ALVEOLAIRE, Phonation.VOISEE,
            Cavite.ORALE, Ecoulement.LATERALE, Flux.PULMONAIRE ),
    API_150( 0x028B, ModeArticulation.SPIRANT, PointArticulationConsonne.LABIO_DENTAL, Phonation.VOISEE,
            Cavite.ORALE, Ecoulement.CENTRALE, Flux.PULMONAIRE ),
    API_151( 0x0279, ModeArticulation.SPIRANT, PointArticulationConsonne.ALVEOLAIRE, Phonation.VOISEE,
            Cavite.ORALE, Ecoulement.CENTRALE, Flux.PULMONAIRE ),
    API_152( 0x027B, ModeArticulation.SPIRANT, PointArticulationConsonne.RETROFLEXE, Phonation.VOISEE,
            Cavite.ORALE, Ecoulement.CENTRALE, Flux.PULMONAIRE ),
    API_153( 0x006A, ModeArticulation.SPIRANT, PointArticulationConsonne.PALATAL, Phonation.VOISEE,
            Cavite.ORALE, Ecoulement.CENTRALE, Flux.PULMONAIRE ),
    API_154( 0x0270, ModeArticulation.SPIRANT, PointArticulationConsonne.VELAIRE, Phonation.VOISEE,
            Cavite.ORALE, Ecoulement.CENTRALE, Flux.PULMONAIRE ),
    API_155( 0x006C, ModeArticulation.SPIRANT, PointArticulationConsonne.ALVEOLAIRE, Phonation.VOISEE,
            Cavite.ORALE, Ecoulement.LATERALE, Flux.PULMONAIRE ),
    API_156( 0x026D, ModeArticulation.SPIRANT, PointArticulationConsonne.RETROFLEXE, Phonation.VOISEE,
            Cavite.ORALE, Ecoulement.LATERALE, Flux.PULMONAIRE ),
    API_157( 0x028E, ModeArticulation.SPIRANT, PointArticulationConsonne.PALATAL, Phonation.VOISEE,
            Cavite.ORALE, Ecoulement.LATERALE, Flux.PULMONAIRE ),
    API_158( 0x029F, ModeArticulation.SPIRANT, PointArticulationConsonne.VELAIRE, Phonation.VOISEE,
            Cavite.ORALE, Ecoulement.LATERALE, Flux.PULMONAIRE ),
    API_160( 0x0253, ModeArticulation.OCCLUSIF, PointArticulationConsonne.BILABIAL, Phonation.VOISEE,
            Cavite.ORALE, Ecoulement.CENTRALE, Flux.INJECTIVE ),
    API_162( 0x0257, ModeArticulation.OCCLUSIF, PointArticulationConsonne.ALVEOLAIRE, Phonation.VOISEE,
            Cavite.ORALE, Ecoulement.CENTRALE, Flux.INJECTIVE ),
    API_164( 0x0284, ModeArticulation.OCCLUSIF, PointArticulationConsonne.PALATAL, Phonation.VOISEE,
            Cavite.ORALE, Ecoulement.CENTRALE, Flux.INJECTIVE ),
    API_166( 0x0260, ModeArticulation.OCCLUSIF, PointArticulationConsonne.VELAIRE, Phonation.VOISEE,
            Cavite.ORALE, Ecoulement.CENTRALE, Flux.INJECTIVE ),
    API_168( 0x029B, ModeArticulation.OCCLUSIF, PointArticulationConsonne.UVULAIRE, Phonation.VOISEE,
            Cavite.ORALE, Ecoulement.CENTRALE, Flux.INJECTIVE ),
    API_169( 0x028D, ModeArticulation.SPIRANT, PointArticulationConsonne.LABIO_VELAIRE, Phonation.SOURDE,
            Cavite.ORALE, Ecoulement.CENTRALE, Flux.PULMONAIRE ),
    API_170( 0x0077, ModeArticulation.SPIRANT, PointArticulationConsonne.LABIO_VELAIRE, Phonation.VOISEE,
            Cavite.ORALE, Ecoulement.CENTRALE, Flux.PULMONAIRE ),
    API_171( 0x0265, ModeArticulation.SPIRANT, PointArticulationConsonne.LABIO_PALATAL, Phonation.VOISEE,
            Cavite.ORALE, Ecoulement.CENTRALE, Flux.PULMONAIRE ),
    API_172( 0x029C, ModeArticulation.FRICATIF, PointArticulationConsonne.EPIGLOTTAL, Phonation.SOURDE,
            Cavite.ORALE, Ecoulement.NA, Flux.PULMONAIRE ),
    API_173( 0x02A1, ModeArticulation.OCCLUSIF, PointArticulationConsonne.EPIGLOTTAL, Phonation.SOURDE,
            Cavite.ORALE, Ecoulement.NA, Flux.PULMONAIRE ),
    API_174( 0x02A2, ModeArticulation.FRICATIF, PointArticulationConsonne.EPIGLOTTAL, Phonation.VOISEE,
            Cavite.ORALE, Ecoulement.NA, Flux.PULMONAIRE ),
    API_175( 0x0267, ModeArticulation.FRICATIF, PointArticulationConsonne.POST_ALVEOLO_VELAIRE,
            Phonation.SOURDE, Cavite.ORALE, Ecoulement.CENTRALE, Flux.PULMONAIRE ),
    API_176( 0x0298, ModeArticulation.CLIC, PointArticulationConsonne.ND,
            Phonation.ND, Cavite.ND, Ecoulement.CENTRALE, Flux.BUCCAL ),
    API_177( 0x01C0, ModeArticulation.CLIC, PointArticulationConsonne.ND,
            Phonation.ND, Cavite.ND, Ecoulement.CENTRALE, Flux.BUCCAL ),
    API_178( 0x01C3, ModeArticulation.CLIC, PointArticulationConsonne.ND,
            Phonation.ND, Cavite.ND, Ecoulement.CENTRALE, Flux.BUCCAL ),
    API_179( 0x01C2, ModeArticulation.CLIC, PointArticulationConsonne.ND,
            Phonation.ND, Cavite.ND, Ecoulement.CENTRALE, Flux.BUCCAL ),
    API_180( 0x01C1, ModeArticulation.CLIC, PointArticulationConsonne.ND,
            Phonation.ND, Cavite.ND, Ecoulement.LATERALE, Flux.BUCCAL ),
    API_181( 0x027A, ModeArticulation.BATTU, PointArticulationConsonne.ALVEOLAIRE, Phonation.VOISEE,
            Cavite.ORALE, Ecoulement.LATERALE, Flux.PULMONAIRE ),
    API_182( 0x0255, ModeArticulation.FRICATIF, PointArticulationConsonne.ALVEOLO_PALATALE, Phonation.SOURDE,
            Cavite.ORALE, Ecoulement.CENTRALE, Flux.PULMONAIRE ),
    API_183( 0x0291, ModeArticulation.FRICATIF, PointArticulationConsonne.ALVEOLO_PALATALE, Phonation.VOISEE,
            Cavite.ORALE, Ecoulement.CENTRALE, Flux.PULMONAIRE ),
    // unicode a verifier :
    API_184( 0x2C71, ModeArticulation.BATTU, PointArticulationConsonne.LABIO_DENTAL, Phonation.VOISEE,
            Cavite.ORALE, Ecoulement.CENTRALE, Flux.PULMONAIRE ),
    ;

    /**
     * Contient toutes les constantes de la classe dans l'ordre des déclarations.
     */
    private static final API_Consonne [] TOUS = API_Consonne.class.getEnumConstants();

    /**
     * Contient la représentation utf de chaque symbole de l'API.
     *
     * Il est important que les symboles soient placés dans le même ordre que les contantes dans {@code TOUS}.
     */
    private static final String S_TOUS =
            Arrays.stream( TOUS )
                    .map( API_Consonne::toString )
                    .collect( Collectors.joining() );

    /**
     * Contient un {@code Pattern} de reconnaissance pour identifier si un caractère est un symbole valide de l'API.
     */
    private static final Pattern PATRON_CHOIX_TOUS = Pattern.compile( "[" + S_TOUS + "]" );

    /**
     * Constructeur pour les constantes.
     *
     * @param codePoint La valeur entière pour l'utf-16 du symbole.
     * @param modeArticulation décrit un ensemble de propriétés de l'articulation du son (extrait de Wikipedia).
     * @param pointArticulationConsonne L'endroit où s'effectue l'obstruction au passage d'air injecté
     *                                 (extrait de Wikipedia).
     * @param phonation Indique s'il y a une vibration des cordes vocales (extrait de Wikipedia).
     * @param cavite Action du voile du palais (extrait de Wikipedia).
     * @param ecoulement Endroit de l'écoulement de l'air (extrait de Wikipedia).
     * @param flux Le mécanisme du flux d'air (extrait de Wikipedia).
     */
    private API_Consonne( int codePoint,
                          ModeArticulation modeArticulation,
                          PointArticulationConsonne pointArticulationConsonne,
                          Phonation phonation,
                          Cavite cavite,
                          Ecoulement ecoulement,
                          Flux flux ) {
        this.codePoint = codePoint;
        this.modeArticulation = modeArticulation;
        this.pointArticulationConsonne = pointArticulationConsonne;
        this.phonation = phonation;
        this.cavite = cavite;
        this.ecoulement = ecoulement;
        this.flux = flux;
    }


    private int codePoint;
    private ModeArticulation modeArticulation;
    private PointArticulationConsonne pointArticulationConsonne;
    private Phonation phonation;
    private Cavite cavite;
    private Ecoulement ecoulement;
    private Flux flux;


    /**
     * getter pour le codePoint.
     * @return le codePoint du phonème.
     */
    public int getCodePoint() {
        return codePoint;
    }


    /**
     * Indique si la consonne a la caractéristique sonore 'vocalique'.
     *
     * @see ModeArticulation
     * @return {@code true} si la consonne a la caractéristique sonore 'vocalique'.
     */
    public boolean estVocalique() {
        return modeArticulation.estVocalique();
    }


    /**
     * Indique si la consonne a la caractéristique sonore 'nasal'.
     *
     * @see Cavite
     * @return {@code true} si la consonne a la caractéristique sonore 'nasal'.
     */
    public boolean estNasal() {
        return cavite.estNasal();
    }


    /**
     * Indique si la consonne a la caractéristique sonore 'voisé'.
     *
     * @see Phonation
     * @return {@code true} si la consonne a la caractéristique sonore 'voisé'.
     */
    public boolean estVoise() {
        return phonation.estVoise();
    }


    /**
     * Indique si la consonne a la caractéristique sonore 'continu'.
     *
     * @see ModeArticulation
     * @return {@code true} si la consonne a la caractéristique sonore 'continu'.
     */
    public boolean estContinu() {
        return modeArticulation.estContinu();
    }


    /**
     * Indique si la consonne a la caractéristique sonore 'compact'.
     *
     * @see PointArticulationConsonne
     * @return {@code true} si la consonne a la caractéristique sonore 'compact'.
     */
    public boolean estCompact() {
        return pointArticulationConsonne.estCompact();
    }


    /**
     * Indique si la consonne a la caractéristique sonore 'aigu'.
     *
     * @see PointArticulationConsonne
     * @return {@code true} si la consonne a la caractéristique sonore 'aigu'.
     */
    public boolean estAigu() {
        return pointArticulationConsonne.estAigu();
    }

    /**
     * Compare la  caractéristique sonore 'vocalique' de la consonne courrante
     * avec l'attribut {@code ModeArticulation} de la consonne comparé
     *
     * @param consonne le {@code ModeArticulation} de la consonne comparé
     * @return 1 si les consonnes ont la meme valeur pour cette caractéristique
     */
    private int distanceProprieteVocalique(ModeArticulation consonne) {
        int resultat = 0;

        if (this.estVocalique() != consonne.estVocalique() )
            resultat = resultat + 1;

        return resultat;
    }

    /**
     * Compare la  caractéristique sonore 'nasale' de la consonne courrante
     * avec l'attribut {@code Cavite} de la consonne comparé
     *
     * @param consonne le {@code Cavite} de la consonne comparé
     * @return 1 si les consonnes ont la meme valeur pour cette caractéristique
     */
    private int distanceProprieteNasale(Cavite consonne) {
        int resultat = 0;

        if (this.estNasal() != consonne.estNasal() )
            resultat = resultat + 1;

        return resultat;
    }

    /**
     * Compare la  caractéristique sonore 'voise' de la consonne courrante
     * avec l'attribut {@code Phonation} de la consonne comparé
     *
     * @param consonne le {@code Phonation} de la consonne comparé
     * @return 1 si les consonnes ont la meme valeur pour cette caractéristique
     */
    private int distanceProprieteVoise(Phonation consonne) {
        int resultat = 0;

        if (this.estVoise() != consonne.estVoise() )
            resultat = resultat + 1;

        return resultat;
    }

    /**
     * Compare la  caractéristique sonore 'continu' de la consonne courrante
     * avec l'attribut {@code ModeArticulation} de la consonne comparé
     *
     * @param consonne le {@code ModeArticulation} de la consonne comparé
     * @return 1 si les consonnes ont la meme valeur pour cette caractéristique
     */
    private int distanceProprieteContinu(ModeArticulation consonne) {
        int resultat = 0;

        if (this.estContinu() != consonne.estContinu() )
            resultat = resultat + 1;

        return resultat;
    }

    /**
     * Compare la  caractéristique sonore 'compact' de la consonne courrante
     * avec l'attribut {@code PointArticulationConsonne} de la consonne comparé
     *
     * @param consonne le {@code PointArticulationConsonne} de la consonne comparé
     * @return 1 si les consonnes ont la meme valeur pour cette caractéristique
     */
    private int distanceProprieteCompact(PointArticulationConsonne consonne) {
        int resultat = 0;

        if (this.estCompact() != consonne.estCompact() )
            resultat = resultat + 1;

        return resultat;
    }

    /**
     * Compare la  caractéristique sonore 'aigu' de la consonne courrante
     * avec l'attribut {@code PointArticulationConsonne} de la consonne comparé
     *
     * @param consonne le {@code PointArticulationConsonne} de la consonne comparé
     * @return 1 si les consonnes ont la meme valeur pour cette caractéristique
     */
    private int distanceProprieteAigu(PointArticulationConsonne consonne) {
        int resultat = 0;

        if (this.estAigu() != consonne.estAigu() )
            resultat = resultat + 1;

        return resultat;
    }

    /**
     * Compare la consonne courante avec la consonne donnée en argument
     *
     * @param consonne la {@code API_Consonne} comparée
     * @return la distance entre la consonne courante et la consonne en argument
     */
    public int distanceConsonne_API(API_Consonne consonne) {

        int resultat = 0;

        if (this.codePoint != consonne.codePoint) {

            resultat = distanceProprieteVocalique(consonne.modeArticulation);
            resultat = resultat + distanceProprieteNasale(consonne.cavite);
            resultat = resultat + distanceProprieteVoise(consonne.phonation);
            resultat = resultat + distanceProprieteContinu(consonne.modeArticulation);
            resultat = resultat + distanceProprieteCompact(consonne.pointArticulationConsonne);
            resultat = resultat + distanceProprieteAigu(consonne.pointArticulationConsonne);
        }

        return resultat;
    }

    /**
     * Lit une consonne dans le {@code Scanner}.
     *
     * Vérifie si le prochain caractère du {@code scanner} représente une consonne.  Si oui, alors le symbole est lu et
     * la constante représentant cette consonne est retournée.
     *
     * @param scanner le {@code Scanner} dans lequel la lecture est effectué.
     * @return la constante représenté par le symbole.
     * @exception NoSuchElementException s'il n'y a pas de {@code API_Consonne} valide.
     * @exception IllegalStateException si le {@code Scanner} est fermé.
     */
    public static API_Consonne lire( Scanner scanner ) {
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
