package tautology;

/**
 *
 * @author Absion
 */
public class NonPlayerCharacter extends Humanoid {
    
    private boolean isShopKeeper;
    private boolean isQuestGiver;
    private boolean isEnemy;

    public boolean isIsShopKeeper() {
        return isShopKeeper;
    }

    public void setIsShopKeeper(boolean isShopKeeper) {
        this.isShopKeeper = isShopKeeper;
    }

    public boolean isIsQuestGiver() {
        return isQuestGiver;
    }

    public void setIsQuestGiver(boolean isQuestGiver) {
        this.isQuestGiver = isQuestGiver;
    }

    public boolean isIsEnemy() {
        return isEnemy;
    }

    public void setIsEnemy(boolean isEnemy) {
        this.isEnemy = isEnemy;
    }
    
    
    
}
