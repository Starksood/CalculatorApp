/**
 *
 * @param <N> a numeric type extending {@link Number}
 * @author Sanyam Sood
 * @see <a href="https://github.com/Starksood/CalculatorApp">GitHub
 *      Repository</a>
 */
public class AdvanceCalc<N extends Number> extends MemoryCalc<N> implements AdvanceMath<N> {

    /**
     * Default constructor. Sets precision to 2 decimal places.
     */
    public AdvanceCalc() {
        super();
    }

    /**
     * Constructor that sets a custom precision value.
     *
     * @param precisionValue the number of decimal places (0–10)
     */
    public AdvanceCalc(int precisionValue) {
        super();
        setPrecisionValue(precisionValue);
    }

    /**
     * Sets the display precision. Only values between 0 and 10 (inclusive) are
     * accepted;
     * values outside this range are silently ignored.
     * Prints a message confirming the new precision.
     *
     * @param precisionValue the desired number of decimal places (0–10)
     */
    public void setPrecisionValue(int precisionValue) {
        this.precision = precisionValue;
    }

    /**
     * Returns the current precision setting.
     *
     * @return the number of decimal places used for display
     */
    public int getPrecisionValue() {
        return precision;
    }

    // -------------------------------------------------------------------------
    // AdvanceMath interface implementation
    // -------------------------------------------------------------------------

    /**
     * Takes the square root of the current value and updates the display.
     * Prints an error and returns without changing the value if currentValue is
     * negative.
     */
    @Override
    public void sqrt() {
        previousValue = currentValue;
        inputValue = 0.0;
        currentValue = Math.sqrt(currentValue);
        operator = 'r';
        updateDisplay();
    }

    /**
     * Raises the current value to the power of the given exponent and updates the
     * display.
     *
     * @param inputValue the exponent to raise the current value to
     */
    @Override
    public void pow(N inputValue) {
        previousValue = currentValue;
        this.inputValue = inputValue.doubleValue();
        currentValue = Math.pow(currentValue, inputValue.doubleValue());
        operator = '^';
        updateDisplay();
    }

    // -------------------------------------------------------------------------
    // Display overrides
    // -------------------------------------------------------------------------

    /**
     * Prints the last operation and result formatted to the current precision,
     * using a sqrt symbol for the 'r' operator.
     */
    @Override
    public void updateDisplay() {
        System.out.println("=============");
        System.out.printf(currentValue);
        System.out.println();
    }

    /**
     * Displays the memory value with a label, formatted to the current precision.
     *
     * @param phrase the label to display alongside the memory value
     */
    @Override
    public void displayMemoryValue(String phrase) {
        System.out.printf(phrase, memoryValue);
    }

    /**
     * Displays the memory value with the default label "Memory Value".
     */
    @Override
    public void displayMemoryValue() {
        displayMemoryValue("Memory Value");
    }
}
