package INF2120.API;


/**
 * Indique les différents degré d'ouverture.
 *
 * C'est un caractère qui indique la position verticale de la langue par rapport au palais.
 *
 * @see <a href="https://fr.wikipedia.org/wiki/Degr%C3%A9_d%27ouverture">référence</a>
 */
public enum Ouverture {
    FERMEES,
    PRE_FERMEES,
    MI_FERMEES,
    MOYENNES,
    MI_OUVERTES,
    PRE_OUVERTES,
    OUVERTES,

    ;


    /**
     * Indique si la voyelle à une ouverture 'haute'.
     *
     * Terme proposé par Alain Ghio et al.
     *
     * @see <a href="https://hal.archives-ouvertes.fr/hal-01770161v2/document">référence</a>
     * @return {@code true} si la voyelle est haute.
     */
    public boolean estHaut() {
        return FERMEES == this;
    }


    /**
     * Indique si la voyelle est ouverte.
     *
     * @return {@code true} si la voyelle est ouverte.
     */
    public boolean estOuverte() {
        return  MI_OUVERTES == this
                || PRE_OUVERTES == this
                || OUVERTES == this;
    }
}
