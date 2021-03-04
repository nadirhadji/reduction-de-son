package INF2120.API;

import java.util.Comparator;

public class TrierParDistance implements Comparator<PaireSyllabe> {

    /**
     * Cette methode sert a tirer une liste de {@code PaireSyllabe}
     * de la distance la plus petite a la plus grande.
     *
     * @param a {@code PaireSyllabe}
     * @param b {@code PaireSyllabe}
     * @return
     */
    @Override
    public int compare(PaireSyllabe a, PaireSyllabe b) {
        return a.distance - b.distance;
    }
}
