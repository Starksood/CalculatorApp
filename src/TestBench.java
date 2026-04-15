public class TestBench {
    public static void main(String[] args) {
        MemoryCalc c = new MemoryCalc();
        c.add(10.22);
        c.subtract(2.22);
        c.multiply(10);
        c.divide(2);
        c.memoryClear();
        c.clear();
        c.add(c.getMemoryValue());

    }
}
