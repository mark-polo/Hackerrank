package com.hackerrank;

public class AndProduct {
    public static void main(String [] args) {
        System.out.println(andProduct(11 , 15));
    }

    public static long andProduct(long a, long b) {
        long result = a;
        for(long i = a; i <= b; i++) {
            result &= i;
        }
        return result;
    }
}
