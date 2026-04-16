public class AdvanceCalc<N extends Number> extends MemoryCalc implements AdvanceMath<N>{
    public int precisionValue;

    public AdvanceCalc() {
        super();
        precisionValue = 4;
    }

    public AdvanceCalc(int precisionValue) {
        super();
        this.precisionValue = precisionValue;
        updateDisplay();
    }

    @Override
    public void sqrt() {
        if (currentValue < 0) {
            System.out.println("Error: Cannot take square root of a negative number ");
            return;
        }
        previousValue = currentValue;
        inputValue = 0.0;
        currentValue = Math.sqrt(currentValue);
        operator = 'r';
        updateDisplay();

    }

    @Override
    public void pow(N inputValue) {
        precisionValue = currentValue;
        inputValue = n;
        currentValue = Math.pow(currentValue, n);
        operator = '^';
        updateDisplay();

    }

    @Override
    public void updateDisplay(){
        System.out.printf("Current Value: " + currentValue);

    }

    @Override
    public void displayMemoryValue(){
        System.out.printf("Memory Value: " + memoryValue);
    }

}
