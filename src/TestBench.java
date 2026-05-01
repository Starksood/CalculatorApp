/**
 * Test driver for the Calculator application.
 * Exercises basic arithmetic, memory operations, and advanced math
 * to verify correct output at each stage.
 *
 * @author Sanyam Sood
 * @see <a href="https://github.com/Starksood/CalculatorApp">GitHub
 *      Repository</a>
 */
public class TestBench {
    /**
     * Main method that tests the AdvanceCalc calculator functionality.
     * Performs a sequence of operations including:
     * <ul>
     *   <li>Basic arithmetic (add, subtract, multiply, divide)</li>
     *   <li>Memory operations (memoryAdd, memorySubtract, memoryClear)</li>
     *   <li>Advanced operations (power, square root)</li>
     *   <li>Precision configuration</li>
     * </ul>
     *
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {
        AdvanceCalc advCalc = new AdvanceCalc();
        advCalc.add(10.22);
        advCalc.subtract(5);
        advCalc.memoryAdd();
        advCalc.multiply(3);
        advCalc.memorySubtract();
        advCalc.divide(4);
        advCalc.setPrecision(4);
        advCalc.pow(2);
        advCalc.sqrt();
        advCalc.add(advCalc.getMemoryValue());
        advCalc.memoryClear();
        advCalc.clear();


    }
}
