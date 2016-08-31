/*Class that will be the basis for any item in the game*/
package tautology;

/**
 *
 * @author Absion
 */
public class Item {
    
    //The qualities of an item
    
    private String itemName;
    private Double itemWeight = new Double(0.00);
    private Double itemHealth = new Double(0.0);
    private Double itemValue = new Double (0.0);
    private ItemType itemType = new ItemType();
    private DescriptiveLore itemHistory = new DescriptiveLore();

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

    public ItemType getItemType() {
        return itemType;
    }

    public void setItemType(ItemType itemType) {
        this.itemType = itemType;
    }

    public DescriptiveLore getItemHistory() {
        return itemHistory;
    }

    public void setItemHistory(DescriptiveLore itemHistory) {
        this.itemHistory = itemHistory;
    }
    
    
    
    
    
    
    
}
