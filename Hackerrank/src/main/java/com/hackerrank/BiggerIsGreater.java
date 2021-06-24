package com.hackerrank;

import java.util.Arrays;

public class BiggerIsGreater {
    public static void main(String [] args) {
        System.out.println(biggerIsGreater("dcba"));
    }

    public static String biggerIsGreater(String w) {
        char [] arr = w.toCharArray();
        int len = arr.length;
        int i;

        for(i = len - 1; i > 0; i--) {
            if(arr[i] > arr[i - 1]) {
                break;
            }
        }

        if(i == 0) {
            return "no answer";
        } else {

            int small = arr[i - 1], next = i;

            for(int j = i + 1; j < len; j++) {
                if(arr[j] > small && arr[j] < arr[next]) {
                    next = j;
                }
            }

            swap(arr, i - 1, next);
            Arrays.sort(arr, i , len);
        }

        return new String(arr);

    }

    static void swap(char[] arr, int i , int j) {
        char t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
}
