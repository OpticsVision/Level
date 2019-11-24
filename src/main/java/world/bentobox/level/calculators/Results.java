package world.bentobox.level.calculators;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

import org.bukkit.Material;

import com.google.common.collect.HashMultiset;
import com.google.common.collect.Multiset;

/**
 * Results class
 *
 */
public class Results {
    // AtomicLong and AtomicInteger must be used because they are changed by multiple concurrent threads
    private AtomicInteger deathHandicap = new AtomicInteger(0);
    private AtomicLong initialLevel = new AtomicLong(0);
    private AtomicLong level = new AtomicLong(0);
    private final Multiset<Material> mdCount = HashMultiset.create();
    private final Multiset<Material> ncCount = HashMultiset.create();
    private final Multiset<Material> ofCount = HashMultiset.create();
    private AtomicLong pointsToNextLevel = new AtomicLong(0);
    private AtomicLong rawBlockCount = new AtomicLong(0);
    private List<String> report;
    private AtomicLong underWaterBlockCount = new AtomicLong(0);
    private final Multiset<Material> uwCount = HashMultiset.create();

    /**
     * @return the deathHandicap
     */
    public AtomicInteger getDeathHandicap() {
        return deathHandicap;
    }
    /**
     * @return the initialLevel
     */
    public AtomicLong getInitialLevel() {
        return initialLevel;
    }
    /**
     * @return the level
     */
    public AtomicLong getLevel() {
        return level;
    }
    /**
     * @return the mdCount
     */
    public Multiset<Material> getMdCount() {
        return mdCount;
    }
    /**
     * @return the ncCount
     */
    public Multiset<Material> getNcCount() {
        return ncCount;
    }

    /**
     * @return the ofCount
     */
    public Multiset<Material> getOfCount() {
        return ofCount;
    }

    /**
     * @return the pointsToNextLevel
     */
    public AtomicLong getPointsToNextLevel() {
        return pointsToNextLevel;
    }

    /**
     * @return the rawBlockCount
     */
    public AtomicLong getRawBlockCount() {
        return rawBlockCount;
    }

    /**
     * @return the report
     */
    public List<String> getReport() {
        return report;
    }

    /**
     * @return the underWaterBlockCount
     */
    public AtomicLong getUnderWaterBlockCount() {
        return underWaterBlockCount;
    }

    /**
     * @return the uwCount
     */
    public Multiset<Material> getUwCount() {
        return uwCount;
    }

    /**
     * @param deathHandicap the deathHandicap to set
     */
    public void setDeathHandicap(AtomicInteger deathHandicap) {
        this.deathHandicap = deathHandicap;
    }

    /**
     * @param initialLevel the initialLevel to set
     */
    public void setInitialLevel(AtomicLong initialLevel) {
        this.initialLevel = initialLevel;
    }

    public void setInitialLevel(long initialLevel) {
        this.initialLevel.set(initialLevel);
    }

    /**
     * @param level the level to set
     */
    public void setLevel(AtomicLong level) {
        this.level = level;
    }

    /**
     * Set level
     * @param level - level
     */
    public void setLevel(int level) {
        this.level.set(level);
    }

    /**
     * @param pointsToNextLevel the pointsToNextLevel to set
     */
    public void setPointsToNextLevel(AtomicLong pointsToNextLevel) {
        this.pointsToNextLevel = pointsToNextLevel;
    }

    /**
     * @param rawBlockCount the rawBlockCount to set
     */
    public void setRawBlockCount(AtomicLong rawBlockCount) {
        this.rawBlockCount = rawBlockCount;
    }

    /**
     * @param report the report to set
     */
    public void setReport(List<String> report) {
        this.report = report;
    }

    /**
     * @param underWaterBlockCount the underWaterBlockCount to set
     */
    public void setUnderWaterBlockCount(AtomicLong underWaterBlockCount) {
        this.underWaterBlockCount = underWaterBlockCount;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "Results [report=" + report + ", mdCount=" + mdCount + ", uwCount=" + getUwCount() + ", ncCount="
                + ncCount + ", ofCount=" + ofCount + ", rawBlockCount=" + rawBlockCount + ", underWaterBlockCount="
                + getUnderWaterBlockCount() + ", level=" + level + ", deathHandicap=" + deathHandicap
                + ", pointsToNextLevel=" + pointsToNextLevel + ", initialLevel=" + initialLevel + "]";
    }

}