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
public class KeyItemTest {
    
    public KeyItemTest() {
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
     * Test of isIsItKeyItem method, of class KeyItem.
     */
    @Test
    public void testIsIsItKeyItem() {
        System.out.println("isIsItKeyItem");
        KeyItem instance = new KeyItem();
        boolean expResult = false;
        boolean result = instance.isIsItKeyItem();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setIsItKeyItem method, of class KeyItem.
     */
    @Test
    public void testSetIsItKeyItem() {
        System.out.println("setIsItKeyItem");
        boolean isItKeyItem = false;
        KeyItem instance = new KeyItem();
        instance.setIsItKeyItem(isItKeyItem);
        
    }
    
}
