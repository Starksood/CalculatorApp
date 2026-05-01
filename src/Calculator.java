/**
 * Abstract base class for the generic calculator that implements basic
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

    /** The last input value supplied to an operation. */
    protected double inputValue;

    /** The running result of all operations. */
    protected double currentValue;

    /** The last operator used ('+', '-', '*', '/', '^', 'r'). */
    protected char operator;

    /**
     * Default constructor. Initializes all fields to zero, sets operator to '+',
     * precision to 2, and prints "Calculator On".
     */
    public Calculator() {
        System.out.println("Calculator On");
        clear();
    }
    /**
     * Adds the given value to the current value and updates the display.
     *
     * @param inputValue the value to add
     */
    @Override
    public void add(N inputValue) {
        operator         = '+';
        previousValue    = currentValue;
        this.inputValue  = inputValue.doubleValue();
        currentValue    += this.inputValue;
        updateDisplay();

    }

    /**
     * Subtracts the given value from the current value and updates the display.
     *
     * @param inputValue the value to subtract
     */
    @Override
    public void subtract(N inputValue) {
        operator = '-';
        previousValue = currentValue;
        this.inputValue = inputValue.doubleValue();
        currentValue -= this.inputValue;
        updateDisplay();

    }

    /**
     * Multiplies the current value by the given value and updates the display.
     *
     * @param inputValue the value to multiply by
     */
    @Override
    public void multiply(N inputValue) {
        operator = '*';
        previousValue = currentValue;
        this.inputValue = inputValue.doubleValue();
        currentValue *= this.inputValue;
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
        operator        = '/';
        previousValue   = currentValue;
        this.inputValue = inputValue.doubleValue();
        currentValue /= this.inputValue;
        updateDisplay();
    }
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
     * Displays the current calculation in a formatted layout showing
     * the previous value, operator, input value, and current result.
     * Output is formatted with 2 decimal places and thousand separators.
     */
    public void updateDisplay() {
        System.out.println();
        System.out.printf(" %,12.2f%n",  previousValue);
        System.out.printf("%1s%,12.2f%n", operator, inputValue);
        System.out.println("=============");
        System.out.printf(" %,12.2f%n", currentValue);
        System.out.println();
    }
}
