package jalgorithms.tests.customalgorithms.smallest;

import jalgorithms.common.customalgorithms.CustomAlgorithm;
import jalgorithms.impl.customalgorithms.smallest.SmallestInArrayAlgorithm;
import jalgorithms.impl.customalgorithms.smallest.SmallestInArrayParams;
import org.junit.Test;

public class SmallestInArrayTests {
    @Test
    public void smallestInArray(){
        SmallestInArrayParams params = new SmallestInArrayParams(
            new int[]{ 10, 100, 20, 200, 1000, 800, 1, 10000}
        );

        var algorithm = new SmallestInArrayAlgorithm();
        var result = algorithm.run(params);

        System.out.println("Result: " + result);
    }
}
