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
public class MonsterTest {
    
    public MonsterTest() {
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
     * Test of getSelectedRank method, of class Monster.
     */
    @Test
    public void testGetSelectedRank() {
        System.out.println("getSelectedRank");
        Monster instance = new Monster();
        Monster.MonsterRank expResult = null;
        Monster.MonsterRank result = instance.getSelectedRank();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setSelectedRank method, of class Monster.
     */
    @Test
    public void testSetSelectedRank() {
        System.out.println("setSelectedRank");
        Monster.MonsterRank selectedRank = null;
        Monster instance = new Monster();
        instance.setSelectedRank(selectedRank);
        
    }

    /**
     * Test of getSelectedType method, of class Monster.
     */
    @Test
    public void testGetSelectedType() {
        System.out.println("getSelectedType");
        Monster instance = new Monster();
        Monster.MonsterType expResult = null;
        Monster.MonsterType result = instance.getSelectedType();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setSelectedType method, of class Monster.
     */
    @Test
    public void testSetSelectedType() {
        System.out.println("setSelectedType");
        Monster.MonsterType selectedType = null;
        Monster instance = new Monster();
        instance.setSelectedType(selectedType);
        
    }
    
}
