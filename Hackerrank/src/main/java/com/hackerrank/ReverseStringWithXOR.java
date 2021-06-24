package com.hackerrank;

public class ReverseStringWithXOR {
    public static void main(String [] args) {
        System.out.println(reverseStringWithXOR("hi my n"));
    }

    private static String reverseStringWithXOR(String s) {
        char[] arr = s.toCharArray();
        int l = arr.length;
        int h = (int) Math.floor(arr.length / 2);

        for (int i = 0; i < h; i++) {
            arr[i] ^= arr[l - i - 1];
            arr[l - i - 1] ^= arr[i];
            arr[i] ^= arr[l - i - 1];
        }

        return new String(arr);
    }
}
