package jalgorithms.tests.collections.sets;

import jalgorithms.tests.collections.CollectionTests;
import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedHashSet;

/****
 * LinkedHashSet. It's a collection where unique value can exists keeping the insertion order
 * We can verify whether a certain  value exist or not
 * Add. collection.add(obj);
 * Delete. collection.delete(obj)
 * Search.
 *  We can use collection.contains(obj) to get whether a certain item exist or not in collection
 */
public class LinkedHashSetTests implements CollectionTests {

    private static LinkedHashSet<String> getPopulatedCollection() {
        LinkedHashSet<String> collection = new LinkedHashSet<>();

        collection.add("Two");
        collection.add("One");
        collection.add("Three");

        return collection;
    }

    @Test
    @Override
    public void testInsertion() {
        // Arrange
        int expected = 3;
        LinkedHashSet<String> collection;

        // Act
        collection = getPopulatedCollection();

        for(String item : collection){
            System.out.println("Item: " + item);
        }

        // Assert
        Assert.assertEquals(expected, collection.size());
    }

    @Override
    public void testDeletion() {
        // Arrange
        int expected = 2;
        LinkedHashSet<String> collection = getPopulatedCollection();

        //Act
        collection.remove("Two");

        // Assert
        Assert.assertEquals(expected, collection);
    }

    @Test
    @Override
    public void testSearch() {
        // Arrange
        LinkedHashSet<String> collection = getPopulatedCollection();

        // Act
        boolean oneExists = collection.contains("One");
        boolean twoExists = collection.contains("Two");
        boolean nineExists = collection.contains("Nine");

        // Assert
        Assert.assertEquals(true, oneExists);
        Assert.assertEquals(true, twoExists);
        Assert.assertEquals(false, nineExists);

    }
}
