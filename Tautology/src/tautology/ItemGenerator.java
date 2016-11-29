package tautology;

import java.util.Random;

/**
 *
 * @author Absion
 */
public class ItemGenerator {

    public static Weapon createLegendaryWeapon(int areaLevel) {

        //Random used to create weapon stats.
        Random rand = new Random();

        //Used to randomly choose names
        int randomDescriptorChooser;

        //Used to hold Item description
        String itemStory = "Few tools of war reach this point. Many would kill you to possess this. ";

        Weapon legendaryWeapon = new Weapon();

        legendaryWeapon.setIsItKeyItem(false);
        legendaryWeapon.setSelectedRank(Item.ItemRank.LEGENDARY);

        //Selects the Type of weapon at random
        int weaponTypeChooser = rand.nextInt(12) + 1;
        String weaponTypeDescriptor = null;
        switch (weaponTypeChooser) {
            case 1:
                legendaryWeapon.setWeaponClassification(Weapon.WeaponClass.LONGSTAFF);
                weaponTypeDescriptor = "Longstaff";
                break;
            case 2:
                legendaryWeapon.setWeaponClassification(Weapon.WeaponClass.DAGGER);
                weaponTypeDescriptor = "Dagger";
                break;
            case 3:
                legendaryWeapon.setWeaponClassification(Weapon.WeaponClass.FIST);
                weaponTypeDescriptor = "Gauntlets";
                break;
            case 4:
                legendaryWeapon.setWeaponClassification(Weapon.WeaponClass.GREATSWORD);
                weaponTypeDescriptor = "Greatsword";
                break;
            case 5:
                legendaryWeapon.setWeaponClassification(Weapon.WeaponClass.GUNBLADE);
                weaponTypeDescriptor = "Gunblade";
                break;
            case 6:
                legendaryWeapon.setWeaponClassification(Weapon.WeaponClass.HANDGUN);
                weaponTypeDescriptor = "Handgun";
                break;
            case 7:
                legendaryWeapon.setWeaponClassification(Weapon.WeaponClass.LONGSWORD);
                weaponTypeDescriptor = "Longsword";
                break;
            case 8:
                legendaryWeapon.setWeaponClassification(Weapon.WeaponClass.RAPIER);
                weaponTypeDescriptor = "Rapier";
                break;
            case 9:
                legendaryWeapon.setWeaponClassification(Weapon.WeaponClass.RIFLE);
                weaponTypeDescriptor = "Rifle";
                break;
            case 10:
                legendaryWeapon.setWeaponClassification(Weapon.WeaponClass.SHIELD);
                weaponTypeDescriptor = "Shield";
                break;
            case 11:
                legendaryWeapon.setWeaponClassification(Weapon.WeaponClass.SHORTSWORD);
                weaponTypeDescriptor = "Shortsword";
                break;
            case 12:
                legendaryWeapon.setWeaponClassification(Weapon.WeaponClass.WAND);
                weaponTypeDescriptor = "Wand";
                break;
        }

        //Randomly Selects the element of the weapon
        int elementTypeChooser = rand.nextInt(8) + 1;

        switch (elementTypeChooser) {
            case 1:
                legendaryWeapon.setSelectedElement(Item.ElementType.BASE);
                break;
            case 2:
                legendaryWeapon.setSelectedElement(Item.ElementType.DARK);
                break;
            case 3:
                legendaryWeapon.setSelectedElement(Item.ElementType.EARTH);
                break;
            case 4:
                legendaryWeapon.setSelectedElement(Item.ElementType.ELECTRIC);
                break;
            case 5:
                legendaryWeapon.setSelectedElement(Item.ElementType.FIRE);
                break;
            case 6:
                legendaryWeapon.setSelectedElement(Item.ElementType.LIGHT);
                break;
            case 7:
                legendaryWeapon.setSelectedElement(Item.ElementType.WATER);
                break;
            case 8:
                legendaryWeapon.setSelectedElement(Item.ElementType.WIND);
                break;
        }

        //Randomly determines name of weapon by looking at its element and choosing a status
        String switchController;

        String elementDescriptor = null;
        switchController = legendaryWeapon.getSelectedElement().toString();
        switch (switchController) {
            case "FIRE":
                randomDescriptorChooser = rand.nextInt(4) + 1;
                switch (randomDescriptorChooser) {
                    case 1:
                        elementDescriptor = "Ad' Resh's";
                        itemStory = itemStory + "Blessed by the flame primal Ad' Resh. ";
                        break;
                    case 2:
                        elementDescriptor = "Smoldering";
                        itemStory = itemStory + "The heat can be felt from inches away; yet, it burns not its wielder. ";
                        break;
                    case 3:
                        elementDescriptor = "Singed";
                        itemStory = itemStory + "Covered in a layer of ash that can never be removed. ";
                        break;
                    case 4:
                        elementDescriptor = "Ignited";
                        itemStory = itemStory + "Dancing magical flames flick across the surface; yet, they never hurt irs master. ";
                        break;
                }
                break;
            case "WATER":
                randomDescriptorChooser = rand.nextInt(4) + 1;
                switch (randomDescriptorChooser) {
                    case 1:
                        elementDescriptor = "Menpho's";
                        itemStory = itemStory + "Blessed by the water primal Menpho. ";
                        break;
                    case 2:
                        elementDescriptor = "Slick";
                        itemStory = itemStory + "Covered in a thin layer of moisture. ";
                        break;
                    case 3:
                        elementDescriptor = "Damp";
                        itemStory = itemStory + "It drips arcane droplets perpetually. ";
                        break;
                    case 4:
                        elementDescriptor = "Chilled";
                        itemStory = itemStory + "Refreshing and cool to the touch for its wielder. Ice cold to all else. ";
                        break;
                }
                break;
            case "EARTH":
                randomDescriptorChooser = rand.nextInt(4) + 1;
                switch (randomDescriptorChooser) {
                    case 1:
                        elementDescriptor = "Tiamesh's";
                        itemStory = itemStory + "Blessed by the earth primal Tiamesh. ";
                        break;
                    case 2:
                        elementDescriptor = "Earthen";
                        itemStory = itemStory + "Covered in a fine layer of arcane soil. ";
                        break;
                    case 3:
                        elementDescriptor = "Solid";
                        itemStory = itemStory + "Hard like the earth. ";
                        break;
                    case 4:
                        elementDescriptor = "Sylvan";
                        itemStory = itemStory + "Composed of impossibly hard root and bark. ";
                        break;
                }
                break;
            case "WIND":
                randomDescriptorChooser = rand.nextInt(4) + 1;
                switch (randomDescriptorChooser) {
                    case 1:
                        elementDescriptor = "Zimevia's";
                        itemStory = itemStory + "Blessed by the wind primal Zimevia. ";
                        break;
                    case 2:
                        elementDescriptor = "Tempestuous";
                        itemStory = itemStory + "Surronded by raging wind. ";
                        break;
                    case 3:
                        elementDescriptor = "Turbulant";
                        itemStory = itemStory + "Shaking with the contained might of a tornado. ";
                        break;
                    case 4:
                        elementDescriptor = "Ephemeral";
                        itemStory = itemStory + "Wind constantly solidfying and evaporating. ";
                        break;
                }
                break;
            case "DARK":
                randomDescriptorChooser = rand.nextInt(4) + 1;
                switch (randomDescriptorChooser) {
                    case 1:
                        elementDescriptor = "Nelo's";
                        itemStory = itemStory + "Blessed by the dark one Nelo. ";
                        break;
                    case 2:
                        elementDescriptor = "Obsidian";
                        itemStory = itemStory + "Darkness solidified. ";
                        break;
                    case 3:
                        elementDescriptor = "Void";
                        itemStory = itemStory + "You feel it staring back. ";
                        break;
                    case 4:
                        elementDescriptor = "Shade";
                        itemStory = itemStory + "Shadows flow across the surface. ";
                        break;
                }
                break;
            case "LIGHT":
                randomDescriptorChooser = rand.nextInt(4) + 1;
                switch (randomDescriptorChooser) {
                    case 1:
                        elementDescriptor = "Ome's";
                        itemStory = itemStory + "Blessed by the light bearing Ome. ";
                        break;
                    case 2:
                        elementDescriptor = "Blessed";
                        itemStory = itemStory + "Holy magics radiate within. ";
                        break;
                    case 3:
                        elementDescriptor = "Lucent";
                        itemStory = itemStory + "Always posesed of clear striking light. ";
                        break;
                    case 4:
                        elementDescriptor = "Shimmering";
                        itemStory = itemStory + "Lights like starlight glimmer within. ";
                        break;
                }
                break;
            case "ELECTRIC":
                randomDescriptorChooser = rand.nextInt(4) + 1;
                switch (randomDescriptorChooser) {
                    case 1:
                        elementDescriptor = "Hekor's";
                        itemStory = itemStory + "Blessed by the primal of energy Hekor. ";
                        break;
                    case 2:
                        elementDescriptor = "Live";
                        itemStory = itemStory + "It charges the air around it. ";
                        break;
                    case 3:
                        elementDescriptor = "Voltaic";
                        itemStory = itemStory + "You feel its need to dispel its pent up charge. ";
                        break;
                    case 4:
                        elementDescriptor = "Charged";
                        itemStory = itemStory + "Humming with its contained might. ";
                        break;
                }
                break;
            case "BASE":
                randomDescriptorChooser = rand.nextInt(4) + 1;
                switch (randomDescriptorChooser) {
                    case 1:
                        elementDescriptor = "Battle-Tested";
                        itemStory = itemStory + "A testament to never-ending war. ";
                        break;
                    case 2:
                        elementDescriptor = "Aincient";
                        itemStory = itemStory + "Crafted utilizing long forgotten methods. ";
                        break;
                    case 3:
                        elementDescriptor = "Historic";
                        itemStory = itemStory + "Grand Epics were written about users of this arm. ";
                        break;
                    case 4:
                        elementDescriptor = "Dauntless";
                        itemStory = itemStory + "Used by those who would ever seek greater challenge. ";
                        break;
                }
                break;

        }

        String visualDescriptor = null;
        int randomVisualDescriptorChooser = rand.nextInt(4) + 1;
                switch (randomVisualDescriptorChooser) {
                    case 1:
                        visualDescriptor = "Pristine";
                        itemStory = itemStory + "A weapon free from blemish and degredation. ";
                        break;
                    case 2:
                        visualDescriptor = "Damaged";
                        itemStory = itemStory + "Scarred by combat long past. ";
                        break;
                    case 3:
                        visualDescriptor = "Decorative";
                        itemStory = itemStory + "As much a work of art as it is tool of war. ";
                        break;
                    case 4:
                        visualDescriptor = "Unassuming";
                        itemStory = itemStory + "It appears plain to all those not chosen. ";
                        break;
                }

        legendaryWeapon.setItemName(elementDescriptor + " " + visualDescriptor + " " + weaponTypeDescriptor);

        //SETS DAMAGE OF WEAPON
        legendaryWeapon.setDamage(rand.nextInt(areaLevel) + 20);

        //Sets Health of Item
        legendaryWeapon.setItemHealth((rand.nextInt(areaLevel) + 50) * 7);
        
        //Sets Item History
        legendaryWeapon.setItemHistory(itemStory + "A true Masterpiece.");

        //Sets Item Worth
        legendaryWeapon.setItemValue(areaLevel);
        
        //Sets Item Weight
        legendaryWeapon.setItemWeight(areaLevel);

        return legendaryWeapon;
    }

}
