/**
 * Interface defining advanced math operations for a calculator.
 *
 * @param <N> a numeric type extending {@link Number}
 * @author [Your Full Name]
 * @see <a href="https://github.com/[your-repo]">GitHub Repository</a>
 */
public interface AdvanceMath<N extends Number> {

    /**
     * Takes the square root of the current value.
     */
    void sqrt();

    /**
     * Raises the current value to the power of the given value.
     *
     * @param inputValue the exponent
     */
    void pow(N inputValue);
}
