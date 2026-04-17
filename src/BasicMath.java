/**
 * Interface defining basic arithmetic operations for a calculator.
 *
 * @param <N> a numeric type extending {@link Number}
 * @author [Your Full Name]
 * @see <a href="https://github.com/[your-repo]">GitHub Repository</a>
 */
public interface BasicMath<N extends Number> {

    /**
     * Adds the given value to the current value.
     *
     * @param inputValue the value to add
     */
    void add(N inputValue);

    /**
     * Subtracts the given value from the current value.
     *
     * @param inputValue the value to subtract
     */
    void subtract(N inputValue);

    /**
     * Multiplies the current value by the given value.
     *
     * @param inputValue the value to multiply by
     */
    void multiply(N inputValue);

    /**
     * Divides the current value by the given value.
     *
     * @param inputValue the value to divide by
     */
    void divide(N inputValue);
}
