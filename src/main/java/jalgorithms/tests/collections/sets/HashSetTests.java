package jalgorithms.tests.collections.sets;

import jalgorithms.tests.collections.CollectionTests;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;

/********
 * HashSet. It's a collection where unique values can only exists (keys)
 * We can verify whether a certain  value exist or not
 * Add. collection.add(obj);
 * Delete. collection.delete(obj)
 * Search.
 *  We can use collection.contains(obj) to get whether a certain item exist or not in collection
 */

public class HashSetTests implements CollectionTests {
    private static HashSet<String> getPopulatedCollection() {
        HashSet<String> collection = new HashSet<>();

        collection.add("Two");
        collection.add("One");
        collection.add("Three");

        return collection;
    }

    @Test
    @Override
    public void testAdd() {
        // Arrange
        int expected = 3;
        HashSet<String> collection;

        // Act
        collection = getPopulatedCollection();

        // Assert
        Assert.assertEquals(expected, collection.size());
    }

    @Test
    @Override
    public void testRemove() {
        // Arrange
        int expected = 2;
        HashSet<String> collection = getPopulatedCollection();

        for(String item : collection) {
            System.out.println("Item: " + item);
        }

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
        HashSet<String> collection = getPopulatedCollection();

        // Act
        boolean containsOne  = collection.contains("One");
        boolean containsTwo = collection.contains("Two");
        boolean containsNine = collection.contains("Nine");

        //Assert
        Assert.assertEquals(true, containsOne);
        Assert.assertEquals(true, containsTwo);
        Assert.assertEquals(false, containsNine);
    }
}
