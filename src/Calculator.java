/**
 * Abstract base class for a generic calculator that implements basic
 * arithmetic.
 *
 * @param <N> a numeric type extending {@link Number}
 * @author Sanyam Sood
 * @see <a href="https://github.com/Starksood/CalculatorApp">GitHub
 *      Repository</a>
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

    /**
     * Default constructor. Initializes all fields to zero, sets operator to '+',
     * precision to 2, and prints "Calculator On".
     */
    public Calculator() {
        previousValue = 0;
        inputValue    = 0;
        currentValue  = 0;
        operator      = '+';
        System.out.println("Calculator On");
    }-----------------------------------------------------------------------

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
    }

    /**
     * Subtracts the given value from the current value and updates the display.
     *
     * @param inputValue the value to subtract
     */
    @Override
    public void subtract(N inputValue) {
        previousValue = currentValue;
        this.inputValue = inputValue.doubleValue();
        currentValue -= inputValue.doubleValue();
        operator = '-';
    }

    /**
     * Multiplies the current value by the given value and updates the display.
     *
     * @param inputValue the value to multiply by
     */
    @Override
    public void multiply(N inputValue) {
        previousValue = currentValue;
        this.inputValue = inputValue.doubleValue();
        currentValue *= inputValue.doubleValue();
        operator = '*';
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
        currentValue /= inputValue.doubleValue();
    }-----------------------------------------------------------------------

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

    public void displayValue() {
        System.out.println("Previous Value: " + previousValue);
        System.out.println("Current Value: " + currentValue);
        System.out.println("Input Value: " + inputValue);
        System.out.println("Operator: " + operator);
    }
}
