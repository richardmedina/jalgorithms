package jalgorithms.tests.collections.sets;


import jalgorithms.common.util.StopWatch;
import jalgorithms.impl.util.SimpleStopWatch;
import jalgorithms.tests.collections.CollectionTests;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;

public class HashSetTests implements CollectionTests {

    private final HashSet<String> collection;

    public HashSetTests () {
        collection = new HashSet<>();
    }

    @Override
    @Test
    public void insertionTest() {
        var watch = new SimpleStopWatch();
        watch.start();
        collection.add("Hello");
        collection.add("World");
        watch.stop();
        watch.print();
    }

    @Override
    public void deletionTest() {
        var watch = new SimpleStopWatch();
        watch.start();

        watch.stop();
        watch.print();
    }

    @Override
    public void searchTest() {

    }
}
