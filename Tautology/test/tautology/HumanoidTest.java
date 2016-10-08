package tautology;

import java.util.LinkedList;
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
public class HumanoidTest {
    
    public HumanoidTest() {
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
     * Test of getHistory method, of class Humanoid.
     */
    @Test
    public void testGetHistory() {
        System.out.println("getHistory");
        Humanoid instance = new Humanoid();
        instance.setHistory("this is a story about a girl");
        String expResult = "this is a story about a girl";
        String result = instance.getHistory();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setHistory method, of class Humanoid.
     */
    @Test
    public void testSetHistory() {
        System.out.println("setHistory");
        String history = "";
        Humanoid instance = new Humanoid();
        instance.setHistory(history);
        
    }

    /**
     * Test of getSelectedClass method, of class Humanoid.
     */
    @Test
    public void testGetSelectedClass() {
        System.out.println("getSelectedClass");
        Humanoid instance = new Humanoid();
        Humanoid.Class expResult = null;
        Humanoid.Class result = instance.getSelectedClass();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setSelectedClass method, of class Humanoid.
     */
    @Test
    public void testSetSelectedClass() {
        System.out.println("setSelectedClass");
        Humanoid.Class selectedClass = null;
        Humanoid instance = new Humanoid();
        instance.setSelectedClass(selectedClass);
        
    }

    /**
     * Test of getSelectedHumanType method, of class Humanoid.
     */
    @Test
    public void testGetSelectedHumanType() {
        System.out.println("getSelectedHumanType");
        Humanoid instance = new Humanoid();
        Humanoid.HumanType expResult = null;
        Humanoid.HumanType result = instance.getSelectedHumanType();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setSelectedHumanType method, of class Humanoid.
     */
    @Test
    public void testSetSelectedHumanType() {
        System.out.println("setSelectedHumanType");
        Humanoid.HumanType selectedHumanType = null;
        Humanoid instance = new Humanoid();
        instance.setSelectedHumanType(selectedHumanType);
        
    }

    /**
     * Test of getInventory method, of class Humanoid.
     */
    @Test
    public void testGetInventory() {
        System.out.println("getInventory");
        Humanoid instance = new Humanoid();
        LinkedList<Item> expResult = null;
        LinkedList<Item> result = instance.getInventory();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setInventory method, of class Humanoid.
     */
    @Test
    public void testSetInventory() {
        System.out.println("setInventory");
        LinkedList<Item> inventory = null;
        Humanoid instance = new Humanoid();
        instance.setInventory(inventory);
        
    }

    /**
     * Test of getEquipped method, of class Humanoid.
     */
    @Test
    public void testGetEquipped() {
        System.out.println("getEquipped");
        Humanoid instance = new Humanoid();
        LinkedList<Item> expResult = null;
        LinkedList<Item> result = instance.getEquipped();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setEquipped method, of class Humanoid.
     */
    @Test
    public void testSetEquipped() {
        System.out.println("setEquipped");
        LinkedList<Item> equipped = null;
        Humanoid instance = new Humanoid();
        instance.setEquipped(equipped);
        
    }
    
}
