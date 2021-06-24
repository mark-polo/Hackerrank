package com.hackerrank;

import java.util.ArrayList;
import java.util.List;

public class LonelyInteger {
    public static void main(String [] args) {
        List<Integer> l = new ArrayList<>();
        l.add(4);
        l.add(4);
        l.add(5);
        l.add(5);
        l.add(3);

        System.out.println(lonelyinteger(l));

    }

    public static int lonelyinteger(List<Integer> a) {

        int res = 0;

        for(Integer i : a) {
            res = res ^ i;
        }
        return res;
    }
}
