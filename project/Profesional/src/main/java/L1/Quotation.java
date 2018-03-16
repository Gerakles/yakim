package L1;
/**
 * Worker class for L1
 *@author Yakim
 */

public class Quotation {
    /**
     * Displays author's name and quotation on the new line with indent
     * @param author name of the author
     * @param quatation text on the quatation
     */
    public static void displayquat(String author, String quatation) {
        System.out.println( author + " says:\n\t'" + quatation + "'." ); //display quatation on a new line with indent
    }
}
