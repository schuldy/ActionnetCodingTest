
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 *
 * @author Mark
 * 
 */
public class CollectionsOne {

    public static void main(String args[]) {
        // TODO better initialization
        List<Integer> oneToTen = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        List<Integer> sixToFifteen = Arrays.asList(6,7,8,9,10,11,12,13,14,15);
        
        Collections.shuffle(oneToTen);
        Collections.shuffle(sixToFifteen);
        System.out.println("1 to 10: " + oneToTen);
        System.out.println("6 to 15: " + sixToFifteen);
        
        System.out.println("Size of 1 to 10: " + oneToTen.size());
        System.out.println("Size of 6 to 15: " + sixToFifteen.size());
                
        SortedSet<Integer> combination = new TreeSet<>(oneToTen);
        combination.addAll(sixToFifteen);
        
        // Dumb hack.  Because we KNOW this collection has 15 entries,
        // and we know each one, we know the middle element is 8.
        // NO WAY is this production code.... :-)
        combination.remove(8);
        
        // Hack again - there are more effcient ways to do this.
        System.out.println("Reverse combo: " + 
                new TreeSet<>(combination).descendingSet());
        System.out.println("Combo size: " + combination.size());
    }
    
}
