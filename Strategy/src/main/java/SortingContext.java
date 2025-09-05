import Algorithms.SortingStrategy;

import java.util.ArrayList;
import java.util.List;

public class SortingContext {
    private SortingStrategy algorithm;

    public SortingStrategy getAlgorithm() {
        return algorithm;
    }

    public void setAlgorithm(SortingStrategy algorithm) {
        this.algorithm = algorithm;
    }

    public void sort(ArrayList<Integer> list) {
        algorithm.sort(list);
    }
}
