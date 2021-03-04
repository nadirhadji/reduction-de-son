package INF2120.API;


/**
 * Liste les différents endroits où s'effectue l'obstruction au passage de l'air injecté ou éjecté par la voie buccale.
 * Cette liste couvre les cas consernant les voyelles.
 *
 * @see <a href="https://fr.wikipedia.org/wiki/Point_d%27articulation">référence</a>
 */
public enum PointArticulationVoyelle {
    ANTERIEURES,
    QUASI_ANTERIEURES,
    CENTRALES,
    QUASI_POSTERIEURES,
    POSTERIEURES,

    ;


    /**
     * Caractéristique sonore des voyelles postérieures.
     *
     * @see <a href="https://hal.archives-ouvertes.fr/hal-01770161v2/document">référence</a>
     * @return {@code true} si la voyelle est postérieures.
     */
    public boolean estArriere() {
        return  POSTERIEURES == this
                || QUASI_POSTERIEURES == this;
    }
}
