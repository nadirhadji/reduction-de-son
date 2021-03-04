package INF2120.API;


/**
 * Liste les différents endroits où s'effectue l'obstruction au passage de l'air injecté ou éjecté par la voie buccale.
 * Cette liste couvre les cas consernant les consonnes.
 *
 * @see <a href="https://fr.wikipedia.org/wiki/Point_d%27articulation">référence</a>
 */
public enum PointArticulationConsonne {
    ALVEOLAIRE,
    ALVEOLO_PALATALE,
    BILABIAL,
    DENTALE,
    EPIGLOTTAL,
    GLOTTALE,
    LABIO_DENTAL,
    LABIO_PALATAL,
    LABIO_VELAIRE,
    ND,
    PALATAL,
    PALATO_ALVEOLAIRE,
    PHARYNGAL,
    POST_ALVEOLO_VELAIRE,
    RETROFLEXE,
    UVULAIRE,
    VELAIRE,

    ;

    /**
     * Caractéristique sonore indiquant les consoones articulé contre le palais.
     *
     * Définition extraite de JAKOBSON R., FANT G., HALLE M. (1951), "Preliminaries to speech analysis", MIT Press,
     * Cambridge.
     * @return {@code true} lorsque la consonne est compacte.
     */
    public boolean estCompact() {
        return ALVEOLO_PALATALE == this
                || LABIO_PALATAL == this
                || LABIO_VELAIRE == this
                || PALATAL == this
                || PALATO_ALVEOLAIRE == this
                || POST_ALVEOLO_VELAIRE == this
                || VELAIRE == this
                ;
    }


    /**
     * Caractéristique sonore indiquant les consoones dentale et vélaire.
     *
     *  Définition extraite de JAKOBSON R., FANT G., HALLE M. (1951), "Preliminaries to speech analysis", MIT Press,
     * Cambridge.
     * @return {@code true} lorsque la consonne est aigue.
     */
    public boolean estAigu() {
        return ALVEOLAIRE == this
                || DENTALE == this
                || POST_ALVEOLO_VELAIRE == this
                || VELAIRE == this
                ;
    }
}
