package tautology;

import java.util.Random;

/**
 *
 * @author Absion
 */
public class EnemyGenerator {

    
    

    public static Monster createCanineMonster(int areaLevel, String areaType) {

        //Random used to create monsters.
        Random rand = new Random();
        
        Monster dog = new Monster();
        //Sets Canine's level from minimum of 1 to +3 the level of the area
        dog.setLevel(rand.nextInt(areaLevel + 3) + 1);
        
        //Sets Canine's age from minimum of 1 to +5 the level of the area
        dog.setAge(rand.nextInt(areaLevel + 5) + 1);

        dog.setIsKillable(true);
        dog.setSelectedAlignment(LivingBeing.Alingment.CHAOTICNEUTRAL);
        dog.setSelectedSize(LivingBeing.Size.MEDIUM);
        dog.setSelectedType(Monster.MonsterType.BEAST);
        dog.setExperience(0);

        //Randomly chooses if the canine is female or male.
        int genderChooser = rand.nextInt(3) + 1;
        if (genderChooser % 2 == 0) {
            dog.setSelectedGender(LivingBeing.Gender.FEMALE);
        } else {
            dog.setSelectedGender(LivingBeing.Gender.MALE);
        }

        //Chooses rank based on level
        if (dog.getLevel() <= 10) {
            dog.setSelectedRank(Monster.MonsterRank.COMMON);
        }
        if (dog.getLevel() <= 15 && dog.getLevel() > 10) {
            dog.setSelectedRank(Monster.MonsterRank.ALPHA);
        }
        if (dog.getLevel() <= 20 && dog.getLevel() > 15) {
            dog.setSelectedRank(Monster.MonsterRank.EPIC);
        }
        if (dog.getLevel() > 20) {
            dog.setSelectedRank(Monster.MonsterRank.LEGENDARY);
        }

        //Sets name based on rank and location
        String switchController = dog.getSelectedRank().toString();
        switch (switchController) {
            case "COMMON":
                dog.setName("Stray " + areaType + " Dog");
                break;
            case "ALPHA":
                dog.setName("Prowling " + areaType + " Wolf");
                break;
            case "EPIC":
                dog.setName("Dignified " + areaType + " Packleader");
                break;
            case "LEGENDARY":
                dog.setName("Battle-Scarred " + areaType + " DireWolf");
                break;
        }

        //Sets Charisma
        switch (switchController) {
            case "COMMON":
                dog.setCharisma(rand.nextInt(2) + 1);
                break;
            case "ALPHA":
                dog.setCharisma(rand.nextInt(3) + 1);
                break;
            case "EPIC":
                dog.setCharisma(rand.nextInt(5) + 1);
                break;
            case "LEGENDARY":
                dog.setCharisma(rand.nextInt(6) + 1);
                break;
        }
        
        //Sets Constitution
        switch (switchController) {
            case "COMMON":
                dog.setConstitution(rand.nextInt(3) + 1);
                break;
            case "ALPHA":
                dog.setConstitution(rand.nextInt(4) + 1);
                break;
            case "EPIC":
                dog.setConstitution(rand.nextInt(7) + 1);
                break;
            case "LEGENDARY":
                dog.setConstitution(rand.nextInt(9) + 1);
                break;
        }
        
        //Sets Dexterity
        switch (switchController) {
            case "COMMON":
                dog.setDexterity(rand.nextInt(2) + 1);
                break;
            case "ALPHA":
                dog.setDexterity(rand.nextInt(4) + 1);
                break;
            case "EPIC":
                dog.setDexterity(rand.nextInt(8) + 1);
                break;
            case "LEGENDARY":
                dog.setDexterity(rand.nextInt(10) + 1);
                break;
        }
        
        //Sets Intelligence
        switch (switchController) {
            case "COMMON":
                dog.setIntelligence(rand.nextInt(1) + 1);
                break;
            case "ALPHA":
                dog.setIntelligence(rand.nextInt(3) + 1);
                break;
            case "EPIC":
                dog.setIntelligence(rand.nextInt(5) + 1);
                break;
            case "LEGENDARY":
                dog.setIntelligence(rand.nextInt(8) + 1);
                break;
        }
        
        //Sets Luck
        switch (switchController) {
            case "COMMON":
                dog.setLuck(rand.nextInt(2) + 1);
                break;
            case "ALPHA":
                dog.setLuck(rand.nextInt(3) + 1);
                break;
            case "EPIC":
                dog.setLuck(rand.nextInt(5) + 1);
                break;
            case "LEGENDARY":
                dog.setLuck(rand.nextInt(6) + 1);
                break;
        }
        
        //Sets Strength
        switch (switchController) {
            case "COMMON":
                dog.setStrength(rand.nextInt(2) + 1);
                break;
            case "ALPHA":
                dog.setStrength(rand.nextInt(4) + 1);
                break;
            case "EPIC":
                dog.setStrength(rand.nextInt(6) + 1);
                break;
            case "LEGENDARY":
                dog.setStrength(rand.nextInt(8) + 1);
                break;
        }
        
        //Sets Wisdom
        switch (switchController) {
            case "COMMON":
                dog.setWisdom(rand.nextInt(2) + 1);
                break;
            case "ALPHA":
                dog.setWisdom(rand.nextInt(3) + 1);
                break;
            case "EPIC":
                dog.setWisdom(rand.nextInt(7) + 1);
                break;
            case "LEGENDARY":
                dog.setWisdom(rand.nextInt(9) + 1);
                break;
        }
        
        //Sets Health Pool
        dog.setHealth(dog.getConstitution() * 80);
        
        //Sets Mana Pool
        dog.setMana(dog.getWisdom() * 40);
        

        return dog;
    }

}
