/**
 * Advanced calculator that extends {@link MemoryCalc} with advanced mathematical
 * operations and configurable precision. Implements {@link AdvanceMath} to provide
 * power and square root operations.
 *
 * @param <N> a numeric type extending {@link Number}
 * @author Sanyam Sood
 * @see <a href="https://github.com/Starksood/CalculatorApp">GitHub
 *      Repository</a>
 */
public class AdvanceCalc<N extends Number> extends MemoryCalc<N> implements AdvanceMath<N> {

    /** The number of decimal places for display formatting (0-10). */
    protected int precision;

    /**
     * Default constructor. Initializes the calculator with a precision of 4 decimal places.
     */
    public AdvanceCalc() {
        setPrecision(4);
    }

    /**
     * Sets the display precision for calculation results.
     *
     * @param precision the number of decimal places to display (must be between 0 and 10)
     * @throws IllegalArgumentException if precision is less than 0 or greater than 10
     */
    public void setPrecision(int precision) {
        if (precision < 0 || precision > 10)
            throw new IllegalArgumentException("Precision must be between 0 and 10");
        this.precision = precision;
        System.out.println("Calculator Precision is " + precision + " decimal places.");
    }



    /**
     * Calculates the square root of the current value and updates the display.
     * Uses the square root symbol (√) as the operator.
     */
    @Override
    public void sqrt() {
        operator = '\u221A';
        previousValue = currentValue;
        inputValue = 0.0;
        currentValue = Math.sqrt(this.currentValue);
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
        operator = '^';
        previousValue = currentValue;
        this.inputValue = inputValue.doubleValue();
        currentValue = Math.pow(this.currentValue, this.inputValue);
        updateDisplay();
    }
    /**
     * Displays the current calculation in a formatted layout with configurable precision.
     * Shows the previous value, operator, input value, and current result.
     * Special formatting is applied for the square root operator (√).
     * Output is formatted with the current precision setting and thousand separators.
     */
    @Override
    public void updateDisplay() {
        String format1 = " %,12." + precision + "f%n";
        String format2 = "%1s%,12." + precision + "f%n";

        if (operator == '\u221A') {
            System.out.printf(format2, operator, previousValue);
        } else {
            System.out.printf(format1, previousValue);
            System.out.printf(format2, operator, inputValue);
        }
        System.out.println("=============");
        System.out.printf(format1, currentValue);
        System.out.println();
    }

    /**
     * Displays the memory value with a label, formatted to the current precision.
     *
     * @param phrase the label to display alongside the memory value
     */
    @Override
    public void displayMemoryValue(String phrase) {
        String format = "%-15s %,12." + precision + "f%n";
        System.out.printf(format, phrase, memoryValue);
    }

}
