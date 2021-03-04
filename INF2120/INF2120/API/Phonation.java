package INF2120.API;


/**
 * Caractéristique sonore indiquant le débit d'air expiré et la tension sur les cordes vocales.
 *
 * @see <a href="https://fr.wikipedia.org/wiki/Phonation">référence</a>
 */
public enum Phonation {
    ND,
    SOURDE,
    VOISEE,

    ;


    /**
     * Caractéristique sonore indiquant si la consonne est voisée.
     *
     * @return {@code true} si la consonne est voisée.
     */
    public boolean estVoise() {
        return VOISEE == this;
    }
}
