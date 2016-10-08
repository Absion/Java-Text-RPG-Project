package tautology;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Absion
 */
public class LivingBeingTest {
    
    public LivingBeingTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getSelectedGender method, of class LivingBeing.
     */
    @Test
    public void testGetSelectedGender() {
        System.out.println("getSelectedGender");
        LivingBeing instance = new LivingBeing();
        instance.setSelectedGender(LivingBeing.Gender.NONGENDER);
        LivingBeing.Gender expResult = LivingBeing.Gender.NONGENDER;
        LivingBeing.Gender result = instance.getSelectedGender();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setSelectedGender method, of class LivingBeing.
     */
    @Test
    public void testSetSelectedGender() {
        System.out.println("setSelectedGender");
        LivingBeing.Gender selectedGender = null;
        LivingBeing instance = new LivingBeing();
        instance.setSelectedGender(selectedGender);
        
    }

    /**
     * Test of getSelectedAlignment method, of class LivingBeing.
     */
    @Test
    public void testGetSelectedAlignment() {
        System.out.println("getSelectedAlignment");
        LivingBeing instance = new LivingBeing();
        LivingBeing.Alingment expResult = null;
        LivingBeing.Alingment result = instance.getSelectedAlignment();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setSelectedAlignment method, of class LivingBeing.
     */
    @Test
    public void testSetSelectedAlignment() {
        System.out.println("setSelectedAlignment");
        LivingBeing.Alingment selectedAlignment = null;
        LivingBeing instance = new LivingBeing();
        instance.setSelectedAlignment(selectedAlignment);
        
    }

    /**
     * Test of getSelectedSize method, of class LivingBeing.
     */
    @Test
    public void testGetSelectedSize() {
        System.out.println("getSelectedSize");
        LivingBeing instance = new LivingBeing();
        LivingBeing.Size expResult = null;
        LivingBeing.Size result = instance.getSelectedSize();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setSelectedSize method, of class LivingBeing.
     */
    @Test
    public void testSetSelectedSize() {
        System.out.println("setSelectedSize");
        LivingBeing.Size selectedSize = null;
        LivingBeing instance = new LivingBeing();
        instance.setSelectedSize(selectedSize);
        
    }

    /**
     * Test of getStrength method, of class LivingBeing.
     */
    @Test
    public void testGetStrength() {
        System.out.println("getStrength");
        LivingBeing instance = new LivingBeing();
        int expResult = 0;
        int result = instance.getStrength();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setStrength method, of class LivingBeing.
     */
    @Test
    public void testSetStrength() {
        System.out.println("setStrength");
        int strength = 0;
        LivingBeing instance = new LivingBeing();
        instance.setStrength(strength);
        
    }

    /**
     * Test of getWisdom method, of class LivingBeing.
     */
    @Test
    public void testGetWisdom() {
        System.out.println("getWisdom");
        LivingBeing instance = new LivingBeing();
        int expResult = 0;
        int result = instance.getWisdom();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setWisdom method, of class LivingBeing.
     */
    @Test
    public void testSetWisdom() {
        System.out.println("setWisdom");
        int wisdom = 0;
        LivingBeing instance = new LivingBeing();
        instance.setWisdom(wisdom);
        
    }

    /**
     * Test of getDexterity method, of class LivingBeing.
     */
    @Test
    public void testGetDexterity() {
        System.out.println("getDexterity");
        LivingBeing instance = new LivingBeing();
        int expResult = 0;
        int result = instance.getDexterity();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setDexterity method, of class LivingBeing.
     */
    @Test
    public void testSetDexterity() {
        System.out.println("setDexterity");
        int dexterity = 0;
        LivingBeing instance = new LivingBeing();
        instance.setDexterity(dexterity);
        
    }

    /**
     * Test of getConstitution method, of class LivingBeing.
     */
    @Test
    public void testGetConstitution() {
        System.out.println("getConstitution");
        LivingBeing instance = new LivingBeing();
        int expResult = 0;
        int result = instance.getConstitution();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setConstitution method, of class LivingBeing.
     */
    @Test
    public void testSetConstitution() {
        System.out.println("setConstitution");
        int constitution = 0;
        LivingBeing instance = new LivingBeing();
        instance.setConstitution(constitution);
        
    }

    /**
     * Test of getIntelligence method, of class LivingBeing.
     */
    @Test
    public void testGetIntelligence() {
        System.out.println("getIntelligence");
        LivingBeing instance = new LivingBeing();
        int expResult = 0;
        int result = instance.getIntelligence();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setIntelligence method, of class LivingBeing.
     */
    @Test
    public void testSetIntelligence() {
        System.out.println("setIntelligence");
        int intelligence = 0;
        LivingBeing instance = new LivingBeing();
        instance.setIntelligence(intelligence);
        
    }

    /**
     * Test of getLuck method, of class LivingBeing.
     */
    @Test
    public void testGetLuck() {
        System.out.println("getLuck");
        LivingBeing instance = new LivingBeing();
        int expResult = 0;
        int result = instance.getLuck();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setLuck method, of class LivingBeing.
     */
    @Test
    public void testSetLuck() {
        System.out.println("setLuck");
        int luck = 0;
        LivingBeing instance = new LivingBeing();
        instance.setLuck(luck);
        
    }

    /**
     * Test of getCharisma method, of class LivingBeing.
     */
    @Test
    public void testGetCharisma() {
        System.out.println("getCharisma");
        LivingBeing instance = new LivingBeing();
        int expResult = 0;
        int result = instance.getCharisma();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setCharisma method, of class LivingBeing.
     */
    @Test
    public void testSetCharisma() {
        System.out.println("setCharisma");
        int charisma = 0;
        LivingBeing instance = new LivingBeing();
        instance.setCharisma(charisma);
        
    }

    /**
     * Test of getLevel method, of class LivingBeing.
     */
    @Test
    public void testGetLevel() {
        System.out.println("getLevel");
        LivingBeing instance = new LivingBeing();
        int expResult = 0;
        int result = instance.getLevel();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setLevel method, of class LivingBeing.
     */
    @Test
    public void testSetLevel() {
        System.out.println("setLevel");
        int level = 0;
        LivingBeing instance = new LivingBeing();
        instance.setLevel(level);
        
    }

    /**
     * Test of getAge method, of class LivingBeing.
     */
    @Test
    public void testGetAge() {
        System.out.println("getAge");
        LivingBeing instance = new LivingBeing();
        int expResult = 0;
        int result = instance.getAge();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setAge method, of class LivingBeing.
     */
    @Test
    public void testSetAge() {
        System.out.println("setAge");
        int age = 0;
        LivingBeing instance = new LivingBeing();
        instance.setAge(age);
        
    }

    /**
     * Test of isIsKillable method, of class LivingBeing.
     */
    @Test
    public void testIsIsKillable() {
        System.out.println("isIsKillable");
        LivingBeing instance = new LivingBeing();
        boolean expResult = false;
        boolean result = instance.isIsKillable();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setIsKillable method, of class LivingBeing.
     */
    @Test
    public void testSetIsKillable() {
        System.out.println("setIsKillable");
        boolean isKillable = false;
        LivingBeing instance = new LivingBeing();
        instance.setIsKillable(isKillable);
        
    }

    /**
     * Test of getHealth method, of class LivingBeing.
     */
    @Test
    public void testGetHealth() {
        System.out.println("getHealth");
        LivingBeing instance = new LivingBeing();
        int expResult = 0;
        int result = instance.getHealth();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setHealth method, of class LivingBeing.
     */
    @Test
    public void testSetHealth() {
        System.out.println("setHealth");
        int health = 0;
        LivingBeing instance = new LivingBeing();
        instance.setHealth(health);
        
    }

    /**
     * Test of getMana method, of class LivingBeing.
     */
    @Test
    public void testGetMana() {
        System.out.println("getMana");
        LivingBeing instance = new LivingBeing();
        int expResult = 0;
        int result = instance.getMana();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setMana method, of class LivingBeing.
     */
    @Test
    public void testSetMana() {
        System.out.println("setMana");
        int mana = 0;
        LivingBeing instance = new LivingBeing();
        instance.setMana(mana);
       
    }

    /**
     * Test of getName method, of class LivingBeing.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        LivingBeing instance = new LivingBeing();
        instance.setName("Frank");
        String expResult = "Frank";
        String result = instance.getName();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setName method, of class LivingBeing.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        LivingBeing instance = new LivingBeing();
        instance.setName(name);
        
    }
    
}
