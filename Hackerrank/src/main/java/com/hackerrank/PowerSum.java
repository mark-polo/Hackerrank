package com.hackerrank;

public class PowerSum {

    public static void main(String [] args) {
        System.out.println(powerSum(100, 2));
    }

    static int count;

    private static void helper(int x , int n , int sum , int currInt) {

        int power = (int) Math.pow(currInt, n);

        if(sum == x) {
            count++;
            return;
        }

        if (sum > x || power > x) return;

        helper(x, n, sum, currInt + 1);
        helper(x, n, sum+power, currInt + 1);

    }

    public static int powerSum(int X, int N) {
        count = 0;
        helper(X,N,0,1);
        return count;
    }
}
