
import java.util.HashMap;

/**
 *
 * @author Mark
 */
public class CollectionTwo {

    /*
     * I chose HashMap for this, because:
     * 1. None of the specialty map types seemed appropriate.
     * 2. This collection is small, and the data strings are small (so no
     *    need for balanced trees.)
     * 3. I didn't require any linked element capabilities (no LinkedHashMap)
     * 4. No concerns about threading.
     *
     * There are no tests associated with this code - it self-tests.
    */
    public static void main(String[] args) {
        
        // Create the initial collection.
        HashMap<String, String> collection = new HashMap();
        collection.put("Apple", "Red");
        collection.put("Orange", "Orange");
        collection.put("Banana", "Yellow");
        collection.put("Plum", "Purple");
        collection.put("Lime", "Green");
        
        // Attempt to add a duplicate key value, and print if it was found.
        if (collection.containsKey("Plum")) {
            System.out.println("Collection contained key "+ "Plum");
            System.out.println("Value is: " + collection.get("Plum"));
        }
        
        // Let's iterate, instead of cheating with println
        // But functional code is overkill for this....
        System.out.println("Full Collection Contents");
        for (String key: collection.keySet()) {
            System.out.println( key + ":" + collection.get(key));
        }
        System.out.println("Collection Size is: " + collection.size());
    }
 }
