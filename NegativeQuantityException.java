/**
 * Represents a program that is a NegativeQuantityException.
 *
 * @author prumyantseva3
 * @version 13.31
 */
public class NegativeQuantityException extends RuntimeException {
    /**
     * Creates a NegativeQuantityException with all required parameters.
     *
     * @param s the text of the TextField
     */
    public NegativeQuantityException(String s) {
        super("Quantity " + s + " is not positive.");
    }
}