package org.tym.practice.ch1;

import org.tym.search.BinarySearch;

/**
 * Created by tangym on 2016/11/3.
 */
public class Q_1_1_22 {

    public static void main(String[] args) {
        final int[] values = {1, 3, 4, 8, 20, 34, 56, 90};
        final int key = 20;
        findWithRecurse(values, key);
    }

    public static int findWithRecurse(int[] values, int key) {
        return findWithRecurse(values, key, 0, values.length - 1, 0);
    }

    private static int findWithRecurse(int[] values, int key, int l, int r, int level) {
        for (int i = 0; i < level; i++) {
            System.out.print("\t");
        }
        System.out.println("rank(" + l + "," + r + ")");

        if (l > r) {
            return -1;
        }
        int mid = l + (r - l) / 2;
        if (values[mid] > key) {
            return findWithRecurse(values, key, l, mid - 1, level + 1);
        } else if (values[mid] < key) {
            return findWithRecurse(values, key, mid + 1, r, level + 1);
        } else {
            return mid;
        }
    }
}
