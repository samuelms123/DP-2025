public class FibonacciIterator implements java.util.Iterator<Integer> {

    private FibonacciSequence sequence;
    private int limit;
    private int count = 0;

    public FibonacciIterator(FibonacciSequence sequence, int limit) {
        this.sequence = sequence;
        this.limit = limit;
    }


    @Override
    public boolean hasNext() {
        return limit == 0 || count < limit;
    }

    @Override
    public Integer next() {
        count++;
        return sequence.nextNumber();
    }
}
