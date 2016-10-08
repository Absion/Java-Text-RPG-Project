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
public class WeaponTest {
    
    public WeaponTest() {
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
     * Test of getDamage method, of class Weapon.
     */
    @Test
    public void testGetDamage() {
        System.out.println("getDamage");
        Weapon instance = new Weapon();
        int expResult = 0;
        int result = instance.getDamage();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDamage method, of class Weapon.
     */
    @Test
    public void testSetDamage() {
        System.out.println("setDamage");
        int damage = 0;
        Weapon instance = new Weapon();
        instance.setDamage(damage);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getWeaponClassification method, of class Weapon.
     */
    @Test
    public void testGetWeaponClassification() {
        System.out.println("getWeaponClassification");
        Weapon instance = new Weapon();
        Weapon.WeaponClass expResult = null;
        Weapon.WeaponClass result = instance.getWeaponClassification();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setWeaponClassification method, of class Weapon.
     */
    @Test
    public void testSetWeaponClassification() {
        System.out.println("setWeaponClassification");
        Weapon.WeaponClass weaponClassification = null;
        Weapon instance = new Weapon();
        instance.setWeaponClassification(weaponClassification);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
