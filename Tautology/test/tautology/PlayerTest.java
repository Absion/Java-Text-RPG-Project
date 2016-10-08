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
public class PlayerTest {
    
    public PlayerTest() {
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
     * Test of getMoney method, of class Player.
     */
    @Test
    public void testGetMoney() {
        System.out.println("getMoney");
        Player instance = new Player();
        int expResult = 0;
        int result = instance.getMoney();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMoney method, of class Player.
     */
    @Test
    public void testSetMoney() {
        System.out.println("setMoney");
        int money = 0;
        Player instance = new Player();
        instance.setMoney(money);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
