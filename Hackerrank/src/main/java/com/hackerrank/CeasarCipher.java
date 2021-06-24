package com.hackerrank;

public class CeasarCipher {
    public static void main(String [] args) {
        System.out.println(caesarCipher("middle-Outz", 2));
    }

    public static String caesarCipher(String s, int k) {

        String result = " ";

        for(int i = 0; i < s.length(); i++) {
            if(Character.isUpperCase(s.charAt(i))) {
                result += (char) (((int)s.charAt(i) + k - 65) % 26 + 65);
            } else if (Character.isLowerCase(s.charAt(i))) {
                result += (char) (((int) s.charAt(i) + k - 97) % 26 + 97);
            }
        }

        return result;

    }
}
