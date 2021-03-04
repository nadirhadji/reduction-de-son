package INF2120.API;

/**
 * Décrit d'où s'échappe l'air lors de la prononciation d'une consonne.
 */
public enum Cavite {
    NASALE,
    ND,
    ORALE,

    ;


    /**
     * Retourne si la cavité d'échapement d'air est le nez.
     *
     * @see <a href="https://hal.archives-ouvertes.fr/hal-01770161v2/document">référence</a>
     * @return {@code true} si l'air s'échappe par le nez lors de la prononciation de la consonne.
     */
    public boolean estNasal() {
        return NASALE == this;
    }
}
