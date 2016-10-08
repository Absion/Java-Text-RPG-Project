package tautology;

import java.util.*;

/**
 *
 * @author Absion
 */
public class Humanoid extends LivingBeing {
    
    private String history;
    
    private enum Class{
        WARRIOR, MARKSMAN, CLERIC, 
        ROUGE, MAGICIAN, MERCENARY, 
        SOLDIER, PUGILIST, MERCHANT,
        CHILD, ELDER
    }
    private Class selectedClass;
    
    private enum HumanType{
        HUMAN, BEASTMAN, ELF, FAIRY
    }
    private HumanType selectedHumanType;
    
    LinkedList<Item> inventory;
    LinkedList<Item> equipped;
    
}
