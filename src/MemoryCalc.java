public class MemoryCalc extends Calculator {
    protected double memoryValue;

    public MemoryCalc() {
        super();
    }

    public void memoryClear() {
        memoryValue = 0;
        displayMemoryValue("Memory Clear");
    }

    public void memoryAdd() {
        memoryValue += currentValue;
        displayMemoryValue("Memory Add");
    }

    public void memorySubtract() {
        memoryValue -= currentValue;
        displayMemoryValue("Memory Subtract");
    }

    public double getMemoryValue() {
        System.out.println("Using Memory Value");
        return memoryValue;
    }

    public void displayMemoryValue(String phrase) {
        System.out.printf("%-15s %,12.2f%n", phrase, memoryValue);
    }





}
