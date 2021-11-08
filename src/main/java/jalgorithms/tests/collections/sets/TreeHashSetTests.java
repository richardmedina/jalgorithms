package jalgorithms.tests.collections.sets;

import jalgorithms.tests.collections.CollectionTests;
import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TreeHashSetTests implements CollectionTests {

    private static TreeSet<String> getPopulatedCollection() {
        TreeSet<String> collection = new TreeSet<>();

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
        TreeSet<String> collection;

        // Act
        collection = getPopulatedCollection();

        for(String item : collection){
            System.out.println("Item: " + item);
        }

        // Assert
        Assert.assertEquals(expected, collection.size());
    }

    @Test
    @Override
    public void testRemove() {
        // Arrange
        int expected = 2;
        TreeSet<String> collection = getPopulatedCollection();

        // Act
        collection.remove("Two");

        // Assert
        Assert.assertEquals(expected, collection.size());
    }

    @Test
    @Override
    public void testSearch() {
        // Arrange
        TreeSet<String> collection = getPopulatedCollection();

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
