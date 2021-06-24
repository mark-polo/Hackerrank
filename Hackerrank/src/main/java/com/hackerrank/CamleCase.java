package com.hackerrank;

public class CamleCase {
    public static void main(String [] args) {
        System.out.println(camelcase("saveChangesInTheEditor"));
    }

    public static int camelcase(String s) {
        int count = 1;
        for(int i = 0; i < s.length(); i++) {
            String l = Character.toString(s.charAt(i));
            if(l.equals(l.toUpperCase())) {
                count++;
            }
        }
        return count;
    }
}
