package INF2120.API;


/**
 * Décrit la forme des levrès lors de l'articulation d'une voyelle.
 *
 * @see <a href="https://fr.wikipedia.org/wiki/Arrondissement_(phon%C3%A9tique)">référence</a>
 */
public enum Rondeur {
    NON_ARRONDI,
    ARRONDI,
    NON_DEFINI,

    ;

    /**
     * Indique si la voyelle est arrondi.
     *
     * @return {@code true} si la voyelle est arrondi.
     */
    public boolean estArrondi() {
        return ARRONDI == this;
    }
}
