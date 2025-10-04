import java.util.Iterator;

public class FibonacciSequence implements Sequence {

    private int current = 1;
    private int previous = 0;
    private int limit;

    public FibonacciSequence(int limit) {
        this.limit = limit;
    }

    public FibonacciSequence() {
        limit = 0;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new FibonacciIterator(limit);
    }

}
