package com.hackerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MaximazingXOR {
    public static void main(String [] args) {
        System.out.println(maximizingXor(11, 100));
    }

    public static int maximizingXor(int l, int r) {

        int result , i , j;
        List<Integer> list = new ArrayList<>();

        for(i = l; i <= r; i++) {
            for (j = i; j <= r; j++) {
                result = i ^ j;
                list.add(result);
            }
        }

        return Collections.max(list);
    }
}
