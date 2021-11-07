package jalgorithms.tests.collections.sets;


import jalgorithms.impl.util.SimpleStopWatch;
import jalgorithms.tests.collections.CollectionTests;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;

/********
 * HashSet. It's a collection where unique values can only exists (keyz)
 * We can verify whether a certain  value exist or not
 */

public class HashSetTests implements CollectionTests {



    @Test
    @Override
    public void testInsertion() {
        // Arrange
        int expected = 2;
        HashSet<String> collection = new HashSet<>();

        // Act
        collection.add("One");
        collection.add("Two");

        // Assert
        Assert.assertEquals(expected, collection.size());
    }

    @Test
    @Override
    public void testDeletion() {
        // Arrange
        int expected = 2;
        HashSet<String> collection = new HashSet<>();
        collection.add("One");
        collection.add("Two");
        collection.add("Three");

        // Act
        collection.remove("Two");

        // Assert
        Assert.assertEquals(expected, collection.size());
    }

    @Test
    @Override
    public void testSearch() {
        // Arrange
        boolean expected = true;
        HashSet<String> collection = new HashSet<>();
        for(int val : new int []{0, 1, 2, 3, 4, 5 }) {
            collection.add(String.format("%d", val));
        }

        // Act

        boolean containsZero  = collection.contains('0');
        boolean containsThree = collection.contains('3');
        boolean containsNine = collection.contains('9');

        //Assert
        Assert.assertEquals(true, containsZero);
        Assert.assertEquals(true, containsThree);
        Assert.assertEquals(false, containsNine);
    }
}
