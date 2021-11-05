package jalgorithms.tests.customalgorithms;

import jalgorithms.impl.customalgorithms.binarysum.BinarySumAlgorithm;
import jalgorithms.impl.customalgorithms.binarysum.BinarySumParams;
import org.junit.Test;

public class BinarySumTests {

    @Test
    public void testBinarySum(){
        var params = new BinarySumParams("10","01");
        var algo = new BinarySumAlgorithm();

        var result = algo.run(params);
        System.out.println("Result: " + result);
    }
}
