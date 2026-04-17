/**
 * Abstract base class for a generic calculator that implements basic arithmetic.
 * Stores the current value, previous value, last input, and last operator.
 * Prints "Calculator On" when instantiated and formats output using precision.
 *
 * @param <N> a numeric type extending {@link Number}
 * @author [Your Full Name]
 * @see <a href="https://github.com/[your-repo]">GitHub Repository</a>
 */
public abstract class Calculator<N extends Number> implements BasicMath<N> {

    /** The value before the last operation. */
    protected double previousValue;

    /** The running result of all operations. */
    protected double currentValue;

    /** The last input value supplied to an operation. */
    protected double inputValue;

    /** The last operator used ('+', '-', '*', '/', '^', 'r'). */
    protected char operator;

    /** Number of decimal places used when displaying values. */
    protected int precision;

    /**
     * Default constructor. Initializes all fields to zero, sets operator to '+',
     * precision to 2, and prints "Calculator On".
     */
    public Calculator() {
        previousValue = 0;
        inputValue    = 0;
        currentValue  = 0;
        operator      = '+';
        precision     = 2;
        System.out.println("Calculator On");
    }

    // -------------------------------------------------------------------------
    // BasicMath interface implementation
    // -------------------------------------------------------------------------

    /**
     * Adds the given value to the current value and updates the display.
     *
     * @param inputValue the value to add
     */
    @Override
    public void add(N inputValue) {
        previousValue    = currentValue;
        this.inputValue  = inputValue.doubleValue();
        currentValue    += inputValue.doubleValue();
        operator         = '+';
        updateDisplay();
    }

    /**
     * Subtracts the given value from the current value and updates the display.
     *
     * @param inputValue the value to subtract
     */
    @Override
    public void subtract(N inputValue) {
        previousValue    = currentValue;
        this.inputValue  = inputValue.doubleValue();
        currentValue    -= inputValue.doubleValue();
        operator         = '-';
        updateDisplay();
    }

    /**
     * Multiplies the current value by the given value and updates the display.
     *
     * @param inputValue the value to multiply by
     */
    @Override
    public void multiply(N inputValue) {
        previousValue    = currentValue;
        this.inputValue  = inputValue.doubleValue();
        currentValue    *= inputValue.doubleValue();
        operator         = '*';
        updateDisplay();
    }

    /**
     * Divides the current value by the given value and updates the display.
     * Prints an error and returns without changing the current value if dividing by zero.
     *
     * @param inputValue the value to divide by
     */
    @Override
    public void divide(N inputValue) {
        previousValue   = currentValue;
        this.inputValue = inputValue.doubleValue();
        operator        = '/';
        if (inputValue.doubleValue() == 0.0) {
            System.out.println("Error: Cannot divide by zero");
            return;
        }
        currentValue /= inputValue.doubleValue();
        updateDisplay();
    }

    // -------------------------------------------------------------------------
    // Utility methods
    // -------------------------------------------------------------------------

    /**
     * Clears all numeric fields (currentValue, previousValue, inputValue) to zero,
     * resets the operator to '+', and prints "Calculator Cleared".
     */
    public void clear() {
        previousValue = 0;
        currentValue  = 0;
        operator      = '+';
        inputValue    = 0;
        System.out.println("\nCalculator Cleared");
    }

    /**
     * Prints the last operation and result in a formatted ledger style, e.g.:
     * <pre>
     *      10.22
     * +     2.00
     * ==========
     *      12.22
     * </pre>
     * Subclasses may override to apply precision formatting.
     */
    public void updateDisplay() {
        String numFmt = "%," + (precision + 10) + "." + precision + "f%n";
        String opFmt  = "%-1c%," + (precision + 9) + "." + precision + "f%n";
        System.out.printf(numFmt, previousValue);
        System.out.printf(opFmt, operator, inputValue);
        System.out.println("=============");
        System.out.printf(numFmt, currentValue);
        System.out.println();
    }
}
