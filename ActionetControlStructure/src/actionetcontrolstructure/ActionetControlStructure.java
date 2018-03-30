package actionetcontrolstructure;

/**
 *
 * @author Mark
 */
public class ActionetControlStructure {

    /**
     * @author Mark
     * @param args - the max single digit to use
     */
    public static void main(String[] args) {
        if (args.length != 1) {
            throw new IllegalArgumentException(
                    "Requires 1 single digit argument");
        }
        
        // The default exception for illegal values is fine for now
        int max = Integer.parseInt(args[0]);
        
        if (max>9) 
            throw new IllegalArgumentException(
                    "Requires 1 single digit argument");

        printRoutine(max);
    }
    /*
     * Basically, we generate inteers and use the xCoord and yCoord
     * operators to determine what row we are on and what
     * character to print.  Essentially I generate X/Y coordinates.
     *
     * This would be far more fun with mapping functions but I
     * wanted to just get something done quickly.
    */
    private static void printRoutine(int max) {
        // Total characters to print is the square of max...
        for (int i=0; i<(max*max); i++) {
            int xCoord = i % max +1;       // X value on the number line
            int yCoord = (i / max) + 1;    // row we are on
            
            // If you consider an if statement a "Control Structure"
            // then I could have used a nested ternary operator -
            // but I consider that to be an obfuscated if statement...
            if (xCoord <= (max-yCoord)) {
                System.out.print(".");
            } else if ( xCoord < max) {
                System.out.print(yCoord);      // No newline
            } else {
                System.out.println(yCoord);    // newline
            }
        }
    }
}
