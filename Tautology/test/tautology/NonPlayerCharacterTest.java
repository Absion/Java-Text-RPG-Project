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
public class NonPlayerCharacterTest {
    
    public NonPlayerCharacterTest() {
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
     * Test of isIsShopKeeper method, of class NonPlayerCharacter.
     */
    @Test
    public void testIsIsShopKeeper() {
        System.out.println("isIsShopKeeper");
        NonPlayerCharacter instance = new NonPlayerCharacter();
        boolean expResult = false;
        boolean result = instance.isIsShopKeeper();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setIsShopKeeper method, of class NonPlayerCharacter.
     */
    @Test
    public void testSetIsShopKeeper() {
        System.out.println("setIsShopKeeper");
        boolean isShopKeeper = false;
        NonPlayerCharacter instance = new NonPlayerCharacter();
        instance.setIsShopKeeper(isShopKeeper);
        
    }

    /**
     * Test of isIsQuestGiver method, of class NonPlayerCharacter.
     */
    @Test
    public void testIsIsQuestGiver() {
        System.out.println("isIsQuestGiver");
        NonPlayerCharacter instance = new NonPlayerCharacter();
        boolean expResult = false;
        boolean result = instance.isIsQuestGiver();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setIsQuestGiver method, of class NonPlayerCharacter.
     */
    @Test
    public void testSetIsQuestGiver() {
        System.out.println("setIsQuestGiver");
        boolean isQuestGiver = false;
        NonPlayerCharacter instance = new NonPlayerCharacter();
        instance.setIsQuestGiver(isQuestGiver);
        
    }

    /**
     * Test of isIsEnemy method, of class NonPlayerCharacter.
     */
    @Test
    public void testIsIsEnemy() {
        System.out.println("isIsEnemy");
        NonPlayerCharacter instance = new NonPlayerCharacter();
        boolean expResult = false;
        boolean result = instance.isIsEnemy();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setIsEnemy method, of class NonPlayerCharacter.
     */
    @Test
    public void testSetIsEnemy() {
        System.out.println("setIsEnemy");
        boolean isEnemy = false;
        NonPlayerCharacter instance = new NonPlayerCharacter();
        instance.setIsEnemy(isEnemy);
        
    }
    
}
