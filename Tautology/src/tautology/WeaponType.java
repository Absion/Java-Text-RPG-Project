package tautology;

/**
 *
 * @author Absion
 */
public class WeaponType {

    //PREDEFINED LIST OF THE WEAPONS AVAILABLE IN THE GAME (NULL MEANS NOT A WEAPON)
    private enum WeaponClass {
        GREATSWORD, SHORTSWORD, LONGSWORD, DAGGER, LONGSTAFF, FIST, WAND, RAPIER, GUNBLADE, SHIELD, HANDGUN, RIFLE, NULL
    }

    private WeaponClass weaponClassification;

    public WeaponClass getWeaponClass() {
        return weaponClassification;
    }

    public void setWeaponClass(WeaponClass input) {
        this.weaponClassification = input;
    }
    
    
    
    
}
