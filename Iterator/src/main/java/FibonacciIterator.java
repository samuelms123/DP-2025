public class FibonacciIterator implements java.util.Iterator<Integer> {

    private int limit;
    private int count = 0;
    private int current = 1;
    private int previous = 0;

    // Fibonacci state implemented in the Iterator itself
    // This ensures that each iterator created from the same sequence is independent

    public FibonacciIterator(int limit) {
        this.limit = limit;
    }


    @Override
    public boolean hasNext() {
        return limit == 0 || count < limit;
    }

    @Override
    public Integer next() {
        count++;

        int next = previous + current;
        previous = current;
        current = next;
        return previous;
    }
}
