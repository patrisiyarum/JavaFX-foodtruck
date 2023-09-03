/**
 * Represents a program that is a IllegalQuantityException.
 *
 * @author prumyantseva3
 * @version 13.31
 */
public class IllegalQuantityException extends Exception {
    /**
     * Creates a IllegalQuantityException with all required parameters.
     *
     * @param s the text of the TextField
     */
    public IllegalQuantityException(String s) {
        super("Quantity " + s + " is not a number.");

    }

}