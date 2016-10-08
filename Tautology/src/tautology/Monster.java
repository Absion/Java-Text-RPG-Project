package tautology;

/**
 *
 * @author Absion
 */
public class Monster extends LivingBeing {
    
    public enum MonsterRank {
        COMMON, ALPHA, LEGENDARY, EPIC
    }
    private MonsterRank selectedRank;
    
    public enum MonsterType {
        BEAST, AQUATIC, ELEMENTAL, DEMON, HEAVENSENT, FOLIAGE
    }
    private MonsterType selectedType;

    public MonsterRank getSelectedRank() {
        return selectedRank;
    }

    public void setSelectedRank(MonsterRank selectedRank) {
        this.selectedRank = selectedRank;
    }

    public MonsterType getSelectedType() {
        return selectedType;
    }

    public void setSelectedType(MonsterType selectedType) {
        this.selectedType = selectedType;
    }
    
    
}
