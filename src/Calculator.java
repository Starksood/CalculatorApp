public abstract class Calculator <N extends Number> implements BasicMath<N> {
    protected double previousValue;
    protected double currentValue;
    protected double inputValue;
    protected char operator;

    public Calculator() {
        previousValue = 0;
        inputValue = 0;
        currentValue = 0;
        operator = '+';
    }

    @Override
    public void add(N inputValue) {
        previousValue = currentValue;
        inputValue = N;
        currentValue += N;
        operator = '+';
        updateDisplay();
    }

    @Override
    public void subtract(N inputValue) {
        previousValue = currentValue;
        inputValue = N;
        currentValue -= N;
        operator = '-';
        updateDisplay();
    }

    @Override
    public void multiply(N inputValue) {
        previousValue = currentValue;
        inputValue = N;
        currentValue *= N;
        operator = '*';
        updateDisplay();
    }

    @Override
    public void divide(N inputValue) {
        previousValue = currentValue;
        inputValue = N;
        operator = '/';
        if (N == 0.0) {
            System.out.println("Error: Cannot Divide by zero");
            return;
        }
        currentValue /= N;
        updateDisplay();
    }



    public void clear() {
        previousValue = 0;
        currentValue = 0;
        operator = '+';
        inputValue = 0;
        updateDisplay();
        System.out.println("Calculator Clear");
    }

    public void updateDisplay() {
        System.out.println("Current Value: " + currentValue);
    }

}
