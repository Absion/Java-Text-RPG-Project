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
public class ItemTest {
    
    public ItemTest() {
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
     * Test of getItemName method, of class Item.
     */
    @Test
    public void testGetItemName() {
        System.out.println("getItemName");
        Item instance = new Item();
        instance.setItemName("POTION OF AWESOMENESS");
        String expResult = "POTION OF AWESOMENESS";
        String result = instance.getItemName();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setItemName method, of class Item.
     */
    @Test
    public void testSetItemName() {
        System.out.println("setItemName");
        String itemName = "";
        Item instance = new Item();
        instance.setItemName(itemName);
        
    }

    /**
     * Test of getItemWeight method, of class Item.
     */
    @Test
    public void testGetItemWeight() {
        System.out.println("getItemWeight");
        Item instance = new Item();
        instance.setItemWeight(70);
        Integer expResult = 70;
        Integer result = instance.getItemWeight();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setItemWeight method, of class Item.
     */
    @Test
    public void testSetItemWeight() {
        System.out.println("setItemWeight");
        Integer itemWeight = null;
        Item instance = new Item();
        instance.setItemWeight(itemWeight);
        
    }

    /**
     * Test of getItemHealth method, of class Item.
     */
    @Test
    public void testGetItemHealth() {
        System.out.println("getItemHealth");
        Item instance = new Item();
        instance.setItemHealth(0);
        Integer expResult = 0;
        Integer result = instance.getItemHealth();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setItemHealth method, of class Item.
     */
    @Test
    public void testSetItemHealth() {
        System.out.println("setItemHealth");
        Integer itemHealth = null;
        Item instance = new Item();
        instance.setItemHealth(itemHealth);
        
    }

    /**
     * Test of getItemValue method, of class Item.
     */
    @Test
    public void testGetItemValue() {
        System.out.println("getItemValue");
        Item instance = new Item();
        instance.setItemValue(1000);
        Integer expResult = 1000;
        Integer result = instance.getItemValue();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setItemValue method, of class Item.
     */
    @Test
    public void testSetItemValue() {
        System.out.println("setItemValue");
        Integer itemValue = null;
        Item instance = new Item();
        instance.setItemValue(itemValue);
        
    }

    /**
     * Test of getItemHistory method, of class Item.
     */
    @Test
    public void testGetItemHistory() {
        System.out.println("getItemHistory");
        Item instance = new Item();
        instance.setItemHistory("THIS ITEM DOES NOT EXIST");
        String expResult = "THIS ITEM DOES NOT EXIST";
        String result = instance.getItemHistory();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setItemHistory method, of class Item.
     */
    @Test
    public void testSetItemHistory() {
        System.out.println("setItemHistory");
        String itemHistory = "";
        Item instance = new Item();
        instance.setItemHistory(itemHistory);
        
    }

    

 

    /**
     * Test of getSelectedElement method, of class Item.
     */
    @Test
    public void testGetSelectedElement() {
        System.out.println("getSelectedElement");
        Item instance = new Item();
        Item.ElementType expResult = null;
        Item.ElementType result = instance.getSelectedElement();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setSelectedElement method, of class Item.
     */
    @Test
    public void testSetSelectedElement() {
        System.out.println("setSelectedElement");
        Item.ElementType selectedElement = null;
        Item instance = new Item();
        instance.setSelectedElement(selectedElement);
        
    }

    /**
     * Test of getSelectedRank method, of class Item.
     */
    @Test
    public void testGetSelectedRank() {
        System.out.println("getSelectedRank");
        Item instance = new Item();
        Item.ItemRank expResult = null;
        Item.ItemRank result = instance.getSelectedRank();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setSelectedRank method, of class Item.
     */
    @Test
    public void testSetSelectedRank() {
        System.out.println("setSelectedRank");
        Item.ItemRank selectedRank = null;
        Item instance = new Item();
        instance.setSelectedRank(selectedRank);
        
    }
    
}
