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
public class EnemyGeneratorTest {
    
    public EnemyGeneratorTest() {
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
     * Test of createCanineMonster method, of class EnemyGenerator.
     */
    @Test
    public void testCreateCanineMonster() {
        System.out.println("createCanineMonster");
        int areaLevel = 26;
        String areaType = "TestArea";
        Monster dog = new Monster();
        dog = EnemyGenerator.createCanineMonster(areaLevel, areaType);
        System.out.println(dog.getAge() + " " + dog.getCharisma() + " " + dog.getName() + " " + dog.getSelectedRank() + " " + dog.getLevel() + " " + dog.getSelectedGender());
        
    }
    
}
