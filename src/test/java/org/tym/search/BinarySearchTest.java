package org.tym.search;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by tangym on 2016/11/2.
 */
public class BinarySearchTest {
    @Test
    public void find() throws Exception {
        final int[] values = {1, 3, 4, 8, 20, 34, 56, 90};
        final int key1 = 20;
        final int key2 = 78;
        final int key3 = 56;

        Assert.assertEquals(4, BinarySearch.find(values, key1));
        Assert.assertEquals(-1, BinarySearch.find(values, key2));
        Assert.assertEquals(6, BinarySearch.find(values, key3));

        Assert.assertEquals(4, BinarySearch.findWithRecurse(values, key1));
        Assert.assertEquals(-1, BinarySearch.findWithRecurse(values, key2));
        Assert.assertEquals(6, BinarySearch.findWithRecurse(values, key3));
    }

}