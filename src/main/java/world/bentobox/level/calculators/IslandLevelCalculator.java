package world.bentobox.level.calculators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import world.bentobox.bentobox.database.objects.Island;

public abstract class IslandLevelCalculator {

    private List<Island> islandsInCalc = Collections.synchronizedList(new ArrayList<Island>());

    /**
     * Check if an island level is being calculated
     * @param island - island
     * @return true if in calculation
     */
    public boolean isCalculating(Island island) {
        return islandsInCalc.contains(island);
    }

    /**
     * Add island to the list of islands being calculated
     * @param island - island
     */
    void addIsland(Island island) {
        islandsInCalc.add(island);
    }

    /**
     * Remove island from the list of calculated islands
     * @param island - island
     */
    void removeIsland(Island island) {
        islandsInCalc.remove(island);
    }

    /**
     * Clear all islands from the list
     */
    void clearIslands() {
        islandsInCalc.clear();
    }

    /**
     * @return the results of the island calculation
     */
    abstract Results getResult();

}
