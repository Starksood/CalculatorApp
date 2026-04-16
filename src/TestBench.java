public class TestBench {
    public static void main(String[] args) {
        AdvanceCalc calculator = new AdvanceCalc();

        System.out.println("=== Basic operations ===");
        calculator.add(10);
        calculator.subtract(3);
        calculator.multiply(5);
        calculator.divide(7);

        System.out.println("\n=== Memory operations ===");
        calculator.memoryAdd();
        calculator.displayMemoryValue();
        calculator.add(2.5);
        calculator.memoryAdd();
        calculator.displayMemoryValue();

        System.out.println("\n=== Advanced operations ===");
        calculator.setPrecisionValue(4);
        calculator.pow(2);
        calculator.sqrt();

        System.out.println("\n=== Clear memory and calculator ===");
        calculator.memoryClear();
        calculator.displayMemoryValue();
        calculator.clear();
    }

    }