package INF2120.API;


/**
 * Énumère les différentes groupe de propriétés de l'articulationdes son.
 *
 * @see <a href="https://fr.wikipedia.org/wiki/Mode_d%27articulation">référence</a>
 */
public enum ModeArticulation {
    BATTU,
    CLIC,
    FRICATIF,
    OCCLUSIF,
    ROULEE,
    SPIRANT,

    ;


    /**
     * Caractéristique sonore défini dans l'article de Alain Ghio et al.
     *
     * "distingue les obstruante des consonnes liquides, nasales et semi-voyelles."
     *
     * @see <a href="https://hal.archives-ouvertes.fr/hal-01770161v2/document">référence</a>
     * @return {@code true} lorsqu'une consonne est vocalique.
     */
    public boolean estVocalique() {
        return FRICATIF == this
                || OCCLUSIF == this;
    }


    /**
     * Caractéristique sonore défini dans l'article de Alain Ghio et al.
     *
     * "distingue les occlusives des fricatives."
     *
     * @see <a href="https://hal.archives-ouvertes.fr/hal-01770161v2/document">référence</a>
     * @return {@code true} lorsqu'une consonne est continue.
     */
    public boolean estContinu() {
        return FRICATIF == this
                || ROULEE == this;
    }
}
