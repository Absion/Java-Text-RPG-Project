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
public class ItemGeneratorTest {
    
    public ItemGeneratorTest() {
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
     * Test of createLegendaryWeapon method, of class ItemGenerator.
     */
    @Test
    public void testCreateLegendaryWeapon() {
        System.out.println("createLegendaryWeapon");
        int areaLevel = 20;
        Weapon testWeapon = new Weapon();
        testWeapon = ItemGenerator.createLegendaryWeapon(areaLevel);
        
        System.out.println(testWeapon.getItemHistory() + "\n " + testWeapon.getItemName() + "\n " + testWeapon.getSelectedElement() + "\n " + testWeapon.getWeaponClassification());
    }
    
}
