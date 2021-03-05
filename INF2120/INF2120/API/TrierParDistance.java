package INF2120.API;

import java.util.Comparator;

/**
 * Cette classe sert a trier une liste de couples de syllabe {@code ListeCoupleSyllabe}
 * en fonction de l'attribut distance de l'object {@code CoupleDeSyllabe}
 */
public class TrierParDistance implements Comparator<CoupleDeSyllabe> {

    /**
     * Cette methode sert a tirer une liste de {@code CoupleDeSyllabe}
     * de la distance la plus petite a la plus grande.
     *
     * @param a {@code CoupleDeSyllabe}
     * @param b {@code CoupleDeSyllabe}
     *
     * @return une valeur soit positive ou negative qui determira leauelle est le plus grand.
     */
    @Override
    public int compare(CoupleDeSyllabe a, CoupleDeSyllabe b) {
        return a.distance - b.distance;
    }
}
