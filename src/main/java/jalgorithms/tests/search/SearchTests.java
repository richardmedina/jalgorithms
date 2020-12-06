package jalgorithms.tests.search;

import jalgorithms.common.search.SearchDelegate;
import jalgorithms.impl.search.SequentialSearch;
import org.junit.Test;

public class SearchTests {
    @Test
    public void SequentialSearchTest() {
        SearchDelegate search = new SequentialSearch();
        int value = 10;
        int[] array = new int[]{0, 1, 2, 10, 20, 30};

        int result = search.Search(value, array);

        System.out.println("Result: " + result);
    }
}
