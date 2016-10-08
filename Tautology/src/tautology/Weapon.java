package tautology;

/**
 *
 * @author Absion
 */
public class Weapon extends KeyItem {
    
    int damage;
    
    //PREDEFINED LIST OF THE WEAPONS AVAILABLE IN THE GAME 
    private enum WeaponClass {
        GREATSWORD, SHORTSWORD, LONGSWORD, DAGGER, LONGSTAFF, FIST, WAND, RAPIER, GUNBLADE, SHIELD, HANDGUN, RIFLE
    }

    private WeaponClass weaponClassification;

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public WeaponClass getWeaponClassification() {
        return weaponClassification;
    }

    public void setWeaponClassification(WeaponClass weaponClassification) {
        this.weaponClassification = weaponClassification;
    }
    
    
    
}
