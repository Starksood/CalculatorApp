public abstract class Calculator <N extends Number> implements BasicMath<N> {
    protected double previousValue;
    protected double currentValue;
    protected double inputValue;
    protected char operator;

    public Calculator() {
        System.out.println();
    }


}
