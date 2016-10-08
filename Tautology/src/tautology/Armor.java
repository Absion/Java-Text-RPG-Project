package tautology;

/**
 *
 * @author Absion
 */
public class Armor extends KeyItem {
    
    public enum ArmorClass {
        STEEL, LEATHER, SCALE, PLATE, CLOTH
    }
    private ArmorClass armorclassification;
    
    public enum BodyPart{
        HEAD, NECK, CHEST, HANDS, FINGER, FEET, LEGS, WAIST, WRIST, EAR 
    }
    private BodyPart bodyClassification;
    
    int defense;

    public ArmorClass getArmorclassification() {
        return armorclassification;
    }

    public void setArmorclassification(ArmorClass armorclassification) {
        this.armorclassification = armorclassification;
    }

    public BodyPart getBodyClassification() {
        return bodyClassification;
    }

    public void setBodyClassification(BodyPart bodyClassification) {
        this.bodyClassification = bodyClassification;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }
    
    
    
}
