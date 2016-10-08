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
public class ConsumableTest {
    
    public ConsumableTest() {
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
     * Test of getQuantity method, of class Consumable.
     */
    @Test
    public void testGetQuantity() {
        System.out.println("getQuantity");
        Consumable instance = new Consumable();
        int expResult = 0;
        int result = instance.getQuantity();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setQuantity method, of class Consumable.
     */
    @Test
    public void testSetQuantity() {
        System.out.println("setQuantity");
        int quantity = 0;
        Consumable instance = new Consumable();
        instance.setQuantity(quantity);
        
    }

    /**
     * Test of getSelectedType method, of class Consumable.
     */
    @Test
    public void testGetSelectedType() {
        System.out.println("getSelectedType");
        Consumable instance = new Consumable();
        Consumable.ConsumableType expResult = null;
        Consumable.ConsumableType result = instance.getSelectedType();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setSelectedType method, of class Consumable.
     */
    @Test
    public void testSetSelectedType() {
        System.out.println("setSelectedType");
        Consumable.ConsumableType selectedType = null;
        Consumable instance = new Consumable();
        instance.setSelectedType(selectedType);
        
    }
    
}
