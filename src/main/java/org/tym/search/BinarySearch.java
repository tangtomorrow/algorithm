package org.tym.search;

/**
 * Created by tangym on 2016/11/2.
 * 二分查找
 */
public class BinarySearch {

    /**
     * 循环实现
     *
     * @param values
     * @param key
     * @return
     */
    public static int find(int[] values, int key) {
        int l = 0;
        int r = values.length - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (values[mid] > key) {
                r = mid - 1;
            } else if (values[mid] < key) {
                l = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    /**
     * 递归实现
     *
     * @param values
     * @param key
     * @return
     */
    public static int findWithRecurse(int[] values, int key) {
        return findWithRecurse(values, key, 0, values.length - 1);
    }

    private static int findWithRecurse(int[] values, int key, int l, int r) {
        if (l > r) {
            return -1;
        }
        int mid = l + (r - l) / 2;
        if (values[mid] > key) {
            return findWithRecurse(values, key, l, mid - 1);
        } else if (values[mid] < key) {
            return findWithRecurse(values, key, mid + 1, r);
        } else {
            return mid;
        }
    }

}
