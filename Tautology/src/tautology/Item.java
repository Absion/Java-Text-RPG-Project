/*Class that will be the basis for any item in the game*/
package tautology;

/**
 *
 * @author Absion
 */
public class Item {
    
    //The qualities of an item
    
    private String itemName;
    private Double itemWeight = new Double(0.0);
    private Double itemHealth = new Double(0.0);
    private Double itemValue = new Double (0.0);
    private String itemHistory;
    private enum ElementType{
    FIRE, WIND, WATER, ELECTRIC, EARTH, DARK, LIGHT, NULL
    }
    private ElementType selectedElement;
    private enum ItemRank{
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
    public Double getItemWeight() {
        return itemWeight;
    }

    public void setItemWeight(Double itemWeight) {
        this.itemWeight = itemWeight;
    }

    public Double getItemHealth() {
        return itemHealth;
    }

    public void setItemHealth(Double itemHealth) {
        this.itemHealth = itemHealth;
    }

    public Double getItemValue() {
        return itemValue;
    }

    public void setItemValue(Double itemValue) {
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
