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
    public static void main(String[] args) {

        // Create calculator — prints "Calculator On" and sets precision to 2
        AdvanceCalc<Double> calculator = new AdvanceCalc<>();

        System.out.println("Calculator Cleared");

        // --- Basic operations at precision 2 ---
        calculator.add(10.22);
        calculator.subtract(2.22);

        // Memory Add after result is 8.00
        calculator.memoryAdd();
        System.out.println();

        calculator.multiply(10.00);

        // Memory Subtract after result is 80.00
        calculator.memorySubtract();
        System.out.println();

        calculator.divide(2.00);

        // --- Switch to precision 4 ---
        calculator.setPrecisionValue(4);
        System.out.println();

        // --- Advanced operations ---
        calculator.pow(2.0);
        calculator.sqrt();

        // --- Clear memory then calculator ---
        calculator.memoryClear();
        System.out.println();
        calculator.clear();
    }
}
