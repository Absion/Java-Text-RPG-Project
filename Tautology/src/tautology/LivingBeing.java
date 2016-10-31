package tautology;

/**
 *
 * @author Absion
 */
public class LivingBeing {
    
    //ASSIGNS GENDER TO A LIVING BEING
    public enum Gender {
        MALE, FEMALE, NONGENDER
    }
    private Gender selectedGender;
    
    //ASSIGNS ALIGNMENT TO A LIVING THING
    public enum Alingment{
        LAWFULNEUTRAL, CHAOTICNEUTRAL, NEUTRAL, 
        CHAOTICEVIL, LAWFULEVIL, NEUTRALEVIL,
        LAWFULGOOD, CHAOTICGOOD, NEUTRALGOOD 
    }
    private Alingment selectedAlignment;
    
    //ASSIGNS SIZE TO A LIVING THING
    public enum Size {
    SMALL, MEDIUM, LARGE, GIANT
}
    private Size selectedSize;
    
    //THE STAT ATTRIBUTES
    private int strength;
    private int wisdom;
    private int dexterity;
    private int constitution;
    private int intelligence;
    private int luck;
    private int charisma;
    private int level;
    private int experience;
    
    private int age;
    private boolean isKillable;
    
    private int health;
    private int mana;
    
    private String name;

    public Gender getSelectedGender() {
        return selectedGender;
    }

    public void setSelectedGender(Gender selectedGender) {
        this.selectedGender = selectedGender;
    }

    public Alingment getSelectedAlignment() {
        return selectedAlignment;
    }

    public void setSelectedAlignment(Alingment selectedAlignment) {
        this.selectedAlignment = selectedAlignment;
    }

    public Size getSelectedSize() {
        return selectedSize;
    }

    public void setSelectedSize(Size selectedSize) {
        this.selectedSize = selectedSize;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getDexterity() {
        return dexterity;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public int getConstitution() {
        return constitution;
    }

    public void setConstitution(int constitution) {
        this.constitution = constitution;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getLuck() {
        return luck;
    }

    public void setLuck(int luck) {
        this.luck = luck;
    }

    public int getCharisma() {
        return charisma;
    }

    public void setCharisma(int charisma) {
        this.charisma = charisma;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isIsKillable() {
        return isKillable;
    }

    public void setIsKillable(boolean isKillable) {
        this.isKillable = isKillable;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
    
    
    
    
}
