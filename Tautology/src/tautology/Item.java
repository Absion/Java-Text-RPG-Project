/*Class that will be the basis for any item in the game*/
package tautology;

/**
 *
 * @author Absion
 */
public class Item {
    
    //The qualities of an item
    
    private String itemName;
    private Integer itemWeight = new Integer(0);
    private Integer itemHealth = new Integer(0);
    private Integer itemValue = new Integer (0);
    private String itemHistory;
    public enum ElementType{
    FIRE, WIND, WATER, ELECTRIC, EARTH, DARK, LIGHT, NULL
    }
    private ElementType selectedElement;
    
    public enum ItemRank{
        NORMAL, RARE, LEGENDARY, EPIC
    }
    private ItemRank selectedRank;
    
    
    //Getters and Setters
    public String getItemName() {
        return itemName;
    }
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public Integer getItemWeight() {
        return itemWeight;
    }

    public void setItemWeight(Integer itemWeight) {
        this.itemWeight = itemWeight;
    }

    public Integer getItemHealth() {
        return itemHealth;
    }

    public void setItemHealth(Integer itemHealth) {
        this.itemHealth = itemHealth;
    }

    public Integer getItemValue() {
        return itemValue;
    }

    public void setItemValue(Integer itemValue) {
        this.itemValue = itemValue;
    }
    

    public String getItemHistory() {
        return itemHistory;
    }

    public void setItemHistory(String itemHistory) {
        this.itemHistory = itemHistory;
    }

    

    public ElementType getElementType() {
        return selectedElement;
    }

    public void setSetElementType(ElementType input) {
        this.selectedElement = input;
    }

    public ElementType getSelectedElement() {
        return selectedElement;
    }

    public void setSelectedElement(ElementType selectedElement) {
        this.selectedElement = selectedElement;
    }

    public ItemRank getSelectedRank() {
        return selectedRank;
    }

    public void setSelectedRank(ItemRank selectedRank) {
        this.selectedRank = selectedRank;
    }
    
    
    
    
    
    
    
}
