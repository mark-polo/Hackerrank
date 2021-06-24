package com.hackerrank;

public class FlippingBits {
    public static void main(String [] args) {
        System.out.println(flippingBits(2147483647));
    }

    public static long flippingBits(long n) {

        long maxInt=(long)Math.pow(2, 32)-1;

        return maxInt - n;

    }
}
