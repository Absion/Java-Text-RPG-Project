package tautology;

import java.util.*;

/**
 *
 * @author Absion
 */
public class Humanoid extends LivingBeing {
    
    private String history;
    
    private enum Class{
        WARRIOR, MARKSMAN, CLERIC, 
        ROUGE, MAGICIAN, MERCENARY, 
        SOLDIER, PUGILIST, MERCHANT,
        CHILD, ELDER
    }
    private Class selectedClass;
    
    private enum HumanType{
        HUMAN, BEASTMAN, ELF, FAIRY
    }
    private HumanType selectedHumanType;
    
    LinkedList<Item> inventory;
    LinkedList<Item> equipped;

    public String getHistory() {
        return history;
    }

    public void setHistory(String history) {
        this.history = history;
    }

    public Class getSelectedClass() {
        return selectedClass;
    }

    public void setSelectedClass(Class selectedClass) {
        this.selectedClass = selectedClass;
    }

    public HumanType getSelectedHumanType() {
        return selectedHumanType;
    }

    public void setSelectedHumanType(HumanType selectedHumanType) {
        this.selectedHumanType = selectedHumanType;
    }

    public LinkedList<Item> getInventory() {
        return inventory;
    }

    public void setInventory(LinkedList<Item> inventory) {
        this.inventory = inventory;
    }

    public LinkedList<Item> getEquipped() {
        return equipped;
    }

    public void setEquipped(LinkedList<Item> equipped) {
        this.equipped = equipped;
    }
    
    
    
    
}
