package jalgorithms.tests.collections.lists;

import jalgorithms.tests.collections.CollectionTests;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class ArrayListTests implements CollectionTests {

    private static ArrayList<String> getPopulatedCollection() {
        ArrayList<String> collection = new ArrayList<>();

        collection.add("Two");
        collection.add("One");
        collection.add("Three");

        return collection;
    }

    @Test
    @Override
    public void testInsertion() {
        // Arrange
        int expected = 4;
        ArrayList<String> collection;

        // Act
        collection = getPopulatedCollection();
        collection.add("Four");

        //Assert
        Assert.assertEquals(expected, collection.size());
    }

    @Test
    @Override
    public void testDeletion() {
        // Arrange
        int expected = 2;
        ArrayList<String> collection = getPopulatedCollection();

        // Act
        collection.remove(0); // Removes index 2

        // Assert
        Assert.assertEquals(expected, collection.size());
    }

    @Test
    @Override
    public void testSearch() {
        // Arrange
        String expected = "One";
        int secondItemIndex = 1;
        ArrayList<String> collection = getPopulatedCollection();

        // Act
        String secondItem = collection.get(secondItemIndex);

        // Assert
        Assert.assertEquals(expected, secondItem);
    }
}
