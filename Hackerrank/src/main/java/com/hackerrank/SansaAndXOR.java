package com.hackerrank;

import java.util.ArrayList;
import java.util.List;

public class SansaAndXOR {
    public static void main(String [] args) {
        List<Integer> l = new ArrayList<>();
        l.add(4);
        l.add(5);
        l.add(7);
        l.add(5);

        System.out.println(sansaXor(l));
    }

    public static int sansaXor(List<Integer> arr) {
        int res = 0;

        if(arr.size() % 2 == 0) {
            return 0;
        } else {
            for (int i = 0; i < arr.size(); i+=2) {
                res ^= arr.get(i);
            }
        }

        return res;
    }
}
