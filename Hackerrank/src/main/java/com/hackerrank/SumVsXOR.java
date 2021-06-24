package com.hackerrank;

public class SumVsXOR {
    public static void main(String [] args) {
        System.out.println(sumXor(23562536));
    }

    public static long sumXor(long n) {
        int x;
        long count = 0;
        long resultSum;
        long resultXOR;

        for (x = 0; x < n; x++) {
            if(x <= n) {
                resultSum = n + x;
                resultXOR = n ^ x;

                if(resultSum == resultXOR) {
                    count++;
                }
            }
        }

        return count;
    }
}
