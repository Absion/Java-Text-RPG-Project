/*Determines the type of an item and it's special qualities*/
package tautology;

/**
 *
 * @author Absion
 */
public class ItemType {
    
    private Boolean isItWeapon;
    private Boolean isItEquipable;
    private Boolean isItKeyItem;
    private Boolean isItConsumable;
    private Boolean isItAccesory;
    private Boolean isItBreakable;
    private WeaponType weaponType = new WeaponType();

    public Boolean getIsItWeapon() {
        return isItWeapon;
    }

    public void setIsItWeapon(Boolean isItWeapon) {
        
        if (this.weaponType.toString().equals("NULL")){
           this.isItWeapon = false; 
        }
        else 
            this.isItWeapon = true;
    }

    public Boolean getIsItEquipable() {
        return isItEquipable;
    }

    public void setIsItEquipable(Boolean isItEquipable) {
        this.isItEquipable = isItEquipable;
    }

    public Boolean getIsItKeyItem() {
        return isItKeyItem;
    }

    public void setIsItKeyItem(Boolean isItKeyItem) {
        this.isItKeyItem = isItKeyItem;
    }

    public Boolean getIsItConsumable() {
        return isItConsumable;
    }

    public void setIsItConsumable(Boolean isItConsumable) {
        this.isItConsumable = isItConsumable;
    }

    public Boolean getIsItAccesory() {
        return isItAccesory;
    }

    public void setIsItAccesory(Boolean isItAccesory) {
        this.isItAccesory = isItAccesory;
    }

    public Boolean getIsItBreakable() {
        
        //ANY KEY ITEMS WILL NOT BE BREAKABLE
        if (this.isItKeyItem == true){
            isItBreakable = false;
        }
        
        //ANY LEGENDARY ITEMS ARE NOT BREAKABLE
        else if (this.isItKeyItem == true){
            isItBreakable = false;
        }
        return isItBreakable;
    }

    public void setIsItBreakable(Boolean isItBreakable) {
        this.isItBreakable = isItBreakable;
    }

    public WeaponType getWeaponType() {
        
        //IF NOT A WEAPON THEN THERE IS NO WEAPON TYPE
        if(this.isItWeapon == false){
            weaponType = null;
        }
        
        return weaponType;
        
        
    }

    public void setWeaponType(WeaponType weaponType) {
        this.weaponType = weaponType;
    }

    
    
    
    
    
}
