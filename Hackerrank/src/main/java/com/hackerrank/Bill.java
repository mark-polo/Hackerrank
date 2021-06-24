package com.hackerrank;

import java.util.ArrayList;
import java.util.List;

public class Bill {
    public static void main(String [] args) {
        List<Integer> l = new ArrayList<>();
        l.add(3);
        l.add(10);
        l.add(2);
        l.add(9);
        bonAppetit(l , 1, 7);
    }


    public static void bonAppetit(List<Integer> bill, int k, int b) {
        ArrayList<Integer> list = (ArrayList<Integer>) bill;
        list.remove(k);

        long sum = 0L;
        for (int i : list) {
            sum += i;
        }

        long b_actual = sum / 2;

        if(b_actual == b) {
            System.out.println("Bon Appetit");
        } else {
            System.out.println(b - b_actual);
        }

    }
}
