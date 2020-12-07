package jalgorithms.impl.search;

import jalgorithms.common.search.SearchDelegate;

public class SequentialSearch implements SearchDelegate {
    public int search(int value, int[] array) {
        int index = 0;
        for(int val : array) {
            if (value == val) return index;
            index ++;
        }
        return -1;
    }
}
