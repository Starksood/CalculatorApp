/**
 * Extends {@link Calculator} with memory storage operations. *
 * 
 * @param <N> a numeric type extending {@link Number}
 * @author Sanyam Sood
 * @see <a href="https://github.com/Starksood/CalculatorApp">GitHub
 *      Repository</a>
 */
public class MemoryCalc<N extends Number> extends Calculator<N> {

    /** The stored memory value. */
    protected double memoryValue;

    /**
     * Default constructor. Calls super() and initializes memoryValue to zero.
     */
    public MemoryCalc() {
        super();
        memoryClear();
    }

    /**
     * Clears only the memory field to zero and displays the updated memory value.
     */
    public void memoryClear() {
        memoryValue = 0;
        displayMemoryValue("Memory Clear");
    }

    /**
     * Adds the current calculator value to memory and displays the updated memory
     * value.
     */
    public void memoryAdd() {
        memoryValue += currentValue;
        displayMemoryValue("Memory Add");
    }

    /**
     * Subtracts the current calculator value from memory and displays the updated
     * memory value.
     */
    public void memorySubtract() {
        memoryValue -= currentValue;
        displayMemoryValue("Memory Subtract");
    }

    /**
     * Recalls the memory value into the calculator as the next input for addition,
     * prints "Using memory value", and calls add with the stored memory value.
     *
     * @return the stored memory value
     */
    public double getMemoryValue() {
        System.out.println("Using memory value");
        return memoryValue;
    }

    /**
     * Displays the memory value with a label, formatted to the current precision.
     *
     * @param phrase the label to display alongside the memory value
     */
    public void displayMemoryValue(String phrase) {
        System.out.printf("%-15s %,12.2f%n", phrase, memoryValue);
    }
}
