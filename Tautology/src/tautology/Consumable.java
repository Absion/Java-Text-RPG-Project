package tautology;

/**
 *
 * @author Absion
 */
public class Consumable extends KeyItem {
    
    public enum ConsumableType {
        HEALTH, MANA, STRENGTH, WISDOM, 
        INTELLIGENCE, DEXTERITY, CONSTITUTION, 
        CHARISMA, LUCK, HEALTHPOISON, MANAPOISON, 
        STRENGTHPOISON, WISDOMPOISON, 
        INTELLIGENCEPOISON, DEXTERITYPOISON, 
        CONSTITUTIONPOISON, CHARISMAPOISON, LUCKPOISON,
    }
    private ConsumableType selectedType;

    private int quantity;

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    
    public ConsumableType getSelectedType() {
        return selectedType;
    }

    public void setSelectedType(ConsumableType selectedType) {
        this.selectedType = selectedType;
    }

   
    
    
    
}
