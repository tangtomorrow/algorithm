package org.tym.practice.ch1;

/**
 * Created by tangym on 2016/11/2.
 *
 * 将二维数组转置
 */
public class Q_1_1_13 {

    public static void main(String[] args) {
        int[][] a = new int[2][3];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j] = i * j + i;
            }
        }

        int[][] b = transfer(a);

        System.out.println("Before:");
        display(a);
        System.out.println("After:");
        display(b);
    }

    public static int[][] transfer(int[][] a) {
        if (a == null || a.length < 1 || a[0].length < 1) {
            return null;
        }
        int m = a.length;
        int n = a[0].length;

        int[][] b = new int[n][m];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                b[j][i] = a[i][j];
            }
        }

        return b;
    }

    public static void display(int[][] a) {
        if (a == null || a.length < 1 || a[0].length < 1) {
            return;
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }

    }
}
