package org.tym.practice.ch1;

/**
 * Created by tangym on 2016/11/3.
 */
public class Q_1_1_23 {

    public static void main(String[] args) {
        int a =36;
        int b = 24;
        System.out.println(gcd(a, b));
    }

    public static int gcd(int a, int b) {
        System.out.println("gcd(" + a + "," + b + ")");

        if (a > b) {
            if (b == 0) {
                return a;
            } else {
                int r = a % b;
                return gcd(b, r);
            }
        } else if (a < b) {
            return gcd(b, a);
        } else {
            return a;
        }

    }
}
